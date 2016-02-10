import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Largest3Rectangles {
    public static void main(String[] args) {
        // Parse the rectangles and collect their areas
        Scanner input = new Scanner(System.in);
        String rectangles = input.nextLine();
        rectangles = rectangles.replace("[", "");
        rectangles = rectangles.replace(" ", "");
        String[] rects = rectangles.split("]");
int  max= Integer.MIN_VALUE;
        for (int i = 0; i < rects.length; i++) {
            for (int j = 0; j <rects.length ; j++) {
                for (int k = 0; k <rects.length ; k++) {
                    String rect = rects[i];
                    rect = rect.replace("[", "");
                    String[] sides = rect.split("x");
                    int firstSide = Integer.parseInt(sides[0]);
                    int secondSide = Integer.parseInt(sides[1]);
                    int sum = firstSide * secondSide;
if(sum>max){
    max=sum;
}
                    System.out.println(sum);
                }
            }
        }

    }
}

