object array{

    def main(args: Array[String]): Unit={

        val arr = Array(1, 2, 3, 4, 5)               // Creating an Array with initial elements

        val arrOfStrings = Array("Apple", "Banana")  // Array of Strings

        val arrWithSize = new Array[Int](10)         // Creating an Array with a specified size

        val arrWithRange = Array.range(1, 10)        // Creating an Array with a range of elements from 1 to 10 

        val arrWithFill = Array.fill(5)(0)           // Creating an Array with 5 elements with value 0

        val arrWithTabulate = Array.tabulate(5)(n => n * n) // Creating an Array with 5 elements with square of index

        val firstElement = arr(0)                    // Access first element
        val secondElement = arr(1)                   // Access second element

        arr(0) = 10                                 // Modify element at index 0

        val length = arr.length                      // Get length of the array
        val isEmpty = arr.isEmpty                   // Check if the array is empty

        val newArr = arr :+ 6                       // Add element to the end (returns a new Array)
        val newArr2 = 0 +: arr                      // Add element to the beginning (returns a new Array)

        //Using for Loop
        for (element <- arr) {
             println(element)
        }

        //Using foreach Method
        arr.foreach(println)

        //Using for with Indices
        for (i <- arr.indices) {
            println(s"Index $i: ${arr(i)}")
        }

        val concatenated = arr ++ Array(6, 7, 8)    // Concatenate two arrays

        val reversed = arr.reverse                  // Reverse the array

        val sorted = arr.sorted                     // Sort the array

        //Filtering an Array
        val filteredArray = arr.filter(_ % 2 == 0)  // Keep only even numbers

        val list = arr.toList                       // Convert array to List

        val set = arr.toSet                         // Convert array to Set

        val string = arr.mkString(", ")             // Convert array to String

        val sum = arr.sum                           // Sum of all elements

        val max = arr.max                           // Maximum element

        val min = arr.min                           // Minimum element

        val avg = arr.sum / arr.length              // Average of all elements

        val contains = arr.contains(3)              // Check if the array contains 3

        val index = arr.indexOf(3)                  // Find the index of element 3

        val distinct = arr.distinct                 // Remove duplicates

        val slice = arr.slice(1, 4)                 // Get a subarray from index 1 to 3

        val (even, odd) = arr.partition(_ % 2 == 0) // Partition into even and odd numbers

        val grouped = arr.grouped(2).toArray        // Group elements in an array in groups of 2

        val zipped = arr.zip(arrWithRange)          // Zip two arrays

        val (first, second) = zipped.unzip          // Unzip an array of pairs

        val sumOfPairs = zipped.map { case (a, b) => a + b } // Sum of pairs

        val multiplied = arr.map(_ * 2)             // Multiply each element by 2

        val squared = arr.map(n => n * n)           // Square each element

        val sumOfSquares = arr.map(n => n * n).sum  // Sum of squares

        val sumOfEven = arr.filter(_ % 2 == 0).sum  // Sum of even numbers

        val sumOfOdd = arr.filter(_ % 2 != 0).sum   // Sum of odd numbers

        val sumOfSquaresOfEven = arr.filter(_ % 2 == 0).map(n => n * n).sum // Sum of squares of even numbers

        val sumOfSquaresOfOdd = arr.filter(_ % 2 != 0).map(n => n * n).sum   // Sum of squares of odd numbers

        //2D Array

        val matrix = Array.ofDim[Int](3, 3)         // 3x3 matrix
        matrix(0)(0) = 1                            // Set value in matrix
        














        


    }
}