package uniquepath;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mayank on 10/21/16.
 */

public class UniquepathTest {
    @Test
    public void uniquePaths() throws Exception {
        int[][] inputs = {
                {2,2},
                {3,7},
        };
        int[] results = {2,28};
        for(int i = 0; i < inputs.length; i++) {
            Uniquepath u = new Uniquepath();
            int r = u.uniquePaths(inputs[i][0], inputs[i][1]);
            System.out.println(r);
            assertEquals(results[i], r);
        }
    }
}