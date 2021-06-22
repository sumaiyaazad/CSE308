import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static org.junit.Assert.*;

public class MyTest {

    Random rand = new Random();

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
        assertArrayEquals("Must return a sorted list of one element", myList, mySortedList.getMySortedList());
    }

    @Test
    public void testTwoList(){
        int[] myList={2,-1};
        MySortedList mySortedList= new MySortedList(copyArray(myList));
        Arrays.sort(myList);
        assertArrayEquals("Must return a sorted list of two elements", myList, mySortedList.getMySortedList());
    }

    @Test
    public void testRandomSizeList(){
        int[] myList=new int[rand.nextInt(10)];
        for (int i = 0; i < myList.length; i++) {
            myList[i]=i;
        }
        MySortedList mySortedList= new MySortedList(copyArray(myList));
        Arrays.sort(myList);
        assertArrayEquals("Must return a sorted list with random size", myList, mySortedList.getMySortedList());
    }

    @Test
    public void testRandomNumberList(){
        int[] myList=new int[10];
        for (int i = 0; i < myList.length; i++) {
            myList[i]=rand.nextInt(20);
        }
        MySortedList mySortedList= new MySortedList(copyArray(myList));
        Arrays.sort(myList);
        assertArrayEquals("Must return a sorted list with random elements", myList, mySortedList.getMySortedList());
    }

    @Test
    public void testAscendingList(){
        int[] myList={0,1,2,5,7,9,15};
        MySortedList mySortedList= new MySortedList(copyArray(myList));
        Arrays.sort(myList);
        assertArrayEquals("Must return a sorted list with numbers in ascending order", myList, mySortedList.getMySortedList());
    }

    @Test
    public void testDescendingList(){
        int[] myList={15,9,7,5,2,1,0};
        MySortedList mySortedList= new MySortedList(copyArray(myList));
        Arrays.sort(myList);
        assertArrayEquals("Must return a sorted list with numbers in ascending order", myList, mySortedList.getMySortedList());
    }

    @Test
    public void testEqualList(){
        int[] myList={10,10,10,10,10};
        MySortedList mySortedList= new MySortedList(copyArray(myList));
        Arrays.sort(myList);
        assertArrayEquals("Must return a sorted list with numbers in ascending order", myList, mySortedList.getMySortedList());
    }

    public int[] copyArray(int[] list){
        int[] copyList = new int[list.length];
        for (int i = 0; i < copyList.length; i++) {
            copyList[i]=list[i];
        }
        return copyList;
    }

}
