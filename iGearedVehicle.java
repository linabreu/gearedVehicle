/*
Lina Breunlin
Module 04 Programming Project
Part B

This is an interface file for DemoGearedVehicles. It contains information about how iGearedVehicle objects will behave
 */

package demogearedvehicles;


public interface iGearedVehicle 
{
    public abstract int shiftUp();
    public abstract int downShift();
    public abstract int speedUp();
    public abstract int slowDown();
}
