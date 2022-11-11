import java.util.HashMap;
import java.util.Map;

/*
 * 给出一个字符串，找出第一个只出现一次的字符。假设只出现一次的字符数量大于等于1。
 * */
public class Solution5 {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public static char firstUniqChar(String str) {
        // Write your code here
        char[] chars = str.toCharArray();
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        for(char c:chars){
            if (!count.containsKey(c)) {
                count.put(c, 1);
            } else {
                count.put(c, count.get(c) + 1);
            }
        }
        for (char c:chars){
            if(count.get(c)==1) return  c;
        }
        return ' ';
    }
}
