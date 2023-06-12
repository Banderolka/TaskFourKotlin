

 abstract class Aircraft (val aircraftNumber: Int, val maximumFlightRange: Int, val tankCapacity: Int) {


    var fuelConsumption: Int = 100
        get() = tankCapacity/maximumFlightRange * 100

}

 interface Passenger{
     val capacity: Int
 }

 class Boeing747 (aircraftNumber: Int, maximumFlightRange: Int, tankCapacity: Int, override val capacity: Int ): Aircraft (aircraftNumber, maximumFlightRange, tankCapacity), Passenger
