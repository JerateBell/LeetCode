package LeetCode.Array;

public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count =0;
        for(int i=0;i<flowerbed.length; i++){
            int isEmptyRightPlot ;
            int isEmptyLeftPlot;
            if(i==0){
                isEmptyLeftPlot = 0;
            }else{
                isEmptyLeftPlot = flowerbed[i-1];
            }
            if(i==flowerbed.length-1){
                isEmptyRightPlot = 0;
            }else{
                isEmptyRightPlot = flowerbed[i+1];
            }

            if(flowerbed[i] == 0 && isEmptyLeftPlot == 0 && isEmptyRightPlot == 0){
                count ++;
                flowerbed[i] = 1;

            }
            if(count >=n){
                return true;
            }
        }
        return count >=n;
    }
}
