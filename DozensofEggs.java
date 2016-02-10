import java.util.Scanner;

public class DozensofEggs {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);
        int egsResult=0;



        for (int i = 0; i < 7; i++) {
            String[] input=scann.nextLine().split(" ");
            int count=Integer.parseInt(input[0]);
            String dozens=input[1];
            switch (dozens){
                case "eggs":{
                    egsResult+=count;
                    break;
                }
                case "dozens":{
                    egsResult+=count*12;
                    break;
                }
            }
          }
        int dozens=egsResult/12;
        int eggs=egsResult%12;
        System.out.printf("%d dozens + %d eggs",dozens,eggs);
       }
    }

