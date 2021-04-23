import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.*;


public class Run {
    public static void main(String[] args) {

       /* System.out.println(changeAds(30));
        DataTypes.dataTypes();*/
        //Run.review();
        binaryNumbers();
    }

    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here
        if (arr.contains(k)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        List<Integer> odd = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if ((i & 1) != 0) {
                odd.add(i);
            }
        }
        return odd;
    }

    public static int changeAds(int base10) {

        String pos = Integer.toBinaryString(base10);

        char result[] = new char[pos.length()];
        for (int i = 0; i < pos.length(); i++) {
            result[i] = pos.charAt(i) == '0' ? '1' : '0';
        }
        return Integer.parseInt(String.valueOf(result), 2);
    }

    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    static String timeConversion(String s) {
        return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"))
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    static long aVeryBigSum(long[] ar) {
        long sum = 0;

        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int sumPrimary = 0;
        int sumSecondary = 0;
        Integer valuePrimary = 0;
        Integer valueSecondary = 0;
        for (int i = 0; i < arr.size(); i++) {
            valuePrimary = arr.get(i).get(i);
            System.out.println(valuePrimary);
            sumPrimary += valuePrimary;
        }

        for (int i = 0; i < arr.size(); i++) {
            int secondArrSize = arr.get(i).size();
            valueSecondary = arr.get(i).get(secondArrSize - 1 - i);
            sumSecondary += valueSecondary;
        }

        return Math.abs(sumPrimary - sumSecondary);
    }

    public static void dataTypes() {
        int a = 4;
        double b = 4.0;
        String str = "HackerRank ";


        Scanner sc = new Scanner(System.in);
        int newA = sc.nextInt();
        System.out.println(newA + a);
        double newB = sc.nextDouble();

        String newC = sc.nextLine();
    }

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {


        return null;
    }

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tipValue = meal_cost * tip_percent;
        double taxValue = meal_cost * tax_percent;
        double fullPrice = meal_cost + tipValue + taxValue;
        System.out.println(Math.round(fullPrice));
    }

    static void switchStatement() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();


        if ((N & 1) == 0) {
            if (N >= 6 && N <= 20) {
                System.out.println("Weired");
            } else if (N >= 2 && N <= 5) {
                System.out.println("Not Weired");
            } else if (N > 20) {
                System.out.println("Not Weired");
            }
        } else {
            System.out.printf("Weired");
        }
    }

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) throws ParseException {
        int numberOfDays = 256;
        ZoneId zoneId = ZoneId.of("Europe/Moscow");
        System.out.println(zoneId);
        if (year <= 1917 && (year % 100) == 0) {
            numberOfDays = 255;
        }
        if (year == 1918) {
            numberOfDays += 13;
        }
        ZonedDateTime zoneTime = ZonedDateTime.of(LocalDate.ofYearDay(year, numberOfDays), LocalTime.now(), zoneId);
        System.out.println(zoneTime);
        String date = LocalDate.ofYearDay(year, numberOfDays).atStartOfDay(zoneId)
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return date;
    }

    static void plusMinus(int[] arr) {

        long negative = Arrays.stream(arr)
                .filter(a -> a < 0)
                .count();

        long positive = Arrays.stream(arr)
                .filter(a -> a > 0)
                .count();

        long zeros = Arrays.stream(arr)
                .filter(a -> a == 0)
                .count();

        int length = arr.length;
        System.out.println(length + " " + (float) negative / length + " " + positive + " " + zeros);

        float propNegative = (float) negative / length;
        float propPositive = (float) positive / length;
        float propZeros = (float) zeros / length;

        System.out.format("%.6f%n", propPositive);
        System.out.println(propNegative);
        System.out.println(propZeros);
    }

    static void staircase(int n) {

        for (int i = 1; i < n + 1; i++) {
            for (int j = n + 1 - i; j > 0 + 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {

                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void review() {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String odd = "";
        String even = "";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            String txt = sc.nextLine();
            if (txt != null) {
                arr[i] = txt;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            for (int j = 0; j < s.length(); j += 2) {
                odd += s.charAt(j);

            }
            for (int j = 1; j < s.length(); j += 2) {
                even += s.charAt(j);
            }
            System.out.println(odd + " " + even);
            odd = "";
            even = "";
        }
    }

    static void javaOutputFormatting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d %n", s1, x);
        }
        System.out.println("================================");
    }

    static void reverseWord() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String R = "";
        for (int i = A.length(); i > 0; i--) {
            R = R + A.charAt(i - 1);
        }

        if (A.equals(R)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void dictAndMaps() {
        Map<String, Integer> myMap;

// Initialize it as a new String to String HashMap
        myMap = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (null == myMap.get(s)) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + myMap.get(s));
            }
        }
        in.close();
    }

    static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        }

        return n;
    }

    static void binaryNumbers() {
        int n = 439;
        int count = 0, min = 0;
        String pos = Integer.toBinaryString(n);
        System.out.println(pos);

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            } else {
                count = 0;
            }
            n = n / 2;

            if (count >= min) {
                min = count;
            }
            System.out.println(n + " " + count + " " + min);
        }
        System.out.println(min);
        count = 0;
        min = 0;
        for (int i = 0; i < pos.length(); i++) {
            if (pos.charAt(i) == '1') {
                count++;
            } else {
                count = 0;
            }

            if (count >= min) {
                min = count;
            }
        }
        System.out.println(min);
    }

    static void array2dLearn() {
        int rowSize = 6;
        int colSize = 6;
        int[][] myArray = new int[rowSize][colSize];

        int count = 0;

        for (int i = 0; i < rowSize; i++) {

            for (int j = 0; j < colSize; j++, count++) {
                myArray[i][j] = count;
            }
        }

        for (int i = 0; i < rowSize; i++) {

            // print the row of space-separated values
            for (int j = 0; j < colSize; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            // end of row is reached, print newline
            System.out.println();
        }
        int x = 0;
        int sum = 0;
        for (int shiftY = 0; shiftY < 4; shiftY++) {

            for (int shift = 0; shift < 4; shift++) {
                for (int i = 0 + shiftY; i < 3 + shiftY; i++) {
                    sum = 0;
                    for (int j = 0 + shift; j < 3 + shift; j++) {
                        x = myArray[i][j];
                        sum += x;
                        System.out.print(x + " ");
                    }
                    System.out.println(" sum: " + sum);
                }
            }
            System.out.println(sum);
        }
    }
}