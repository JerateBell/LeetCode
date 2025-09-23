package LeetCode.Array.CanPlaceFlowers;

public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count =0;
        for(int i=0; i < flowerbed.length; i++){
            int isEmptyRightPlot = (i == flowerbed.length-1) ? 0 : i+1 ;
            int isEmptyLeftPlot = (i==0) ? 0 : flowerbed[i-1];
            if(flowerbed[i] == 0 && isEmptyLeftPlot == 0 && isEmptyRightPlot == 0){
                count ++;
                flowerbed[i] = 1;
            }
            if(count >=n) return true;
        }
        return false;
    }
}
