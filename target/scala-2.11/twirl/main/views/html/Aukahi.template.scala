
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object Aukahi extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/Main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
    """),format.raw/*4.5*/("""<div class="aukahi-padding"></div>

    <div class="tagline-bar"><h2>The Aukahi: Tahitian V1 design with Hawaiian attitude.</h2></div>
""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 14:09:51 HST 2015
                  SOURCE: /Users/SixDays/Documents/playresponsivekamanu-1/app/views/Aukahi.scala.html
                  HASH: c10ff8deefafc4060fe421a404fc011b5a9d2e34
                  MATRIX: 724->1|829->18|857->21|877->33|916->35|947->40
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4
                  -- GENERATED --
              */
          