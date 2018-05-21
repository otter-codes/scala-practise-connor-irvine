import org.scalatest._

class RomanNumbersSpec extends WordSpec with MustMatchers {

  "RomanNumbers" must {

    "return a value of '1' when given an input of 'I' into the number converter" in {
      RomanNumbers.numberConverter("I") mustEqual 1
    }
  }
}
