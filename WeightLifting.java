import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class WeightLifting {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.nextLine();
            TreeMap<String, TreeMap<String, Long>> catalog = new TreeMap();

            for (int i = 0; i < n; i++) {
                String line = scan.nextLine();
                String[] parts = line.split(" ");
                String name = parts[0];
                String exercice = parts[1];
                Long weights = Long.parseLong(parts[2]);

                if (!catalog.containsKey(name)){
                    catalog.put(name,new TreeMap<>());
                }
                if (!catalog.get(name).containsKey(exercice)){
                    catalog.get(name).put(exercice,weights);
                }
                else{
                    Long oldWeights = catalog.get(name).get(exercice);
                    catalog.get(name).put(exercice,weights + oldWeights);
                }
            }

            for (String name : catalog.keySet()) {
                System.out.print(name + " : ");
                TreeMap<String, Long> amounts = catalog.get(name);
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, Long> item : amounts.entrySet()) {
                    String keys = item.getKey();
                    Long value = item.getValue();
                    sb.append(String.format(keys + " - " + value + " kg, "));
                }
                String result = sb.toString();
                result = result.substring(0,result.length()-2);
                System.out.println(result);
            }
        }
    }
