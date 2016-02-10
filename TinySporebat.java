import javax.xml.soap.SAAJResult;
import java.util.Scanner;

public class TinySporebat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int health=5800;
        int glowcapSum=0;
        String result=null;
        while (!input.equals("Sporeggar")){
            char[] letters = input.toCharArray();
            int glowcap=Character.getNumericValue(letters[letters.length - 1]);
            for (int i = 0; i <letters.length-1; i++) {
                int damage = (int) letters[i];
                if (damage == 'L') {
                    health += 200;
                } else {
                    health -= damage;
                }
                if (health <= 0) {
                    result="Died. Glowcaps: " +glowcapSum;
                    break;
                }
            }
            if(health<=0){
                break;
            }
            glowcapSum += glowcap;
            input = scanner.nextLine();
        }

        if(result==null) {
            if (glowcapSum >= 30) {
                result = String.format("Health left: %d\nBought the sporebat. Glowcaps left: %d", health, glowcapSum - 30);
            } else {
                result = String.format("Health left: %d\nSafe in Sporeggar, but another %d Glowcaps needed.", health, 30 - glowcapSum);
            }
        }
        System.out.println(result);
    }
}
