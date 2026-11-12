class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int minend = arr[0];
        int maxend = arr[0];
        int ans = arr[0];

        for(int i=1;i<n;i++){
            int v1 = arr[i];
            int v2 = minend * arr[i];
            int v3 = maxend * arr[i];
           minend = Math.min(v1,Math.min(v2,v3));
            maxend = Math.max(v1,Math.max(v2,v3));
            ans = Math.max(ans , Math.max(minend , maxend));
        }
        return ans;
    }
}
