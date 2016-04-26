
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
    mHealth ++;
  }

  public void feedTama() {
    mFood ++;
  }

  public void petTama() {
    mMood ++;
  }

  public void sleepTama() {
    mEnergy ++;
  }


  // public boolean isAlive() {
  //   return mAlive == 0;
  // }
  // public void load(); {
  //   load(MAX_HEALTH);
  // }
  // public void load(int life); {
  //   mHealth += life;
  // }


//   public setHunger(String hunger) {
//     mHunger = hunger;
//     return mHunger;
//   }
//
//   public setHappiness(String happiness) {
//     mHappiness = happiness;
//   }
//
//   public void drive() {
//     drive(1);
//   }
//
//   public void drive(int laps) {
//     // Other driving code omitted for clarity purposes
//     mBarsCount -= laps;
//   }
//
//   public void charge() {
//     while (!isFullyCharged()) {
//       mBarsCount++;
//     }
//   }
//
//   public boolean isBatteryEmpty() {
//     return mBarsCount == 0;
//   }
//
//   public boolean isFullyCharged() {
//     return mBarsCount == MAX_BARS;
//   }
//
// }

}
