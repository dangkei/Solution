import java.util.HashMap;
import java.util.Map;
/*
* 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
* 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是 0 到 n-1。
* */
public class Solution4 {
    /*
    * 使用HashMap特性， 先存储下[value, index] 匹配target-value后， 返回[index1,index2]
    * */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; ++i) {
            if (hashtable.containsKey(target - numbers[i])) {
                return new int[]{hashtable.get(target - numbers[i]), i};
            }
            hashtable.put(numbers[i], i); //[value,index]
        }
        return new int[0];
    }



    public static void main(String[] args) {
        int a = 12;
        int b = 7;
        System.out.println("a="+a+" b="+b);
        a=a^b;
        System.out.println("a="+a+" b="+b);
        b=a^b;
        System.out.println("a="+a+" b="+b);
        a=a^b;
        System.out.println("a="+a+" b="+b);
    }
}
