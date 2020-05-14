/*
Lina Breunlin
Module 04 Programming Project
Part B

This program demostraes the use of the iGearedVehicle interface and its subclasses and thier methods using an array list

test cases:

testBike properties: 21 gears, in gear 7, going 15mph

output:
Current Gear: 7 | Current Speed:  15
You have slowed down! New speed is: 13  *subtraced 2mph per the method
You have sped up! New speed is: 15 *added 2 mph per the method
You have shifted up! New gear is: 8 *shifted up 1 gear per the method
You have shifted down! New gear is: 7 *shifted down 1 gear per the method

testMoto properties: 6 gears, in gear 3, going 40mph

output:
Current Gear: 3 | Current Speed:  40
You have slowed down! New speed is: 30 *subtraced 10 mph per the method
You have sped up! New speed is: 40 *added 10 mph per the method
You have shifted up! New gear is: 4  *shifted up 1 gear per the method
You have shifted down! New gear is: 3 * shited down 1 gear per the method

testAuto properties: 4 gears, in gear 2, going 25mph

output:
Current Gear: 2 | Current Speed:  25
You have slowed down! New speed is: 10 *subtracted 15 mph per the method
You have sped up! New speed is: 25 * added 15mph per the method
You have shifted up! New gear is: 3 * shifted up 1 gear per the method 
You have shifted down! New gear is: 2 * shifted down 1 gear per the method

 */

package demogearedvehicles;

import java.util.ArrayList;


public class DemoGearedVehicles 
{

    public static void main(String[] args) 
    {
     //declare variables
     ArrayList<iGearedVehicle> gearedVehicleList;
     gearedVehicleList = new ArrayList<>();
     
     System.out.println("Welcome to the geared vehicle list application!");
     
     Bicycle testBike = new Bicycle (21, 7, 15); //21 gears, in gear 7, going 15mph
     
     gearedVehicleList.add(testBike);
     
     Motorcycle testMoto = new Motorcycle (6,3, 40); // 6 gears, in gear 3, going 40mph
     
     gearedVehicleList.add(testMoto);
     
     Automobile testAuto = new Automobile (4, 2, 25); //4 gears, in gear 2, going 25 mph
     
     gearedVehicleList.add(testAuto);
  
     //output the current geared vehicle list and call the method for each
     System.out.println("The current geared vehicle list:");
     
     for (int i = 0; i < gearedVehicleList.size(); i++)
        {
            System.out.println();
            System.out.println(gearedVehicleList.get(i).toString());
            System.out.println ("You have slowed down! New speed is: " + gearedVehicleList.get(i).slowDown());
            System.out.println ("You have sped up! New speed is: " + gearedVehicleList.get(i).speedUp());
            System.out.println ("You have shifted up! New gear is: " + gearedVehicleList.get(i).shiftUp());
            System.out.println ("You have shifted down! New gear is: " + gearedVehicleList.get(i).downShift());
            System.out.println("________________________________________________________________________________"); //so the output isn't all crunched
        }
     
    System.out.println();
    System.out.println("Thank you for using the geared vehicle list application!");
       
    }
                
    }
    

