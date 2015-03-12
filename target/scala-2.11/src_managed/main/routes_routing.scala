// @SOURCE:/Users/SixDays/Documents/playresponsivekamanu-1/conf/routes
// @HASH:9622b943f86f761c16677734b1a894126bba6f2d
// @DATE:Wed Mar 11 14:15:38 HST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_Pueo1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Pueo"))))
private[this] lazy val controllers_Application_Pueo1_invoker = createInvoker(
controllers.Application.Pueo(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Pueo", Nil,"GET", """""", Routes.prefix + """Pueo"""))
        

// @LINE:8
private[this] lazy val controllers_Application_Aukahi2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Aukahi"))))
private[this] lazy val controllers_Application_Aukahi2_invoker = createInvoker(
controllers.Application.Aukahi(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Aukahi", Nil,"GET", """""", Routes.prefix + """Aukahi"""))
        

// @LINE:9
private[this] lazy val controllers_Application_Kamanu3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Kamanu"))))
private[this] lazy val controllers_Application_Kamanu3_invoker = createInvoker(
controllers.Application.Kamanu(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "Kamanu", Nil,"GET", """""", Routes.prefix + """Kamanu"""))
        

// @LINE:10
private[this] lazy val controllers_Application_About4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("About"))))
private[this] lazy val controllers_Application_About4_invoker = createInvoker(
controllers.Application.About(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "About", Nil,"GET", """""", Routes.prefix + """About"""))
        

// @LINE:13
private[this] lazy val controllers_Assets_at5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Pueo""","""controllers.Application.Pueo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Aukahi""","""controllers.Application.Aukahi()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Kamanu""","""controllers.Application.Kamanu()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """About""","""controllers.Application.About()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_Pueo1_route(params) => {
   call { 
        controllers_Application_Pueo1_invoker.call(controllers.Application.Pueo())
   }
}
        

// @LINE:8
case controllers_Application_Aukahi2_route(params) => {
   call { 
        controllers_Application_Aukahi2_invoker.call(controllers.Application.Aukahi())
   }
}
        

// @LINE:9
case controllers_Application_Kamanu3_route(params) => {
   call { 
        controllers_Application_Kamanu3_invoker.call(controllers.Application.Kamanu())
   }
}
        

// @LINE:10
case controllers_Application_About4_route(params) => {
   call { 
        controllers_Application_About4_invoker.call(controllers.Application.About())
   }
}
        

// @LINE:13
case controllers_Assets_at5_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     