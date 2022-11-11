import java.util.Arrays;
import java.util.Hashtable;

public class Solution6 {
    public void sortByLength(String[] strArr) {
        Arrays.stream(strArr).sorted((x,y)->x.length()-y.length()).forEach(System.out::println);
    }

    public boolean isUnique(String str) {
        // write your code here
        Hashtable table = new Hashtable();

        for(Character c:str.toCharArray()){
            if(table.containsKey(c)){
                return false;
            }
            table.put(c,c);
        }
        return true;
    }

    public int strStr(String source, String target) {
        // Write your code here
        return source.indexOf(target);
    }
}
