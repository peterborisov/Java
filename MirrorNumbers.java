import java.util.Scanner;

public class MirrorNumbers {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);

        int n=Integer.parseInt(scann.nextLine());
        String[]input=scann.nextLine().split(" ");
        int count=0;
        for (int i = 0; i <input.length ; i++) {
            for (int j = i+1; j <input.length ; j++) {
                String a=input[i];
                String b=new StringBuffer(input[j]).reverse().toString();
                StringBuffer reverseB=new StringBuffer(b).reverse();
if(a.equals(b)){
    System.out.printf("%s<!>%s\n",a,reverseB);
    count++;
}
            }
        }
        if(count==0){
            System.out.println("No");
        }
    }
}
