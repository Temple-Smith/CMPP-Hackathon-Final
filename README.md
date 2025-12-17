# CMPP-Hackathon-Final
Project 3: Smart Parking Allocation System

Include a
README.md containing:  Description of parallel component - Exception
handling strategy - Instructions to run the program

Project Description
This project will handle parking lot spot allocation using advanced programming techniques. The project will contain 3 main classes: Vehicle, ParkingSpot, and ParkingLot.
The program will assign and release spots depending on availability and vehicle size. Availability checking will be handled with parallelism, specifically using Java Streams functionality.
The program will also handle invalid vehicle or spot data with precise exception handling.

Programming Language
  We used Java for this project as we are all familiar with Java and appreciate it's ability to
  handle the project requirements. Java is an object oriented programming that suits the Parking Lot
  request well.

System Design Overview
  (Class) ParkingSpot:
  The parking spot class contains a parking spot object that contains spotId, size, occupied (boolean)
  There are getter and setter methods.
  (Class) ParkingLot:
  The parking spot class defines a list of ParkingSpot type. It contains the methods: findAvailableSpot, parkVehicle, releaseSpot.
  The methods within the parking lot class are descriptive and explain what they accomplish accordingly.
  (Class) Vehicle:
  The vehicle class defines the vehicle object, along with getters for the size and license plate.

Description of Parallel Component:
  Parallelism is handled within the AvailabilityChecker class. This utilizes Java streams to call the findAvailableSpot in parallel.
  



  
