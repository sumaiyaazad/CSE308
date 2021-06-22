import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void firstTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void testAdd(){
        MyMath calc=new MyMath();
        assertEquals("Result must be 11 ",11,calc.add(5,6));
    }

    @Test
    public void testBlankList(){
        int[] myList={};
        MySortedList mySortedList= new MySortedList(copyArray(myList));
        assertArrayEquals("Must return a sorted blank list", myList, mySortedList.getMySortedList());
    }

    @Test
    public void testOneList(){
        int[] myList={1};
        MySortedList mySortedList= new MySortedList(copyArray(myList));
        Arrays.sort(myList);
        assertArrayEquals("Must return a sorted blank list", myList, mySortedList.getMySortedList());
    }

    @Test
    public void testTwoList(){
        int[] myList={2,-1};
        MySortedList mySortedList= new MySortedList(copyArray(myList));
        Arrays.sort(myList);
        assertArrayEquals("Must return a sorted blank list", myList, mySortedList.getMySortedList());
    }


    public int[] copyArray(int[] list){
        int[] copyList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            copyList[i]=list[i];
        }
        return copyList;
    }

}
