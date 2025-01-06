object TwoSumII {
    def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
        var left = 0
        var right = numbers.length - 1

        while (left < right) {
            val sum = numbers(left) + numbers(right)
            if (sum == target) {
                return Array(left + 1, right + 1)
            } else if (sum < target) {
                left += 1
            } else {
                right -= 1
            }
        }
        Array()
    }

    def main(args: Array[String]): Unit = {
        val numbers = Array(2, 7, 11, 15)
        val target = 9
        val result = twoSum(numbers, target)
        println(s"Indices: ${result.mkString(", ")}")
    }
}