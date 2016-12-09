package climbStairs;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Mayank on 12/8/16.
 */
public class ClimbstairsTest {


    public void testClimbStairs() throws Exception {
        int[] inputs = {1,2,3,4};

        int[] results = {1,2,3,5};

        for (int i = 0; i < results.length; i++) {
            Climbstairs c = new Climbstairs();
            int r = c.climbStairs(inputs[i]);
            System.out.println(r);
            assertEquals(results[i], r);
        }
    }

}