package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Pueo;
import views.html.Aukahi;
import views.html.Kamanu;
import views.html.About;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   *
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  public static Result Pueo() {
    return ok(Pueo.render("Welcome to the Pueo page."));
  }

  public static Result Aukahi() {
    return ok(Aukahi.render("Welcome to the Aukahi page."));
  }

  public static Result Kamanu() {
    return ok(Kamanu.render("Welcome to the Kamanu page."));
  }

  public static Result About() {
    return ok(About.render("Welcome to the About page."));
  }

}
