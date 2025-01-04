import java.util.Arrays;

class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int result = right;

        while (left <= right) {
            int k = left + (right - left) / 2;
            double hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += Math.ceil((double) piles[i] / k);
            }

            if (hours <= h) {
                result = k;
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return result;
    }
}
