import com.daml.nonempty.NonEmpty
import com.digitalasset.canton.console.LocalInstanceReference

def nodeInit(node: LocalInstanceReference): Unit = {

  val NODE_NAME = "mediator1"

  // Create namespace key
  val namespaceKey = node.keys.secret.generate_signing_key(
    s"${NODE_NAME}-namespace",
    usage = SigningKeyUsage.NamespaceOnly,
  )

  node.health.wait_for_ready_for_id()

  // Initialize mediator ID
  node.topology.init_id_from_uid(
    UniqueIdentifier.tryCreate(NODE_NAME, namespaceKey.fingerprint)
  )

  node.health.wait_for_ready_for_node_topology()

  // Namespace delegation
  node.topology.namespace_delegations.propose_delegation(
    Namespace(namespaceKey.fingerprint),
    namespaceKey,
    CanSignAllMappings,
  )

  // Protocol signing key
  val protocolSigningKey = node.keys.secret.generate_signing_key(
    s"${NODE_NAME}-protocol",
    usage = SigningKeyUsage.ProtocolOnly,
  )

  // Sequencer authentication key
  val sequencerAuthKey = node.keys.secret.generate_signing_key(
    s"${NODE_NAME}-sequencer-auth",
    usage = SigningKeyUsage.SequencerAuthenticationOnly,
  )

  val keys = NonEmpty(Seq, protocolSigningKey, sequencerAuthKey)

  // Register keys
  node.topology.owner_to_key_mappings.propose(
    member = node.id.member,
    keys = keys,
    signedBy = Seq(
      namespaceKey.fingerprint,
      protocolSigningKey.fingerprint,
      sequencerAuthKey.fingerprint,
    ),
  )

  //node.health.wait_for_ready_for_initialization()

  println("Mediator initialization complete")
}

def main() = nodeInit(mediator)