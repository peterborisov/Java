import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        LinkedHashMap<String,TreeMap<String,Integer>> catalog=new LinkedHashMap<>();
    for (int i = 0; i < n; i++) {
        String[] tockens = input.split(" ");
        String name = tockens[0];
        Integer amount = Integer.parseInt(tockens[1]);
        String product = tockens[2];
        if (!catalog.containsKey(product)) {
            catalog.put(product, new TreeMap<>());
        }
        if (!catalog.get(product).containsKey(name)) {
            catalog.get(product).put(name, amount);
        } else {
            Integer old = catalog.get(product).get(name);
            catalog.get(product).put(name, old + amount);
        }
        input = scanner.nextLine();
}

        for (String i: catalog.keySet()) {
            TreeMap<String, Integer> values = catalog.get(i);
            String result =String.format("%s: ",i);

            for (Map.Entry j : values.entrySet()) {
                result += String.format("%s %d, ", j.getKey(),j.getValue());
            }
            System.out.println(result.substring(0, result.length()-2));
        }
    }
}
