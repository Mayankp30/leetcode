package findMaximumMinimumRotatedArray;

/**
 * Created by Mayank on 10/6/16.
 */
public class FindMaximum {
    public int findMaximum(int[] array){

        int start=0;
        int end=array.length-1;

        if(array.length==0 || array==null){
            return -1;
        }

        while(start+1<end){
            int middle = start + (end-start) / 2;
            if(array[start]<array[end]){
                end=middle;
            }else if(array[start]<array[middle]){
                start=middle;
            }else{
                end=middle;
            }
        }

        if(array[start]>array[end]){
            return array[start];
        }else{
            return array[end];
        }
    }

}
