import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OfficeStuff1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        Map<String,Map<String,Integer>>catalog=new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[]tockens=input.split(" - ");
            String company=tockens[0].substring(1, tockens[0].length());
            int amount=Integer.parseInt(tockens[1]);
            String product=tockens[2].substring(0,tockens[2].length()-1);
if(!catalog.containsKey(company)){
    catalog.put(company,new LinkedHashMap<>());
}
            if(!catalog.get(company).containsKey(product)){
                catalog.get(company).put(product,amount);
            }else {
                Integer old=catalog.get(company).get(product);
                catalog.get(company).put(product,old+amount);
            }
            input=scanner.nextLine();
        }
        for (String i: catalog.keySet()) {
            String result = i + ": ";
            Map<String, Integer> values = catalog.get(i);
            for (String j : values.keySet()) {
                result += String.format("%s-%d, ", j, values.get(j));
            }
            System.out.println(result.substring(0, result.length() - 2));
        }
    }
}
