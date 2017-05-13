package realestate.modeling

import scala.scalajs.js.JSApp

import org.scalajs.jquery.jQuery

object MainApp extends JSApp {

  def main(): Unit = {
    jQuery(() => setupUI())
    println("App started!")
  }

  def setupUI(): Unit = {
    jQuery("body").append("<p>Welcome!</p>")
    jQuery("""<button type="button">Analyze</button>""")
      .click(addAnalysis _)
      .appendTo(jQuery("body"))
  }

  def addAnalysis(): Unit = {
    jQuery("body").append("<p>Results!</p>")
  }

}
