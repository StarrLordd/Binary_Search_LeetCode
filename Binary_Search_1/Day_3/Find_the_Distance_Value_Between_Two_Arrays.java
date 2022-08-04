class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res=0;
        TreeSet<Integer> ts=new TreeSet<>();
        for(int n: arr2) ts.add(n);
        
        for(int n:arr1){
            Integer hi=ts.ceiling(n);
            Integer lo=ts.floor(n);
            
            int dif=0;
            if(hi==null) dif=Math.abs(lo-n);
            else if(lo==null) dif=Math.abs(hi-n);
            else dif=Math.min(hi-n,n-lo);
            
            if(dif>d) res++;
        }
        return res;
    }
}