import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Tamas You've Been");
  }

//   @Test
//   public void tamaIsCreatedTest() {
//     goTo("http://localhost:4567/");
//     fill("#description").with("Portland, OR");
//     submit(".btn");
//     assertThat(pageSource()).contains("Your tama has been saved.");
//   }
//   @Test
//   public void tamaIsDisplayedTest() {
//     goTo("http://localhost:4567/");
//     fill("#description").with("Portland, OR");
//     submit(".btn");
//     click("a", withText("Go Back"));
//     assertThat(pageSource()).contains("Portland, OR");
//   }
//   @Test
//   public void multipleTamasAreDisplayedTest() {
//     goTo("http://localhost:4567/");
//     fill("#description").with("Portland, OR");
//     submit(".btn");
//     click("a", withText("Go Back"));
//     fill("#description").with("Seattle, WA");
//     submit(".btn");
//     click("a", withText("Go Back"));
//     assertThat(pageSource()).contains("Portland, OR");
//     assertThat(pageSource()).contains("Seattle, WA");
//   }
}
