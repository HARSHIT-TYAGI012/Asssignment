import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("");
        String str = object.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0) {
                System.out.print("index:");
            }
            System.out.print("\t" + i);
        }

        System.out.println("");
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            if (j == 0) {
                System.out.print("chars:");
            }
            System.out.print("\t" + ch);
        }

    }

}