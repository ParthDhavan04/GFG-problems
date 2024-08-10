class Solution{
    static long factorial(int N){
        // code here
        if(N==0 && N==1){
            return 1;
        }
        long res=1;
        
        for(int i=2;i<=N;i++){
            
            res=res*i;
        }
        return res;
    }
    
}
