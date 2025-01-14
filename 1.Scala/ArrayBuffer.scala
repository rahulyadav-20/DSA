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

        buffer.insert(1, 10)                          // Insert 10 at index 1
        buffer.insert(2, 20, 30)                      // Insert multiple elements at index 2

        buffer -= 4                                   // Remove the first occurrence of element 4
        buffer -= (5, 6)                              // Remove multiple elements
        buffer.remove(1)                              // Remove element at index 1
        buffer.remove(0, 2)                           // Remove 2 elements starting from index 0
        buffer.clear()                                // Remove all elements

        val firstElement = buffer(0)                  // Access element at index 0
        buffer(1) = 15                                // Modify element at index 1


        val size = buffer.size                        // Get the size of the ArrayBuffer
        val isEmpty = buffer.isEmpty                  // Check if the ArrayBuffer is empty

        // Using for Loop
        for (element <- buffer) {
            println(element)
        }

        // Using foreach Method
        buffer.foreach(println)

        // Using for with Indices
        for (i <- buffer.indices) {
            println(s"Index $i: ${buffer(i)}")
        }

        val newBuffer = buffer ++ ArrayBuffer(10, 11) // Concatenate two buffers

        val reversed = buffer.reverse                 // Reverse the elements

        val sorted = buffer.sorted                    // Sort the elements

        val mapped = buffer.map(_ * 2)                // Double each element

        val filtered = buffer.filter(_ % 2 == 0)      // Keep only even numbers

        val arr = buffer.toArray                      // Convert ArrayBuffer to Array

        val list = buffer.toList                      // Convert ArrayBuffer to List

        val set = buffer.toSet                        // Convert ArrayBuffer to Set

        val str = buffer.mkString(", ")               // Convert ArrayBuffer to String with delimiter

        val slice = buffer.slice(1, 4)                // Get a sub-buffer from index 1 to 3

        val sum = buffer.sum                          // Sum of all elements
        val max = buffer.max                          // Maximum element
        val min = buffer.min                          // Minimum element

        val clonedBuffer = buffer.clone()             // Create a copy of the ArrayBuffer

        val contains = buffer.contains(3)             // Check if the ArrayBuffer contains 3

        //Using Pattern Matching
        buffer match {
            case ArrayBuffer(1, _*) => println("Starts with 1")
            case _                  => println("Does not start with 1")
        }

        val paired = buffer.zip(ArrayBuffer("a", "b", "c")) // Pair elements with another collection

        val matrix = ArrayBuffer(ArrayBuffer(1, 2, 3), ArrayBuffer(4, 5, 6))
        matrix(0)(1) = 9                             // Modify an element in the 2D ArrayBuffer

        // Print 2D ArrayBuffer
        for (row <- matrix) {
            println(row.mkString(", "))
        }

        val element = matrix(1)(2)                   // Access element at row 1, column 2
        
        val row = matrix(1)                           // Access row at index 1

        val col = matrix.map(_(2))                    // Access column at index 2
        
        val flat = matrix.flatten                     // Flatten the 2D ArrayBuffer

        val transposed = matrix.transpose            // Transpose the 2D ArrayBuffer

        val sumRows = matrix.map(_.sum)               // Sum of each row

        val sumCols = matrix.transpose.map(_.sum)     // Sum of each column

        val flattened = matrix.flatten                // Flatten the 2D ArrayBuffer

        val distinct = buffer.distinct                // Remove duplicates

        val (even, odd) = buffer.partition(_ % 2 == 0) // Partition into even and odd numbers

        val grouped = buffer.grouped(2).toArray       // Group elements in an array in groups of 2

        val sliding = buffer.sliding(2).toArray       // Generate sliding windows of size 2

        val zipped = buffer.zipWithIndex              // Zip elements with their indices

        val (negatives, nonNegatives) = buffer.partition(_ < 0) // Partition into negative and non-negative numbers

        val (first, second) = buffer.splitAt(2)       // Split the buffer at index 2

        val (init, last) = buffer.splitAt(buffer.length - 1) // Split the buffer into init and last elements

        val (prefix, suffix) = buffer.span(_ < 4)     // Split the buffer into prefix and suffix based on a condition

        val (before, atAndAfter) = buffer.partition(_ < 4) // Partition the buffer before and at/after the first element less than 4

        

    }
}