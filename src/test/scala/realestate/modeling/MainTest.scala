package realestate.modeling

import org.scalajs.jquery.jQuery
import utest._

object MainTest extends TestSuite {

  // Initialize App
  MainApp.setupUI()

  def tests = TestSuite {
    'Welcome {
      assert(jQuery("p:contains('Welcome!')").length == 1)
    }
    'ButtonClick {
      def messageCount = jQuery("p:contains('Results!')").length
      val button = jQuery("button:contains('Analyze')")

      assert(button.length == 1)
      assert(messageCount == 0)
      for (c <- 1 to 5) {
        button.click()
        assert(messageCount == c)
      }
    }
  }

}
