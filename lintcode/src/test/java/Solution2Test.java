import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    void sortByLength() {
        String s = "he see a ball";
        Solution2.sortByLength(s.split(" "));
        //System.out.println(s);
    }
}