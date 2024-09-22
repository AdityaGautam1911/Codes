import java.util.*;

public class strings {
    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony";
        // .equals-->
        // str1 > str2 : +ve value (check ascii value)
        // str1 < str2 : -ve value
        if (name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
        if (name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
        if (new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // SUBSTRING (start , end)
        String name = "TonyStark";
        System.out.println(name.substring(0, 4));

        // STRING TO INT
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        // INT TO STRING
        int number1 = 123;
        String str1 = Integer.toString(number1);
        System.out.println(str1.length());
    }
}
