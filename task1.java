import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);

        int numberOfPeople=Integer.parseInt(scann.nextLine());
        int numberOfLines=Integer.parseInt(scann.nextLine());
        int meal=0;
        int bed=0;
        for (int i = 0; i < numberOfLines; i++) {
            String[]tockens=scann.nextLine().split(" ");
            String tentsFoodRooms=tockens[0];
            int quantity=Integer.parseInt(tockens[1]);
            String type=tockens[2];
            switch (tentsFoodRooms){
                case "tents":
                    if(type.equals("normal")){
                        bed+=2*quantity;
                    }else {
                        bed+=3*quantity;
                    }
                    break;
                case "food":
                    if(type.equals("musaka")){
                        meal+=2*quantity;
                    }else {
                        meal+=0*quantity;
                    }
                    break;
                case "rooms":
                    if(type.equals("single")){
                        bed+=1*quantity;
                    }else if(type.equals("double")){
                        bed+=2*quantity;
                    }else {
                        bed+=3*quantity;
                    }
                    break;
            }
          //  input=scann.nextLine();
        }
        if(numberOfPeople>bed){
            System.out.printf("Some people are freezing cold. Beds needed: %d \n",numberOfPeople-bed);
        }else {
            System.out.printf("Everyone is happy and sleeping well. Beds left: %d \n",bed-numberOfPeople);
        }
        if(numberOfPeople>meal){
            System.out.printf("People are starving. Meals needed: %d \n",numberOfPeople-meal);
        }else {
            System.out.printf("Nobody left hungry. Meals left: %d \n", meal - numberOfPeople);
        }
    }

}
