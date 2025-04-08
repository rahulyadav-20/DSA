
class Solution {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    // Binary Search
    public int peakIndexInMountainArray(int[] arr) {
        int start = 1;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[(mid + 1) % arr.length]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return mid;

    }
}

public class Peak_Index_in_a_Mountain_Array {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, 2, 1, 0};
        int result = solution.peakIndexInMountainArray(arr);
        System.out.println("Peak index in [0,2,1,0]: " + result); // Output: 1

    }
}
