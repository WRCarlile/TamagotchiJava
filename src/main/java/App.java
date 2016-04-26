import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");

      get("/", (req, res) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        // model.put("tamas", request.session().attribute("tamas"));
        model.put("template", "templates/index.vtl");
        return new ModelAndView(model, "templates/layout.vtl");
      }, new VelocityTemplateEngine());

      post("/tamas", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();

        String description = request.queryParams("description");
        Tamas newTama = new Tamas(description);
        request.session().attribute("tamas", newTama);
        model.put("food", newTama.getFood());
        model.put("mood", newTama.getMood());
        model.put("energy", newTama.getEnergy());
        model.put("health", newTama.getHealth());
        model.put("isAlive", newTama.isAlive());


        model.put("template", "templates/success.vtl");
        return new ModelAndView(model, "templates/layout.vtl");
      }, new VelocityTemplateEngine());

      post("/food", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();

        Tamas newTama = request.session().attribute("description");
        newTama.getFood();
        // request.session().attribute("tamas", );
        Tamas newTama = new Tamas(description);
        model.put("food", newTama.getFood());
        model.put("mood", newTama.getMood());
        model.put("energy", newTama.getEnergy());
        model.put("health", newTama.getHealth());
        model.put("isAlive", newTama.isAlive());

        model.put("template", "templates/success.vtl");
        return new ModelAndView(model, "templates/layout.vtl");
      }, new VelocityTemplateEngine());


  }
}
