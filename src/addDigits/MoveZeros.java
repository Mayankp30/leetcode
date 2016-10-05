package addDigits;


/**********************************************************************************
 * Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
 *
 * For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
 *
 * it should be changed to    {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
 *
 * The order of all other elements should be same.
 *
 * Expected time complexity is O(n) and extra space is O(1).
 *
 **********************************************************************************/



/**
 * Created by Mayank on 10/5/16.
 */
public class MoveZeros {

    public static void moveZerosInEnd(int[] array){
        int count=0;
        int n = array.length;
        for (int i=0;i<n;i++){
            if(array[i]!=0){
                array[count++]=array[i];
            }
        }

        while(count<n){
            array[count++]=0;
        }

    }


    public static void main(String[] args) {
        int[] array={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println("\n array after swapping");
        moveZerosInEnd(array);
        System.out.println();
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
