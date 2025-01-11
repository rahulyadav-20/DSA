object TrappingRainWater {
    def trap(height: Array[Int]): Int ={
        var water=0
        val leftMax=new Array[Int](height.length)
        val rightMax =new Array[Int](height.length)
        var maxi=-1

        for(i <- height.indices){
            maxi=Math.max(maxi, height(i))
            leftMax(i)=maxi
        }
        maxi=-1
        for(i <- height.indices.reverse){
            maxi=Math.max(maxi,height(i))
            rightMax(i)=maxi
        }

        for (i <- height.indices){
            var diff =Math.min(leftMax(i),rightMax(i))-height(i)
            if(diff>0){
                water+=diff
            }
        }
        water
    }

    def main(args: Array[String]): Unit={
        val height= Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
        val result = trap(height)
        print(result)

    }
}






object TrappingRainWater {
    def trap(height: Array[Int]): Int = {
        var water = 0
        val leftMax = new Array[Int](height.length)
        val rightMax = new Array[Int](height.length)
        var maxi = -1

        for (i <- height.indices) { // storing the left max
            maxi = Math.max(maxi, height(i))
            leftMax(i) = maxi
        }

        maxi = -1
        for (i <- height.indices.reverse) { // storing the right max
            maxi = Math.max(maxi, height(i))
            rightMax(i) = maxi
        }

        for (i <- height.indices) {
            val diff = Math.min(leftMax(i), rightMax(i)) - height(i) // taking the minimum of the two
            if (diff > 0) {
                water += diff
            }
        }

        water
    }

    def main(args: Array[String]): Unit = {
        val height = Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
        val result = trap(height)
        println(result)
    }
}