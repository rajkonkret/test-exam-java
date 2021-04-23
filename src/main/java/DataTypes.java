import java.util.Scanner;

public class DataTypes {

    public static void dataTypes() {
        int a = 4;
        double b = 4.0;
        String str = "HackerRank ";


        Scanner sc = new Scanner(System.in);
        int newA = sc.nextInt();
        double newB = sc.nextDouble();
        sc.nextLine();
        String newC = sc.nextLine();

        System.out.println(newA + a);
        System.out.println(b + newB);
        System.out.println(str + newC);
    }
}
