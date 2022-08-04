class Solution {
    public boolean isPerfectSquare(int num) {
        long n=num;
        long start=1;
        
        while(start<=n){
            long mid=start+(n-start)/2;
            if(mid*mid==num) return true;
            
            if(mid*mid>num){
                n=mid-1;
            }
            
            if(mid*mid<num){
                start=mid+1;
            }
        }
        return false;
    }
}