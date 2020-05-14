/*
Lina Breunlin
Module 04 Programming Project
Part B

This is a subclass file for DemoGearedVehicles. It contains the template to create
objects of the motorcycle subclass which implement the iGearedVehicle interface
*/

package demogearedvehicles;

public class Motorcycle implements iGearedVehicle
{
  private int motoNumGears;
  private int motoCurrentGear;
  private int motoCurrentSpeed;

  /**sets the number of gears on the motorcycle
  * @param mNumGears
  */   
  public void setNumGears (int mNumGears)
  {
    this.motoNumGears = mNumGears;
  }

  /**sets the current gear of the motorcycle
  * @param mCurrentGear
  */
  public void setCurrentGear (int mCurrentGear)
  {
    this.motoCurrentGear = mCurrentGear;
  }
    
 /**sets current speed of the motorcycle
 * @param mCurrentSpeed
 */   
  public void setCurrentSpeed (int mCurrentSpeed)
  {
    //declare variables
    final int MAX_SPEED = 80; //mph
    final int MIN_SPEED = 0; 
    
    if (mCurrentSpeed >= 20)
    {    
        this.motoCurrentSpeed = MAX_SPEED;
    }
    else if (mCurrentSpeed <= MIN_SPEED)
    {
        this.motoCurrentSpeed = MIN_SPEED;
    }
    else
    {
        this.motoCurrentSpeed = mCurrentSpeed;
    }
  }
  
  /**
  gets current value of numGears
  @return motoNumGears
  */
  public int getNumGears()
  {
    return this.motoNumGears;
  }
    
  /**
  gets current value of currentGear
  @return currentGear
  */
  public int getCurrentGear()
  {
    return this.motoCurrentGear;
  }
    
  /**
  gets current value of currentSpeed
  @return motoCurrentSpeed
  */
  public int getCurrentSpeed()
  {
    return motoCurrentSpeed;
  }

@Override
  public int shiftUp()
  {
      //declare variables
      int MAX_GEARS = motoNumGears; 
      final int UPSHIFT_INCREMENT = 1;
      
      if (motoCurrentGear == MAX_GEARS)
      {
          this.motoCurrentGear = MAX_GEARS; // you cannot shift into a highter gear than the motorcycle has
      }
      else
      {
        this.motoCurrentGear = this.motoCurrentGear + UPSHIFT_INCREMENT;
      }
      return this.motoCurrentGear;
      
  }
  
@Override
  public int downShift()
  {
      //declare variables
      final int LOWEST_GEAR = 1;
      final int DOWNSHIFT_INCREMENT = 1;
      
      if (this.motoCurrentGear == LOWEST_GEAR) //if you are in the lowest gear you can't go any lower
      {
          this.motoCurrentGear = LOWEST_GEAR;
      }
      else
      {
          this.motoCurrentGear = this.motoCurrentGear - DOWNSHIFT_INCREMENT; //if you aren't in the lowest gear you can downshift
      }
      return this.motoCurrentGear;
  }
  
  @Override
  public int speedUp ()
  {
      //declare variables
      final int MAX_SPEED = 80; //mph
      final int SPEED_INCREASE = 10;
      
      if (this.motoCurrentSpeed >= MAX_SPEED)
      {
          this.motoCurrentSpeed = MAX_SPEED; //can't go faster than the max speed
      }
      else
      {
        this.motoCurrentSpeed = this.motoCurrentSpeed + SPEED_INCREASE;
      } 
      return this.motoCurrentSpeed;
}
  
  @Override
  //public void slowDown()
  public int slowDown()
  {
      //declare variables
      final int SPEED_DECREASE = 10; //mph
      
      if (this.motoCurrentSpeed <= 0) //can't go less than 0 mph
      {
          this.motoCurrentSpeed = 0;
      }
      else
      {
          this.motoCurrentSpeed = this.motoCurrentSpeed - SPEED_DECREASE; //as long as you are not going 0 you can slow down
      }
      return this.motoCurrentSpeed;
      
  }
  
  @Override
  public String toString()
  {
      String motoInfo;
      
      motoInfo = "Current Gear: " + this.motoCurrentGear + " | " + "Current Speed: " + " " + this.motoCurrentSpeed;
      return motoInfo;
  }
  
  /**
  motorcycle constructor 
  @param mNumGears = the number of gears on the motorcycle
  @param mCurrentGears = the current gear of the motorcycle
  @param mCurrentSpeed = the current speed of the motorcycle
  **/
  
  public Motorcycle (int mNumGears, int mCurrentGears, int mCurrentSpeed)
  {
      this.motoNumGears = mNumGears;
      this.motoCurrentGear = mCurrentGears;
      this.motoCurrentSpeed = mCurrentSpeed;
  }
    
}
