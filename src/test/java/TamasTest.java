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
    for (int i = 10; i > 0; i++) {
      myTama.timePasses();
    }
    assertEquals(false, myTama.isAlive());
  }
  //
  // @Test
  // public void isAlive_foodBelow1_false() {
  //   Tamagotchi myPet = new Tamagotchi("lil dragon");
  //   myPet.setFoodLevel() // make a method that will change the food level of your Tamagotchi
  //   assertEquals(false, myPet.isAlive());
  // }

}
