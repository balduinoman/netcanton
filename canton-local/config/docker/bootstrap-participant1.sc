import com.daml.nonempty.NonEmpty
import com.digitalasset.canton.console.LocalInstanceReference

def main() = {

  participant1.synchronizers.connect(
    "da",
    "http://sequencer:5008"
  )
  
  println(participant1.health.status)
}

main()