import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);
        String input=scann.nextLine();
        TreeMap<String,LinkedHashMap<String,Integer>>catalog=new TreeMap<>();
        while (!input.equals("end")){
            String[]tockens=input.split(" ");
            String ip=tockens[0].substring(3, tockens[0].length());
            String user=tockens[2].substring(5,tockens[2].length());
            if(!catalog.containsKey(user)) {
                catalog.put(user,new LinkedHashMap<>());
            }
            if(!catalog.get(user).containsKey(ip)){
                catalog.get(user).put(ip,1);
            }else {
                Integer count = 0;
                if (catalog.get(user).containsKey(ip)) {
                    count = catalog.get(user).get(ip);
                }

                catalog.get(user).put(ip, count + 1);
            }
            input=scann.nextLine();
        }
        for (String i : catalog.keySet()) {
            System.out.printf("%s", i + ": ");
            System.out.println();
            LinkedHashMap<String,Integer>values=catalog.get(i);
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String,Integer> j : values.entrySet()) {
                sb.append(String.format("%s => %d, ", j.getKey(), j.getValue()));
            }
            String result = sb.toString();
            result=result.substring(0,sb.length()-2)+".";
            System.out.println(result);
        }
    }
}
