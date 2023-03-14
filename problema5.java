import java.util.Scanner;

public class problema5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        String strReversed = "";

        System.out.print("Type a string to be inverted: ");
        str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            strReversed += str.charAt(i);
        }

        System.out.println(strReversed);

        sc.close();
    }
}
