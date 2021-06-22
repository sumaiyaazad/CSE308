import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

public class MySortedList {
    public int[] myList;

    public MySortedList(int[] myList) {
        this.myList = myList;
    }

    public int[] getMySortedList() {
        Arrays.sort(myList);
        return myList;
    }
}
