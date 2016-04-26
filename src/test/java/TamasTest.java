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
  //
  // @Test
  // public void tamagotchi_instantiatesCorrectly() {
  //   Tamagotchi myPet = new Tamagotchi("lil dragon");
  //   assertEquals("lil dragon", myPet.getName());
  //   assertEquals(10, myPet.getFoodLevel());
  //   assertEquals(10, myPet.getSleepLevel());
  //   assertEquals(10, myPet.getActivityLevel());
  // }
  //
  // @Test
  // public void timePasses_foodDecreasesByOne_9() {
  //   Tamagotchi myPet = new Tamagotchi("lil dragon");
  //   myPet.timePasses();
  //   assertEquals(9, myPet.getFoodLevel());
  // }
  //
  // @Test
  // public void isAlive_foodLevelAbove0_true() {
  //   Tamagotchi myPet = new Tamagotchi("lil dragon");
  //   assertEquals(true, myPet.isAlive());
  // }
  //
  // @Test
  // public void isAlive_foodBelow1_false() {
  //   Tamagotchi myPet = new Tamagotchi("lil dragon");
  //   myPet.setFoodLevel() // make a method that will change the food level of your Tamagotchi
  //   assertEquals(false, myPet.isAlive());
  // }

}
