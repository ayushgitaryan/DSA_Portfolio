class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) ->b[1]-a[1]);
        int totalunits=0;
        for(int i=0;i<boxTypes.length;i++){
            int availablebox = boxTypes[i][0];
            int units = boxTypes[i][1];

            int boxtaken = Math.min(availablebox , truckSize);
            totalunits += boxtaken * units;

            truckSize -=boxtaken;

            if(truckSize == 0){
                break;
            }           

        }
        return totalunits;
    }
}
