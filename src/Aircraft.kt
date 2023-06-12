

 open class Aircraft (val aircraftNumber: Int, val maximumFlightRange: Int, val tankCapacity: Int) {


    var fuelConsumption: Int = 100
        get() = tankCapacity/maximumFlightRange * 100

}

 class Boeing747(val capacity: Int, aircraftNumber: Int, maximumFlightRange: Int,tankCapacity: Int): Aircraft (aircraftNumber, maximumFlightRange, tankCapacity){

 }
