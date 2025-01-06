object SpiralMatrix {
    def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
        if (matrix.isEmpty || matrix(0).isEmpty) return List()

        val rows = matrix.length
        val cols = matrix(0).length
        var top = 0
        var bottom = rows - 1
        var left = 0
        var right = cols - 1
        var result = List[Int]()

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (i <- left to right) {
                result = result :+ matrix(top)(i)
            }
            top += 1

            // Traverse from top to bottom
            for (i <- top to bottom) {
                result = result :+ matrix(i)(right)
            }
            right -= 1

            // Traverse from right to left
            if (top <= bottom) {
                for (i <- right to left by -1) {
                    result = result :+ matrix(bottom)(i)
                }
                bottom -= 1
            }

            // Traverse from bottom to top
            if (left <= right) {
                for (i <- bottom to top by -1) {
                    result = result :+ matrix(i)(left)
                }
                left += 1
            }
        }

        result
    }

    def main(args: Array[String]): Unit = {
        val matrix = Array(
            Array(1, 2, 3),
            Array(4, 5, 6),
            Array(7, 8, 9)
        )

        val result = spiralOrder(matrix)
        println(result.mkString(", "))
    }
}