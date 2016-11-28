package firstBadVersion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mayank on 11/28/16.
 */
public class BadVersionTest {
    @Test
    public void testFirstBadVersion() throws Exception {
        int[] inputs = {1,22,34,40,5232,6342342,71231};
        int[] targets = {1, 10, 20, 25, 323, 45454, 23232};

        BadVersion f = new BadVersion();
        for (int i = 0; i < targets.length; i++) {
            f.firstBadVersion = targets[i];
            int r = f.firstBadVersion(inputs[i]);
            System.out.println(r);
            assertEquals(targets[i], r);
        }
    }
}