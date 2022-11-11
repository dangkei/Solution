import org.junit.jupiter.api.Test;

class Solution1Test {

    @Test
    void multiSort() {
        int[][] array = {{2,150},{1,50},{3,50},{4,50}};

        for (int[] ele:Solution1.multiSort(array)){
            System.out.print("[");
            for (int i=0;i<ele.length;i++){
                System.out.print(ele[i]+" ");
            }
            System.out.println("]");
        }

    }
}