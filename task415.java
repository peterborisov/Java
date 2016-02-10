import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class task415 {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);
        String input=scann.nextLine();
        LinkedHashMap<String,TreeMap<String,String>> catalog=new LinkedHashMap<>();
        while (!input.equals("END")){
            String[]tockens=input.trim().split("[\\[\\]]");
            String project=tockens[1];
            String error=tockens[3];
            String message=tockens[5];
if(!catalog.containsKey(project)){
    catalog.put(project,new TreeMap<>());
}
            if(!catalog.get(project).containsKey(error)){
                catalog.get(project).put(error,message);
            }else {
                catalog.get(project).put(error,message);
            }
            input=scann.nextLine();
        }
        for (String i : catalog.keySet()) {
            System.out.printf("%s", i.substring(1,i.length()-1) + ":");
            System.out.println();
            TreeMap<String, String> values=catalog.get(i);
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> j : values.entrySet()) {
                sb.append(String.format("%s ---> %s\n", j.getKey().substring(1,j.getKey().length()-1), j.getValue().substring(1,j.getValue().length()-1)));
            }
            String result = sb.toString();
            result=result.substring(0,sb.length()-2);
            System.out.println(result);
        }
    }
}
