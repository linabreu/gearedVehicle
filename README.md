# gearedVehicle
Program utilizes an interface and contains three classes that implement the interface

Progrma contains an interface called iGearedVehicle, which can be used for any vehicle that has gears. It includes abstract methods for shifting gear up, shifting gears down, speeding up, and slowing down.

The classes Bicycle, Motorcycle, and Automobile all implement iGearedVehicle and its four methods. A toString() override in each class returns the speed and current gear of the vehicle.

A program called DemoGearedVehicles creates a collection of type iGearedVehicle and populates it with at least one of each vehicle type, and demonstrates the use of the methods. 
