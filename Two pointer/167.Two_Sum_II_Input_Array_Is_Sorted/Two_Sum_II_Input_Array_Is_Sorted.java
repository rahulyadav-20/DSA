
class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            if (numbers[start] + numbers[end] == target) {
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            } else if ((numbers[start] + numbers[end]) > target) {
                end--;
            } else {
                start++;
            }
        }
        return ans;
    }
}

public class Two_Sum_II_Input_Array_Is_Sorted {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(numbers, target);
        System.out.println("Index1: " + result[0] + ", Index2: " + result[1]);
    }
}
