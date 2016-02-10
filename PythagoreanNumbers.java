import java.util.Scanner;

public class PythagoreanNumbers {
    public static void main(String[] args) {


        Scanner scann = new Scanner(System.in);
        int n = Integer.parseInt(scann.nextLine());
        int[] numbers = new int[n];
        int count=0;
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=scann.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers.length ; j++) {
                for (int k =0; k <numbers.length ; k++) {
                    int a=numbers[i];
                    int b=numbers[j];
                    int c=numbers[k];
                    if(a<=b&&(a*a)+(b*b)==c*c){
                        System.out.printf("%d*%d + %d*%d = %d*%d\n",a,a,b,b,c,c);
                        count++;
                    }
                }
            }
        }
        if(count==0){
            System.out.println("No");
        }
    }
}
