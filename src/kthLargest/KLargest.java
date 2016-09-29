package kthLargest;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Mayank on 9/29/16.
 */
public class KLargest {

    public int kthLargest(int[] array, int k){  // 12, 3, 5, 6, 1, 3, 10, 14, 3, 10, 5, 22, 1, 0, -5, 10, 4, -10
        HashSet<Integer> setOfUniqueNumbers = new HashSet<>();
        for (int value : array){
            setOfUniqueNumbers.add(value);
        }

        int[] result = new int[setOfUniqueNumbers.size()];
        int element=0;
        for (int valueFromSet : setOfUniqueNumbers){
            result[element++]=valueFromSet;
        }
        Arrays.sort(result);
        return result[result.length-k];

    }
}
