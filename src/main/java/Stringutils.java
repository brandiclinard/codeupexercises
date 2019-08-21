import java.util.Scanner;

public class Stringutils {
            //    Tells whether or not what the user entered is a number


            //    Flips the case of the string
    public static String changeCase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
            return new String(chars);
            }




    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something:");

        if(scanner.hasNextInt()){
                    String input = scanner.nextLine();

            System.out.println(input + " is a number!");
        }

        if(scanner.hasNextLine()){
                    String input = scanner.nextLine();

            System.out.println(input + " is not a number!");
//            System.out.println(input.toUpperCase());
            System.out.println(changeCase(input));
            StringBuilder sb = new StringBuilder(input);
            System.out.println(sb.reverse().toString());
        }


    }



}
