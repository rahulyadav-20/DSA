//ArrayBuffer in Scala is a mutable collection that allows dynamic resizing. 
//It is part of the scala.collection.mutable package and can grow or shrink as needed.

import scala.collection.mutable.ArrayBuffer

object ArrayBuffer{
    def main(args: Array[Int]): Unit ={

        val buffer = ArrayBuffer[Int]()                // Create an empty ArrayBuffer of Int
        val bufferWithValues = ArrayBuffer(1, 2, 3)    // Create an ArrayBuffer with initial values

        buffer += 4                                   // Add a single element
        buffer += (5, 6, 7)                           // Add multiple elements
        buffer ++= ArrayBuffer(8, 9)                  // Add all elements from another collection

        buffer -= 7                                   // Remove a single element
        buffer -= (5, 6)                              // Remove multiple elements
        buffer --= ArrayBuffer(1, 2)                  // Remove all elements from another collection

        



    }
}