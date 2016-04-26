import org.junit.*;
import static org.junit.Assert.*;

public class TamasTest {

  @Test
  public void Tama_instantiatesCorrectly_true() {
    Tamas myTama = new Tamas("Rover");
    assertEquals(true, myTama instanceof Tamas);
  }

  @Test
  public void Tamas_instantiatesWithDescription_String() {
    Tamas myTama = new Tamas("Rover");
    assertEquals("Rover", myTama.getDescription());
  }
  // @Test
  // public void Tamas_inAlive_true() {
  //   Tamas myTama = new Tamas("");
  //   assertEquals("Rover", myTama.getDescription());
  // }


  @Test
  public void tamas_instantiatesCorrectly() {
    Tamas myTama = new Tamas("Rover");
    assertEquals("Rover", myTama.getDescription());
    assertEquals(10, myTama.getHealth());
    assertEquals(10, myTama.getFood());
    assertEquals(10, myTama.getMood());
    assertEquals(10, myTama.getEnergy());
  }

  @Test
  public void tamas_TimeReducesStatsTest() {
    Tamas myTama = new Tamas("Rover");
    myTama.timePasses();
    assertEquals("Rover", myTama.getDescription());
    assertEquals(10, myTama.getHealth());
    assertEquals(9, myTama.getFood());
    assertEquals(9, myTama.getMood());
    assertEquals(9, myTama.getEnergy());
  }


  @Test
  public void isAlive_HealthFoodMoodEnergy_Above0() {
    Tamas myTama = new Tamas("Rover");
    for (int i = 10; i > 0; i--) {
      myTama.timePasses();
    }
    assertEquals(false, myTama.isAlive());
  }

  @Test
  public void DecreaseAndIncreaseAllStatsExceptHealth() {
    Tamas myTama = new Tamas("Rover");
    for (int i = 5; i > 0; i--) {
      myTama.timePasses();
    }
    myTama.healTama();
    myTama.feedTama();
    myTama.petTama();
    myTama.sleepTama();
    assertEquals(10, myTama.getHealth());
    assertEquals(6, myTama.getFood());
    assertEquals(6, myTama.getMood());
    assertEquals(6, myTama.getEnergy());
  }

  @Test
  public void DecreaseAndIncreaseHealth() {
    Tamas myTama = new Tamas("Rover");
    for (int i = 9; i > 0; i--) {
      myTama.timePasses();
    }
    myTama.healTama();
    assertEquals(8, myTama.getHealth());
    assertEquals(1, myTama.getFood());
    assertEquals(1, myTama.getMood());
    assertEquals(1, myTama.getEnergy());
  }
}
