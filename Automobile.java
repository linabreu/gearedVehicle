/*
Lina Breunlin
Module 04 Programming Project
Part B

This is a subclass file for DemoGearedVehicles. It contains the template to create
objects of the autombile subclass which implement the iGearedVehicle interface
*/

package demogearedvehicles;


public class Automobile implements iGearedVehicle
{
  private int autoNumGears;
  private int autoCurrentGear;
  private int autoCurrentSpeed;

  /**sets the number of gears on the automobile
  * @param aNumGears
  */   
  public void setNumGears (int aNumGears)
  {
    this.autoNumGears = aNumGears;
  }

  /**sets the current gear of the automobile
  * @param aCurrentGear
  */
  public void setCurrentGear (int aCurrentGear)
  {
    this.autoCurrentGear = aCurrentGear;
  }
    
 /**sets current speed of the automobile
 * @param aCurrentSpeed
 */   
  public void setCurrentSpeed (int aCurrentSpeed)
  {
    //declare variables
    final int MAX_SPEED = 120; //mph
    final int MIN_SPEED = 0; 
    
    if (aCurrentSpeed >= 20)
    {    
        this.autoCurrentSpeed = MAX_SPEED;
    }
    else if (aCurrentSpeed <= MIN_SPEED)
    {
        this.autoCurrentSpeed = MIN_SPEED;
    }
    else
    {
        this.autoCurrentSpeed = aCurrentSpeed;
    }
  }
  
  /**
  gets current value of numGears
  @return motoNumGears
  */
  public int getNumGears()
  {
    return this.autoNumGears;
  }
    
  /**
  gets current value of currentGear
  @return currentGear
  */
  public int getCurrentGear()
  {
    return this.autoCurrentGear;
  }
    
  /**
  gets current value of currentSpeed
  @return motoCurrentSpeed
  */
  public int getCurrentSpeed()
  {
    return autoCurrentSpeed;
  }

@Override
  public int shiftUp()
  {
      //declare variables
      int MAX_GEARS = autoNumGears;
      final int UPSHIFT_INCREMENT = 1;
      
      if (autoCurrentGear == MAX_GEARS)
      {
          this.autoCurrentGear = MAX_GEARS;
      }
      else
      {
        this.autoCurrentGear = this.autoCurrentGear+ UPSHIFT_INCREMENT;
      }
      return this.autoCurrentGear;
      
  }
  
@Override
  public int downShift()
  {
      //declare variables
      final int LOWEST_GEAR = 1;
      final int DOWNSHIFT_INCREMENT = 1;
      
      if (this.autoCurrentGear == LOWEST_GEAR)
      {
          this.autoCurrentGear = LOWEST_GEAR;
      }
      else
      {
          this.autoCurrentGear = this.autoCurrentGear - DOWNSHIFT_INCREMENT;
      }
      return this.autoCurrentGear;
  }
  
  @Override
  public int speedUp ()
  {
      //declare variables
      final int MAX_SPEED = 120;
      final int SPEED_INCREASE = 15;
      
      if (this.autoCurrentSpeed >= MAX_SPEED)
      {
          this.autoCurrentSpeed = MAX_SPEED;
      }
      else
      {
        this.autoCurrentSpeed = this.autoCurrentSpeed + SPEED_INCREASE;
      }
      return this.autoCurrentSpeed;
}
  
  @Override
  //public void slowDown()
  public int slowDown()
  {
      //declare variables
      final int SPEED_DECREASE = 15;
      
      if (this.autoCurrentSpeed <= 0)
      {
          this.autoCurrentSpeed = 0;
      }
      else
      {
          this.autoCurrentSpeed = this.autoCurrentSpeed - SPEED_DECREASE;
      }
      return this.autoCurrentSpeed;
  }
  
  @Override
  public String toString()
  {
      String autoInfo;
      
      autoInfo = "Current Gear: " + this.autoCurrentGear + " | " + "Current Speed: " + " " + this.autoCurrentSpeed;
      return autoInfo;
  }
  
  /**
  automobile constructor 
  @param aNumGears = the number of gears
  @param aCurrentGears = the current gear
  @param aCurrentSpeed = the current speed
  **/
  
  public Automobile (int aNumGears, int aCurrentGears, int aCurrentSpeed)
  {
      this.autoNumGears = aNumGears;
      this.autoCurrentGear = aCurrentGears;
      this.autoCurrentSpeed = aCurrentSpeed;
  }   
}
