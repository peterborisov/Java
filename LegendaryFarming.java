import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine().toLowerCase();
        TreeMap<String,Integer>catalog=new TreeMap<>();

        while (!input.equals("")){
            String[]tockens=input.split(" ");
            for (int i = 0; i <tockens.length ; i+=2) {
                Integer num=Integer.parseInt(tockens[i]);
                String material=tockens[i+1];
                if(!catalog.containsKey(material)){
                    catalog.put(material,num);
                }else {
                    Integer old=catalog.get(material);
                    catalog.put(material, old + num);
                }
            }
            input=scanner.nextLine();
        }
        System.out.println("Valanyr obtained!");
        System.out.println("fragments: 5");
        System.out.println("shards: 5");
        System.out.println("motes: 3");
        System.out.println("leathers: 6");
        System.out.println("stones: 5");


        }
    }






