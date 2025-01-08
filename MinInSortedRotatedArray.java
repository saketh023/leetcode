class MinInSortedRotatedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;   

        return recursiveBinarySearch(nums, left, right);
    }

    public int recursiveBinarySearch(int[] nums, int left, int right){
        if(left == right){
            return nums[left];
        }

        int mid = left + (right-left)/2;
        
        if(nums[mid]>nums[right]){
            return recursiveBinarySearch(nums, mid+1, right);
        }
        else{
            return recursiveBinarySearch(nums, left, mid);
        }
    }
}