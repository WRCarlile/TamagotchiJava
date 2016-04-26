import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {


    // staticFileLocation("/public");
    //
    //   get("/", (request, response) -> {
    //     Map<String, Object> model = new HashMap<String, Object>();
    //     model.put("tamas", request.session().attribute("tamas"));
    //     model.put("template", "templates/index.vtl");
    //     return new ModelAndView(model, "templates/layout.vtl");
    //   }, new VelocityTemplateEngine());
    //
    //   post("/tamas", (request, response) -> {
    //     Map<String, Object> model = new HashMap<String, Object>();
    //
    //     ArrayList<Tamas> tamas = request.session().attribute("tamas");
    //     if (tamas == null) {
    //       tamas = new ArrayList<Tamas>();
    //       request.session().attribute("tamas", tamas);
    //     }
    //
    //     String description = request.queryParams("description");
    //     Tamas newTama = new Tamas(description);
    //     tamas.add(newTama);
    //     // request.session().attribute("tamas",newTama);
    //
    //     model.put("template", "templates/success.vtl");
    //     return new ModelAndView(model, "templates/layout.vtl");
    //   }, new VelocityTemplateEngine());
  }



}
