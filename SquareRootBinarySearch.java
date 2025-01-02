class SquareRootBinarySearch {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        return recursiveBinarySearch(x, 1, x);
    }

    public int recursiveBinarySearch(int target, int left, int right){
        if(left>right){
            return right;
        }

        int mid = left + ((right-left)/2);
        long currProd = (long) mid*mid;

        if(currProd == target){
            return mid;
        }
        else if(currProd > target){
            return recursiveBinarySearch(target, left ,mid-1);
        }
        else{
            return recursiveBinarySearch(target, mid+1, right);
        }
    }
}