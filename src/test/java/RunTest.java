import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
class RunTest {

   /* private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }*/

    @Test
    void changeAds() {

        int base10 = 50;
        int res = Run.changeAds(base10);
        Assertions.assertEquals(13, res);
        Assertions.assertEquals(1, Run.changeAds(30));
    }

    @ParameterizedTest
    @CsvSource({"50,13", "30,1"})
    void changeAdsParametrized(int input, int expected) {

        Assertions.assertEquals(expected, Run.changeAds(input));
    }

    @Test
    void simpleArraySum() {
        int[] arr = {1, 2, 3};
        Assertions.assertEquals(6, Run.simpleArraySum(arr));
    }

    @Test
    void timeConversionWithPm() {

        String s = "12:01:00PM";
        String res = Run.timeConversion(s);

        Assertions.assertEquals("12:01:00", res);
    }

    @Test
    void timeConversionWithAm() {

        String s = "12:01:00AM";
        Assertions.assertEquals("00:01:00", Run.timeConversion(s));
    }

    @Test
    void aVeryBigSum() {

        long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};

        Assertions.assertEquals(5000000015l, Run.aVeryBigSum(ar));
    }

    @Test
    void findNumber() {
        List<Integer> arr = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        log.info(arr.toString());
        assert (Run.findNumber(arr, 5)).equals("Yes");
        assert (Run.findNumber(arr, 0)).equals("Yes");
        assert (Run.findNumber(arr, 1)).equals("Yes");
        assert (Run.findNumber(arr, 2)).equals("Yes");
        assert (Run.findNumber(arr, 9)).equals("Yes");

        assert (Run.findNumber(arr, 11)).equals("No");
        assert (Run.findNumber(arr, 10)).equals("No");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 0, 1, 2, 3, 4, 6, 7, 8, 9})
    void shouldReturnYes(int number) {
        List<Integer> arr = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        Assertions.assertTrue(Run.findNumber(arr, number).equals("Yes"));
    }

    @Test
    void oddNumbers() {
        assert (Run.oddNumbers(3, 7).equals(List.of(3, 5, 7)));
        assert (Run.oddNumbers(1, 7).equals(List.of(1, 3, 5, 7)));
        assert (Run.oddNumbers(9, 10).equals(List.of(9)));
    }

    @Test
    void diagonalDifference() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(0, 1, 2));
        arr.add(List.of(3, 4, 5));
        arr.add(List.of(7, 7, 8));

        log.info(arr.toString());
        int tested = Run.diagonalDifference(arr);
        Assertions.assertEquals(1, tested);
    }

    @Test
    void dataTypes() {

    }

    @Test
    void dayOfProgrammer() throws ParseException {
        System.out.println(Run.dayOfProgrammer(1800));
        System.out.println(Run.dayOfProgrammer(1900));
        System.out.println(Run.dayOfProgrammer(1984));
        System.out.println(Run.dayOfProgrammer(2016));
        System.out.println(Run.dayOfProgrammer(2017));
        System.out.println(Run.dayOfProgrammer(1700));
        System.out.println(Run.dayOfProgrammer(1772));
        System.out.println(Run.dayOfProgrammer(1741));
        System.out.println(Run.dayOfProgrammer(1916));
        System.out.println(Run.dayOfProgrammer(1918));

        Assertions.assertEquals("13.09.2017", Run.dayOfProgrammer(2017));
        Assertions.assertEquals("26.09.1918", Run.dayOfProgrammer(1918));
    }

    @Test
    void plusMinus() {
        int[] arr = new int[]{-4, 3, -9, 0, 4, 1};

        Run.plusMinus(arr);
        //log.info(outputStreamCaptor.toString());
    }

    @Test
    void staircase() {
        PrintStream standardOut = System.out;
        InputStream sI = System.in;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        ByteArrayInputStream iSC = new ByteArrayInputStream("My Stream".getBytes());

        System.setOut(new PrintStream(outputStreamCaptor));

        Run.staircase(4);
        log.info(outputStreamCaptor.toString());
        Assertions.assertEquals("   #\n" +
                "  ##\n" +
                " ###\n" +
                "####\n", outputStreamCaptor.toString());
    }

    @Test
    void switchStatement() {
        //Run.switchStatement();
        //log.info(outputStreamCaptor.toString());
    }

    @Test
    void review(){
        PrintStream standardOut = System.out;
        InputStream sI = System.in;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        ByteArrayInputStream iSC = new ByteArrayInputStream("1\nwewnart\n".getBytes());
        System.setIn(iSC);

        Run.review();

        System.setIn(sI);
    }

    @Test
    void reviewSecondTest(){


    }

    @Test
    void factorial(){
        System.out.println(Run.factorial(3));

    }

    @Test
    void array2dLearn(){
        Run.array2dLearn();
    }
}