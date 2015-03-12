
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
object Main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
  <head>
    <title>Play Responsive Kamanu</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

      <!--  Load site-specific customizations after bootstrap. -->
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.at("stylesheets/main.css")),format.raw/*12.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.55*/routes/*13.61*/.Assets.at("images/favicon.png")),format.raw/*13.93*/("""">

      <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
      <!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.js"></script>
        <![endif]-->
  </head>
  <body>

      <!-- Responsive navbar -->
    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <!--  Display three horizontal lines when navbar collapsed. -->
            <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#"><img src=""""),_display_(/*31.55*/routes/*31.61*/.Assets.at("images/header-logo.jpg")),format.raw/*31.97*/(""""></a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href=""""),_display_(/*35.27*/routes/*35.33*/.Application.index()),format.raw/*35.53*/("""">Store</a></li>
            <li><a href=""""),_display_(/*36.27*/routes/*36.33*/.Application.Pueo()),format.raw/*36.52*/("""">Pueo</a></li>
            <li><a href=""""),_display_(/*37.27*/routes/*37.33*/.Application.Aukahi()),format.raw/*37.54*/("""">Aukahi</a></li>
            <li><a href=""""),_display_(/*38.27*/routes/*38.33*/.Application.Kamanu()),format.raw/*38.54*/("""">Kamanu V6</a></li>
            <li><a href=""""),_display_(/*39.27*/routes/*39.33*/.Application.index()),format.raw/*39.53*/("""">Iho</a></li>
            <li class="last"><a href=""""),_display_(/*40.40*/routes/*40.46*/.Application.About()),format.raw/*40.66*/("""">About</a></li>
          </ul>
        </div>
      </div>
    </div>

    """),_display_(/*46.6*/content),format.raw/*46.13*/("""
      """),format.raw/*47.7*/("""<!-- Load Bootstrap JavaScript components. -->
    <script src="http://code.jquery.com/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
  </body>
</html>
"""))}
  }

  def render(page:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(page)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (page) => (content) => apply(page)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 14:16:58 HST 2015
                  SOURCE: /Users/SixDays/Documents/playresponsivekamanu-1/app/views/Main.scala.html
                  HASH: b9e73d563c9471fd0a91d4baa84d56229268392f
                  MATRIX: 727->1|844->30|872->32|1270->403|1285->409|1340->443|1424->500|1439->506|1492->538|2418->1437|2433->1443|2490->1479|2650->1612|2665->1618|2706->1638|2776->1681|2791->1687|2831->1706|2900->1748|2915->1754|2957->1775|3028->1819|3043->1825|3085->1846|3159->1893|3174->1899|3215->1919|3296->1973|3311->1979|3352->1999|3456->2077|3484->2084|3518->2091
                  LINES: 26->1|29->1|31->3|40->12|40->12|40->12|41->13|41->13|41->13|59->31|59->31|59->31|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|74->46|74->46|75->47
                  -- GENERATED --
              */
          