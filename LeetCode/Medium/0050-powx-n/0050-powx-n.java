class Solution {

    public double helper(double x, long n){
        if(n == 0 ){
            return 1;
        }
        double half = 1;
        if(n<0){
            n = -n;
            return 1/helper(x,n);
        }
        if(n%2==0){
            half = helper(x,n/2);
            return half*half;
        }

        half = helper(x,n/2);
        return x*half*half;
    }
    
    public double myPow(double x, int n) {
        return helper(x,n);
    }
}