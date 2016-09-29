package addDigits;
/**********************************************************************************
 *
 *LeetCode: Add Digits
 *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *
 * For example,
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it
 *
 **********************************************************************************/

/**
 * Created by Mayank on 9/28/16.
 */
public class AddDigit {

    public int addDigits(int num){
        while(num>9){
            num = getSum(num);
        }
        return num;
    }

    private int getSum(int num){
        int result=0;
        while(num>=10){
            result=result+num%10;
            num=num/10;
        }
        result=result+num;
        return result;
    }

    public static void main(String[] args) {
        AddDigit demo = new AddDigit();
        //System.out.println(demo.addDigits(331));

    }
}
