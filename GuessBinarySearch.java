/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

 public class GuessBinarySearch extends GuessGame {
    public int guessNumber(int n) {
        return recursiveBinarySearch(1, n);
    }

    public int recursiveBinarySearch(int left, int right){
        int mid = left + ((right-left)/2);
        int currGuess = guess(mid);

        if(currGuess == 0){
            return mid;
        }
        else if(currGuess==1){
            return recursiveBinarySearch(mid+1,right);
        }
        else{
            return recursiveBinarySearch(left,mid-1);
        }
    }
}