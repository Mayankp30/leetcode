package setOperations;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by Mayank on 9/30/16.
 */
public class unionSet {

    public int[] unionOfArrays(int[] nums1, int[] nums2){
        int m=nums1.length;
        int n=nums2.length;
        int i=0;
        int j=0;

        LinkedList<Integer> list = new LinkedList<>();

        if(nums1.length==0 && nums2.length==0){
            return null;
        }

        while (i<m && j<n){
            if(nums1[i]<nums2[j]){
                list.add(nums1[i]);
                i++;
            }else if(nums2[j]<nums1[i]) {
                list.add(nums2[j]);
                j++;
            }else{
                list.add(nums1[i]); // 1
                list.add(nums2[j]);
                i++;
                j++;
            }
        }

        while(i<m){
            list.add(nums1[i++]);
        }
        while(j<n){
            list.add(nums2[j++]);
        }

        HashSet<Integer> set = new HashSet<>();
        for (int l: list) {
            set.add(l);
        }

        int[] result=new int[list.size()];
        int value=0;
        for (int l: set) {
            result[value++]=l;
        }

        for (int x: set){
            System.out.println(x);
        }

        return result;



    }


    public int[] intersectionArrays(int[] nums1, int[] nums2){
        int m=nums1.length;
        int n=nums2.length;
        int i=0;
        int j=0;

        LinkedList<Integer> list = new LinkedList<>();

        if(nums1.length==0 && nums2.length==0){
            return null;
        }

        while (i<m && j<n){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums2[j]<nums1[i]) {
                j++;
            }else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        for (int l: list) {
            System.out.print(l + " ");

        }
       int[] result=new int[list.size()];
        int value=0;
        for (int l: list) {
            result[value++]=l;
        }
        return result;



    }


    public static void main(String[] args) {
        int nums1[] = {1,7,8,9,10,12};
        int nums2[] = {1,9,10};
        unionSet unionSet = new unionSet();
        unionSet.unionOfArrays(nums1,nums2);
        //unionSet.intersectionArrays(nums1,nums2);

    }
}
