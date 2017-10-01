class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0) return false;
        int res=0;
        for(int i=0;i<32;i++){
            if((n&1)==1){
                res++;
            }
            n=n>>1;
        }
        return res==1;
    }
}
