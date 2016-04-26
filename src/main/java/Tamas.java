
public class Tamas {
  private String mDescription;
  public static final int MAX_HEALTH = 10;
  public static final int MAX_FOOD = 10;
  public static final int MAX_MOOD = 10;
  public static final int MAX_ENERGY = 10;
  private boolean mAlive;
  private int mHealth;
  private int mFood;
  private int mMood;
  private int mEnergy;
  private int mTime;

  public Tamas(String description) {
    mDescription = description;
    mAlive = true;
    mFood = MAX_FOOD;
    mMood = MAX_MOOD;
    mEnergy = MAX_ENERGY;
    mHealth = MAX_HEALTH;
  }
  public String getDescription() {
    return mDescription;
  }
  public int getHealth() {
    return mHealth;
  }
  public int getFood() {
    return mFood;
  }
  public int getMood() {
    return mMood;
  }
  public int getEnergy() {
    return mEnergy;
  }

  public void timePasses() {
    mFood --;
    mMood --;
    mEnergy --;
    if (mFood + mMood + mEnergy <= 10) {
      mHealth -= 1;
    }
    if (mFood == 0 || mMood == 0 || mEnergy == 0 || mHealth == 0) {
      mAlive = false;
    }
  }

  public boolean isAlive() {
    return mAlive;
  }

  public void healTama() {
    if (mHealth < MAX_HEALTH) {
      mHealth ++;
    } else {
      System.out.println("Health Full");
    }
  }

  public void feedTama() {
    if (mFood < MAX_FOOD) {
      mFood ++;
    } else {
      System.out.println("Food Full");
    }
  }

  public void petTama() {
    if (mMood < MAX_MOOD) {
      mMood ++;
    } else {
      System.out.println("Mood Full");
    }
  }

  public void sleepTama() {
    if (mEnergy < MAX_ENERGY) {
      mEnergy ++;
    } else {
      System.out.println("Energy Full");
    }
  }

}
