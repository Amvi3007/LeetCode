class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int i =0;i<piles.length;i++){
            if(piles[i]>right){
                right = piles[i];
            }
        }

        int ans = right;
        while(left<=right){
            int mid = left + (right - left)/2;

            long hours = 0;
            for(int i =0;i<piles.length;i++){
                hours+=(((long)piles[i] + (long)mid - 1)/(long)mid);
            }
            if(hours<=h){
                ans = mid;
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}