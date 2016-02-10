import java.lang.reflect.Array;
import java.util.*;

public class ActivityTracker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        String input=scan.nextLine();
        TreeMap<Integer,TreeMap<String,Long>>catalog=new  TreeMap<>();

        for (int i = 0; i <n ; i++) {
            String[]tockens =input.split(" ");
            String[] datetime= tockens[0].split("/");
            int month=Integer.parseInt(datetime[1]);
            String name=tockens[1];
            Long steps=Long.parseLong(tockens[2]);

            if (!catalog.containsKey(month)){
                catalog.put(month,new TreeMap<>());
            }
            if (!catalog.get(month).containsKey(name)){
                catalog.get(month).put(name,steps);
            }
            else{
                Long oldWeights = catalog.get(month).get(name);
                catalog.get(month).put(name,steps + oldWeights);
            }
            input=scan.nextLine();
        }

        for (Integer i : catalog.keySet()) {
            System.out.print(i + ": ");

            TreeMap<String, Long> names = catalog.get(i);
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Long> j : names.entrySet()) {
                sb.append(String.format("%s(%d), ",j.getKey(),j.getValue()));
            }
            String result = sb.toString();
            result = result.substring(0,result.length()-2);
            System.out.println(result);
        }
    }
}
