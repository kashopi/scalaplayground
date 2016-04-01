trait Vehicle {
    override def toString = this.getClass.getSimpleName
}

private class Car extends Vehicle
private class Tank extends Vehicle
private class Bicycle extends Vehicle

object Vehicle {
    def apply(name: String) = {
        name match {
            case "car" => new Car()
            case "tank" => new Tank()
            case "bicycle" => new Bicycle()
            case _ => Nil
        }

    }
}


val thing = Vehicle("tank")
println("I am a " + thing)
val thang = Vehicle("bicycle")
println("Now, I am a " + thang)
