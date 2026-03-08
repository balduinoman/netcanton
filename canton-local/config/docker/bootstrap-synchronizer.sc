def main() = {

  println("BOOTSTRAP SCRIPT EXECUTING")

  bootstrap.synchronizer(
    synchronizerName = "da",
    sequencers = Seq(sequencer),
    mediators = Seq(mediator),
    synchronizerOwners = Seq(sequencer),
    synchronizerThreshold = PositiveInt.one,
    staticSynchronizerParameters =
      StaticSynchronizerParameters.defaultsWithoutKMS(ProtocolVersion.forSynchronizer)
  )

}

main()