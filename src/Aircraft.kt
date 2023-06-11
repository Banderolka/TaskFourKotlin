
class Aircraft {
    var aircraftNumber: Int = 3045
    var maximumFlightRange: Int = 8000
    var tankCapacity: Int = 80000
    var fuelConsumption: Int = 100
        get() = tankCapacity/maximumFlightRange * 100

}
