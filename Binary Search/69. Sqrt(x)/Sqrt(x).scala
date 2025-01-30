object SqrtX {
    
    // Approach: Binary Search
    // Time Complexity: O(log(x))
    // Space Complexity: O(1)
    def mySqrt(x: Int): Int = {
        if (x == 0) return 0
        var start = 1
        var end = x
        while (start <= end) {
            val mid = start + (end - start) / 2
            if (mid <= x / mid) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        end
    }

    def main(args: Array[String]): Unit = {
        val x = 8
        println(s"The square root of $x is ${mySqrt(x)}")
    }
}