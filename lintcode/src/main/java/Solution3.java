import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* 给出 2 * n + 1个数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
* */
public class Solution3 {
    /*
     *异或运算具有很好的性质，相同数字异或运算后为0，并且具有交换律和结合律，故将所有数字异或运算后即可得到只出现一次的数字。
     */
    public static int singleNumber(int[] ai) {
        int single = Arrays.stream(ai).reduce(0, (a, b) -> a ^ b);
        return single;
    }


    public int reverseInteger(int number) {
        // write your code here
        StringBuilder sb1 = new StringBuilder(String.valueOf(number));
        StringBuilder sb2 = sb1.reverse();
        return Integer.parseInt(sb2.toString());
    }

    public double[] calculate(int r) {
        // write your code here
        final double PI=3.1415926;//圆周率
        return new double[]{2*PI*r,PI*r*r};
    }

    public String test(String s){
        List<String> list = Arrays.asList(s.trim().split(" "));
        Collections.reverse(list);
        return String.join(" ", list);
    }
}
