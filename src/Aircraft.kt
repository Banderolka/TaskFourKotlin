

 abstract class Aircraft (val aircraftNumber: Int, val maximumFlightRange: Int, val tankCapacity: Int) {


    var fuelConsumption: Int = 100
        get() = tankCapacity/maximumFlightRange * 100

     abstract protected fun info()

 }

 interface Passenger{
     val capacity: Int
 }

 class Boeing747 (aircraftNumber: Int, maximumFlightRange: Int, tankCapacity: Int, override val capacity: Int ): Aircraft (aircraftNumber, maximumFlightRange, tankCapacity), Passenger {
      override fun info(){
         println("Номер самолета: $aircraftNumber\nМаксимальная дальность полета: $maximumFlightRange\nВместимость бака: $tankCapacity\nРасход топлива на 100 км: $fuelConsumption\n " +
                 "Вместимость: $capacity")
     }
 }

 data class Car(val model: String, val color: String, val number: Int)
 