import sun.reflect.generics.tree.Tree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OfficeStuff {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = Integer.parseInt(scann.nextLine());

        Map<String, Map<String, Integer>> ordersMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputs = scann.nextLine().split(" - ");
            String company = inputs[0].substring(1, inputs[0].length());
            int amount = Integer.parseInt(inputs[1]);
            String product =inputs[2].substring(0, inputs[2].length()-1);

            if (!ordersMap.containsKey(company)) {
                ordersMap.put(company, new LinkedHashMap<>());
                ordersMap.get(company).put(product, amount);
            } else {
                if (ordersMap.get(company).get(product) == null) {
                    ordersMap.get(company).put(product, amount);
                } else {
                    int oldAmount = ordersMap.get(company).get(product);
                    ordersMap.get(company).put(product, (amount + oldAmount));
                }
            }
        }
        for (String key: ordersMap.keySet()) {
            String result = key + ": ";
            Map<String, Integer> innerMap = ordersMap.get(key);
            for (String innerKey : innerMap.keySet()) {
                result += String.format("%s-%d, ", innerKey, innerMap.get(innerKey));
            }
            System.out.println(result.substring(0, result.length()-2));
        }
    }
}

