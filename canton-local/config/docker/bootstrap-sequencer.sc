import com.daml.nonempty.NonEmpty

def main() = {

  val NODE_NAME = "sequencer1"

  val namespaceKey = sequencer.keys.secret.generate_signing_key(
    s"${NODE_NAME}-namespace",
    usage = SigningKeyUsage.NamespaceOnly,
  )

  sequencer.health.wait_for_ready_for_id()

  sequencer.topology.init_id_from_uid(
    UniqueIdentifier.tryCreate(NODE_NAME, namespaceKey.fingerprint)
  )

  sequencer.health.wait_for_ready_for_node_topology()

  sequencer.topology.namespace_delegations.propose_delegation(
    Namespace(namespaceKey.fingerprint),
    namespaceKey,
    CanSignAllMappings,
  )

  val protocolSigningKey = sequencer.keys.secret.generate_signing_key(
    s"${NODE_NAME}-protocol",
    usage = SigningKeyUsage.ProtocolOnly,
  )

  val sequencerAuthKey = sequencer.keys.secret.generate_signing_key(
    s"${NODE_NAME}-sequencer-auth",
    usage = SigningKeyUsage.SequencerAuthenticationOnly,
  )

  val keys = NonEmpty(Seq, protocolSigningKey, sequencerAuthKey)

  sequencer.topology.owner_to_key_mappings.propose(
    member = sequencer.id.member,
    keys = keys,
    signedBy = Seq(
      namespaceKey.fingerprint,
      protocolSigningKey.fingerprint,
      sequencerAuthKey.fingerprint,
    ),
  )

  sequencer.health.wait_for_ready_for_initialization()

  println("Sequencer initialization complete")
}	