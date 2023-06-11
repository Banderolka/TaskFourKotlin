
class Aircraft (val aircraftNumber: Int,  val maximumFlightRange: Int, val tankCapacity: Int) {

    var fuelConsumption: Int = 100
        get() = tankCapacity/maximumFlightRange * 100

}
