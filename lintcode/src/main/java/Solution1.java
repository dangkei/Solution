import java.util.Arrays;

/*
* 给定 n 个学生的学号(从 1 到 n 编号)以及他们的考试成绩，表示为(学号，考试成绩)，
* 请将这些学生按考试成绩降序排序，若考试成绩相同，则按学号升序排序。
* */
public class Solution1 {
    /**
     * @param array: the input array
     * @return: the sorted array
     */
    public static int[][] multiSort(int[][] array) {
        // Write your code here
        Arrays.sort(array,(int[] l,int[] r)->{
           return l[1]==r[1]? l[0]-r[0]:r[1]-l[1];
        });
        return array;
    }

    /*
    * 传统循环比较
    * */
    public static int[][] multiSort1(int[][] array) {
        // Write your code here
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[i][1] < array[j][1])
                {
                    int[] temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

                if(array[i][1] == array[j][1])
                {
                    if(array[i][0] > array[j][0])
                    {
                        int[] temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        return array;
    }
}
