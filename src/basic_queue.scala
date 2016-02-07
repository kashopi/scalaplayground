// This is a basic exercise to play with traits and cascade priorities

import scala.collection.mutable.ArrayBuffer


abstract class IntQueue {
	def get(): Int
	def put(x: Int)
}


trait Doubling extends IntQueue {
	abstract override def put(x: Int) { super.put(2 * x) }
}


trait Incrementing extends IntQueue {
	abstract override def put(x: Int) { super.put(x + 1) }
}

class BasicIntQueue extends IntQueue {
	private val buf = new ArrayBuffer[Int]
	def get() = buf.remove(0)
	def put(x: Int) { buf += x }
}

// The priority of traits is from right to left
class DoubleBasic extends BasicIntQueue with Incrementing with Doubling

val buffer = new DoubleBasic
buffer.put(10)
buffer.put(25)
println(buffer.get())
println(buffer.get())

