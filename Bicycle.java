/*
Lina Breunlin
Module 04 Programming Project
Part B

This is a subclass file for DemoGearedVehicles. It contains the template to create
objects of the bicycle subclass which implement the iGearedVehicle interface
 */
package demogearedvehicles;


public class Bicycle implements iGearedVehicle
{
  private int bikeNumGears;
  private int bikeCurrentGear;
  private int bikeCurrentSpeed;

  /**sets the number of gears on the bike
  * @param bNumGears
  */   
  public void setNumGears (int bNumGears)
  {
    this.bikeNumGears = bNumGears;
  }

  /**sets the current gear of the bike
  * @param bCurrentGear
  */
  public void setCurrentGear (int bCurrentGear)
  {
    this.bikeCurrentGear = bCurrentGear;
  }
    
 /**sets current speed of the bike
 * @param bCurrentSpeed
 */   
  public void setCurrentSpeed (int bCurrentSpeed)
  {
    //declare variables
    final int MAX_SPEED = 20;
    final int MIN_SPEED = 0; 
    
    if (bCurrentSpeed >= 20)
    {    
        this.bikeCurrentSpeed = MAX_SPEED;
    }
    else if (bCurrentSpeed <= MIN_SPEED)
    {
        this.bikeCurrentSpeed = MIN_SPEED;
    }
    else
    {
        this.bikeCurrentSpeed = bCurrentSpeed;
    }
  }
  
  /**
  gets current value of numGears
  @return numGears
  */
  public int getNumGears()
  {
    return this.bikeNumGears;
  }
    
  /**
  gets current value of currentGear
  @return currentGear
  */
  public int getCurrentGear()
  {
    return this.bikeCurrentGear;
  }
    
  /**
  gets current value of currentSpeed
  @return currentSpeed
  */
  public int getCurrentSpeed()
  {
    return bikeCurrentSpeed;
  }

@Override
  public int shiftUp()
  {
     //declare variables
      int MAX_GEARS = bikeNumGears;
      final int UPSHIFT_INCREMENT = 1;
      
      if (bikeCurrentGear == MAX_GEARS) //you cant shift into a higher gear than the bike has
      {
          this.bikeCurrentGear = MAX_GEARS;
      }
      else
      {
        this.bikeCurrentGear = this.bikeCurrentGear + UPSHIFT_INCREMENT; //if you arent at the highest gear you can shift up
      }
      return this.bikeCurrentGear;
      
      
  }
  
@Override
  public int downShift()
  {
      //declare variables
      final int LOWEST_GEAR = 1; //1 is the lowest gear. Cant go lower
      int DOWNSHIFT_INCREMENT = 1;
      
      if (this.bikeCurrentGear == LOWEST_GEAR) 
      {
          this.bikeCurrentGear = LOWEST_GEAR;
      }
      else
      {
          this.bikeCurrentGear = this.bikeCurrentGear - DOWNSHIFT_INCREMENT;
      }
      return this.bikeCurrentGear;
  }
  
  @Override
  public int speedUp ()
  {
      //declare variables
      final int MAX_SPEED = 20; //this would be in mph
      final int SPEED_INCREASE = 2;
      
      if (this.bikeCurrentSpeed >= MAX_SPEED)
      {
          this.bikeCurrentSpeed = MAX_SPEED;
      }
      else
      {
        this.bikeCurrentSpeed = this.bikeCurrentSpeed + SPEED_INCREASE;
      }  
      return this.bikeCurrentSpeed;
   }
  
  @Override
  public int slowDown()
  {
      //declare variables
      final int SPEED_DECREASE = 2;
      
      if (this.bikeCurrentSpeed <= 0) //can't go less than 0 miles per hour
      {
          this.bikeCurrentSpeed = 0;
      }
      else
      {
          this.bikeCurrentSpeed = this.bikeCurrentSpeed - SPEED_DECREASE;
      }
      return this.bikeCurrentSpeed;
      
  }
  
  @Override
  public String toString()
  {
      String bicycleInfo;
      
      bicycleInfo = "Current Gear: " + this.bikeCurrentGear + " | " + "Current Speed: " + " " + this.bikeCurrentSpeed;
      return bicycleInfo;
  }
  
  /**
  Bicycle constructor 
  @param bNumGears = the number of gears on the bike
  @param bCurrentGear = the gear the bike is currently in
  @param bCurrentSpeed = the speed the bike is currently going
  **/
  
  public Bicycle(int bNumGears, int bCurrentGear, int bCurrentSpeed)
  {
      bikeNumGears = bNumGears;
      bikeCurrentGear = bCurrentGear;
      bikeCurrentSpeed = bCurrentSpeed;
  }

}
