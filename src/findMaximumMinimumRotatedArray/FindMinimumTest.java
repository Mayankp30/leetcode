package findMaximumMinimumRotatedArray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mayank on 10/6/16.
 */
public class FindMinimumTest {
    @Test
    public void findMinimumTest() throws Exception {

        int[][] array = {
                {4,5,6,7,0,1,2},
                {1,2,3},
                {2,3,1},
                {1,2,3,4},
                {2,3,4,1}
        };

        int [] results = {0,1,1,1,1};

        FindMinimum findMinimum = new FindMinimum();
        for(int i=0;i<results.length;i++){
            int res = findMinimum.findMinimum(array[i]);
            System.out.println(results[i]);
            assertEquals(results[i],res);
        }

    }

}