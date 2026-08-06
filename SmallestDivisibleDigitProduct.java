class Solution {
    public int smallestNumber(int n, int t ) {
        while(true){
        int ans = n ; 
        int p=1;
        while(ans > 0){
            int d = ans% 10;
            p*=d;
            ans/= 10;
        }

        if( p%t==0){
              return n;
        }
        n++;
        }
    }
}
