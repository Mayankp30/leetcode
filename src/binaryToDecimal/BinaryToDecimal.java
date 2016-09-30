
package binaryToDecimal;

/**
 * Created by Mayank on 9/30/16.
 */
public class BinaryToDecimal {
    /**
     * @param number: takes binary number as string - converts to decimal
     * @return: binary number in string format.
     */

    public static String decimalConversion(String number){ // 101 --> 5
        int result=0;
        char[] numArray = number.toCharArray();
        for(int i=0;i<numArray.length;i++){
            result=result*2 + Character.getNumericValue(numArray[i]);
        }

        result=result+1; // 6

        StringBuilder sb = new StringBuilder();
        while (result>0){
            int r=result%2;
            sb.append(r);
            result=result/2;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalConversion("110"));

    }

}
