class TwoDMatrixBinarySearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Find the potential row where target might exist
        int row = findRow(matrix, target, 0, m-1);
        if (row < 0) {
            return false;
        }
        
        // Search in the identified row
        return binarySearch(matrix[row], target, 0, n-1);
    }
    
    // Binary search to find the appropriate row
    private int findRow(int[][] matrix, int target, int top, int bottom) {
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;
            if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else if (target > matrix[mid][matrix[mid].length - 1]) {
                top = mid + 1;
            } else {
                return mid; // Found the row where target might exist
            }
        }
        return -1; // Target cannot exist in matrix
    }
    
    // Binary search within a row
    private boolean binarySearch(int[] row, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == target) {
                return true;
            } else if (row[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}