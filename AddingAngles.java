import java.util.Scanner;
public class AddingAngles {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);
        int n=Integer.parseInt(scann.nextLine());
      int []nums=new int [n];
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scann.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1 ; k <nums.length ; k++) {
                    int a=nums[i];
                    int b=nums[j];
                    int c=nums[k];
                    int sum=a+b+c;
                    if(sum%360==0){
                        System.out.printf("%d + %d + %d = %d degrees\n",a,b,c,sum);
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
