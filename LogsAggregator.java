import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        TreeMap<String,TreeMap<String,Integer>>catalog=new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[]tockens=input.split(" ");
            String ip =tockens[0];
            String name=tockens[1];
            int duration=Integer.parseInt(tockens[2]);
            if(!catalog.containsKey(name)){
                catalog.put(name,new  TreeMap<>());
            }
            if(!catalog.get(name).containsKey(ip)){
                catalog.get(name).put(ip,duration);
            }else{
                Integer old=catalog.get(name).get(ip);
                catalog.get(name).put(ip,duration+old);
            }
            input=scanner.nextLine();
        }
        for (String i: catalog.keySet()) {
            Map<String, Integer> values = catalog.get(i);
            int totalvalues=0;
            for (Integer integer : values.values()) {
                totalvalues+=integer;
            }
            String result =String.format("%s: %d [",i,totalvalues); // i + ": "+totalvalues+" [";
            for (String innerKey : values.keySet()) {
                result += String.format("%s, ", innerKey);
            }
            System.out.println(result.substring(0, result.length()-2)+"]");
        }
    }
}
