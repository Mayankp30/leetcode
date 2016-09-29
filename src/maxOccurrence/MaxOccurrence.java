
package maxOccurrence;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Mayank on 9/28/16.
 */
public class MaxOccurrence {


        public void countMaxOccurrence(String[] words){
            HashMap<String,Integer> map = new HashMap<>();
            for (String s:words) {
                if(!map.containsKey(s)){
                    map.put(s,1);
                }else{
                    map.put(s,map.get(s)+1);
                }
            }

            int high = Integer.MIN_VALUE;   // finds max value from array
            for (int mValue:map.values()){
                if(mValue>high){
                    high=mValue;
                }
            }
            System.out.println(high);
            for(Map.Entry<String,Integer> entry: map.entrySet()){
                if(entry.getValue()==high){
                    System.out.println(entry.getKey());
                }
            }

        }




        public static void main(String args[]) {
        MaxOccurrence maxOccurrence = new MaxOccurrence();
            try( Scanner sc = new Scanner(new FileReader("/Users/Mayank/IdeaProjects/leetcode/src/maxOccurrence/random.txt"))) {

                ArrayList<String> list = new ArrayList<>();
                while (sc.hasNext()) {
                    list.add(sc.next());
                }

                String[] result = new String[list.size()];
                int value=0;
                for (String s: list) {
                    result[value++]=s;
                }

                maxOccurrence.countMaxOccurrence(result);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
}

