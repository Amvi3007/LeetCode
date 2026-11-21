class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i =0;i<piles.length;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }

        int k = max;
        int low = 1;
        int high = max;

        while(low<high){
            int mid = low + (high-low)/2;
            int count = 0;
            for(int i =0;i<piles.length;i++){
                if(piles[i]%mid == 0){
                    count+=piles[i]/mid;
                }else{
                    count+=piles[i]/mid;
                    count++;
                }
            }
            if(count <= h ){
                k = mid;
                high = mid;
            }else{
                low = mid + 1;
            }
        } 

        return k;
    }


}