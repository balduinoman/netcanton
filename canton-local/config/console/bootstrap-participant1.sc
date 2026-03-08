import com.daml.nonempty.NonEmpty
import com.digitalasset.canton.console.LocalInstanceReference

def main() = {

  def participantInit(node: LocalInstanceReference): Unit = {

    val NODE_NAME = "participant1"

    // Namespace key
    val namespaceKey =
      node.keys.secret.generate_signing_key(
        name = s"${NODE_NAME}-namespace",
        SigningKeyUsage.NamespaceOnly,
      )

    // Sequencer authentication key
    val sequencerAuthKey =
      node.keys.secret.generate_signing_key(
        name = s"${NODE_NAME}-sequencer-auth",
        SigningKeyUsage.SequencerAuthenticationOnly,
      )

    // Protocol signing key
    val signingKey =
      node.keys.secret.generate_signing_key(
        name = s"${NODE_NAME}-protocol",
        SigningKeyUsage.ProtocolOnly,
      )

    // Encryption key
    val encryptionKey =
      node.keys.secret.generate_encryption_key(
        name = s"${NODE_NAME}-encryption"
      )

    val namespace = Namespace(namespaceKey.id)

    // Initialize participant ID
    node.topology.init_id_from_uid(
      UniqueIdentifier.tryCreate("manual-participant1", namespace)
    )

    // Wait for topology readiness
    node.health.wait_for_ready_for_node_topology()

    // Self-signed root namespace delegation
    node.topology.namespace_delegations.propose_delegation(
      namespace,
      namespaceKey,
      CanSignAllMappings,
    )

    // Assign keys to participant
    node.topology.owner_to_key_mappings.propose(
      member = node.id.member,
      keys = NonEmpty(Seq, sequencerAuthKey, signingKey, encryptionKey),
      signedBy = Seq(
        namespaceKey.fingerprint,
        sequencerAuthKey.fingerprint,
        signingKey.fingerprint,
      ),
    )

    node.health.wait_for_initialized()
  }

  logger.info("=== init participant1 ===")

  participantInit(participant1)

  logger.info("=== participant1 initialized ===")
  logger.info("=== connecting to synchronizer ===")

  participant1.synchronizers.connect(
    "da",
    "http://localhost:5008"
  )

  logger.info("=== finished connecting to synchronizer ===")

  participant1.health.ping(participant1)

  logger.info("=== finishing participant1 bootstrap ===")
}