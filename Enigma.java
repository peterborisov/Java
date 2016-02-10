import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);
        int n=Integer.parseInt(scann.nextLine());
        int m;
        for (int i = 0; i <n ; i++) {
            String line=scann.nextLine();
            m=line.replaceAll("[\\s\\d]+","").length()/2;
            for (int j = 0; j < line.length(); j++) {
                char current=line.charAt(j);
                if((current>='0'&&current<='9')|| current==' '){
                    System.out.print(current);
                    continue;
                }
                char c= (char) (current+m);
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
