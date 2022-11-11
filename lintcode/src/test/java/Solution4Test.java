import org.junit.jupiter.api.Test;

class Solution4Test {

    @Test
    void twoSum() {
        int[] a = {8,2,9,7,11,15};
        int[] b = Solution4.twoSum(a,9);
        System.out.println(b[0]+","+b[1]);
    }
}