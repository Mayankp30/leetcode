package subsets;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Mayank on 9/28/16.
 */


public class subsetsTest {

    public void testSubsets() throws Exception {

        ArrayList<Integer> inputs = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
        }};
        ArrayList<ArrayList<Integer>> outputs = new ArrayList<ArrayList<Integer>>(){{
            add(new ArrayList<Integer>(){{
                add(3);
            }});
            add(new ArrayList<Integer>(){{
                add(1);
            }});
            add(new ArrayList<Integer>(){{
                add(2);
            }});
            add(new ArrayList<Integer>(){{
                add(1);
                add(2);
                add(3);
            }});
            add(new ArrayList<Integer>(){{
                add(1);
                add(3);
            }});
            add(new ArrayList<Integer>(){{
                add(2);
                add(3);
            }});
            add(new ArrayList<Integer>(){{
                add(1);
                add(2);
            }});
            add(new ArrayList<Integer>(){{
            }});
        }};
        subsets s = new subsets();
        ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
        r = s.subsets(inputs);

        System.out.println(r);
        assertTrue(r.containsAll(outputs) && r.size() == outputs.size());
    }


}
