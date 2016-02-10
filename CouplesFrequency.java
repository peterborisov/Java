import java.util.*;

public class CouplesFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }
        HashMap<String, Integer> counts = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            int first = nums[i - 1];
            int second = nums[i];
            String key = first + " " + second;
            Integer count = counts.get(key);
            if (count == null) {
                count = 0;
            }
            count++;
            counts.put(key, count);
        }

        HashSet<String> printedCouples = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            int first = nums[i - 1];
            int second = nums[i];
            String key = first + " " + second;
            if (!printedCouples.contains(key)) {
                int count = counts.get(key);
                float frequency = (float) count / (nums.length - 1);
                System.out.printf("%s -> %.2f%%\n", key, frequency * 100);
                printedCouples.add(key);
            }
        }
    }
}
