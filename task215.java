import jdk.nashorn.internal.runtime.regexp.joni.Regex;

        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class task215 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String input = scann.nextLine();
        String pattern = "([A-Z][a-z]*).*?([A-Z][a-z]*[A-Z]).*?([0-9]*L)";
        Pattern r = Pattern.compile(pattern);
        StringBuilder sb = new StringBuilder();
        double sum=0;
        while (!input.equals("OK KoftiShans")) {
            sb.append(input.toString());
            sb.append("/n");
            input=scann.nextLine();
        }
        Matcher m = r.matcher(sb);
        while (m.find()) {
            if(true) {
                String l = m.group(3).substring(0, m.group(3).length() - 1);
                System.out.printf("%s brought %s liters of %s!\n", m.group(1), l, m.group(2).toLowerCase());
                double litres=Double.parseDouble(l);
                sum+=litres;
            }
        }
        System.out.printf("%.3f softuni liters",sum/1000);
    }
}