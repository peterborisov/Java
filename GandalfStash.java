import java.util.Scanner;
public class GandalfStash {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);
        int mood=Integer.parseInt(scann.nextLine());
        String[]food=scann.nextLine().toLowerCase().split("[^a-z]+");
        for (int i = 0; i < food.length; i++) {
            String foodResult=food[i];
            if(foodResult.equals("cram")){
                mood+=2;
            }
           else if(foodResult.equals("lembas")){
                mood+=3;
            }
            else if(foodResult.equals("apple")){
                mood+=1;
            }
            else if(foodResult.equals("melon")){
                mood+=1;
            }
            else if(foodResult.equals("honeycake")){
                mood+=5;
            }
           else  if(foodResult.equals("mushrooms")){
                mood-=10;
            }
            else{
                mood-=1;
            }
        }
        if(mood<-5){
            System.out.println(mood);
            System.out.println("Angry");
        }
        if(mood>=-5&&mood<0){
            System.out.println(mood);
            System.out.println("Sad");
        }
        if(mood>=0&&mood<15){
            System.out.println(mood);
            System.out.println("Happy");
        }
        if(mood>15){
            System.out.println(mood);
            System.out.println("Special JavaScript mood");
        }
    }
}
