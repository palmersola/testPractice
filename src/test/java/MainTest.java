import org.example.Main;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;

public class MainTest {
    @DisplayName("test sum() method")
    @Test
    public void testSum() {
        int x = 3;
        int y = 5;
        int expectedSum = 8;
        int actualSum = Main.sum(x,y);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @DisplayName("test average() method")
    @Test
    public void testAverage() {
        int[] arrOne = {4, 1, 3, 9, 7};
        int expectant = 4;
        int actualInt =  Main.average(arrOne);
        Assertions.assertEquals(expectant, actualInt);
    }

    @DisplayName("test fullName() method")
    @Test
    public void testFullName() {
        String first = "Palmer";
        String last = "Sola";
        String expectedFullName = "Palmer Sola";
        String actualFullNAme = Main.fullName(first, last);
        Assertions.assertEquals(expectedFullName, actualFullNAme);
    }

    @DisplayName("test bubbleSort() method")
    @Test
    public void testBubbleSort() {
        int[] arrOne = {4, 1, 3, 9, 7};
        int[] expectedArr = {1, 3, 4, 7, 9};
        int[] actualArr =  Main.bubbleSort(arrOne, arrOne.length);
        Assertions.assertEquals(Arrays.toString(expectedArr), Arrays.toString(actualArr));
    }

    @DisplayName("test validDate() method")
    @Test
    public void testDateRegex() {
        String date = "05/03/1998";
        boolean expectedReturn = true;
        boolean actualReturn = Main.validDate(date);
        Assertions.assertEquals(expectedReturn, actualReturn);
    }
}
