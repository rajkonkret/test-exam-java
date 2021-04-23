import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String c = "Tea Tea";
        StringBuilder txt = new StringBuilder(c);
        System.out.println(txt.length());
        System.out.println(txt.capacity());

        String str = "SALES:0,SALE_PRODUCTS:1,EXPENSES:2,EXPENSES_ITEMS:3";
        HashMap<Integer, String> map = (HashMap<Integer, String>) Arrays.asList(str.split(",")).stream()
                .map(s -> s.split(":"))
                .collect(Collectors.toMap(e -> Integer.parseInt(e[1]),e -> e[0]));
        map.forEach((v,k) -> System.out.println(v));
        System.out.println(map.get(0));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
