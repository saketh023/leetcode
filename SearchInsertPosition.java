
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        return recursiveBinarySearch(nums, target, 0, nums.length - 1);
    }

    public int recursiveBinarySearch(int[] nums, int x, int left, int right) {
        if (x > nums[right]) {
            return right + 1;
        } else if (x < nums[left]) {
            return left;
        }
        int mid = (left + right) / 2;
        if (x == nums[mid]) {
            return mid;
        } else if (x > nums[mid]) {
            return recursiveBinarySearch(nums, x, mid + 1, right);
        } else {
            return recursiveBinarySearch(nums, x, left, mid - 1);
        }
    }
}
