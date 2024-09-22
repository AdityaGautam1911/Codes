package string;

import java.util.*;

public class string_builder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Aditya Gautam");
        System.out.println(sb);

        // Get Char
        System.out.println(sb.charAt(0));

        // Set Char
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // Insert char
        sb.insert(0, 'S');
        System.out.println(sb);

        // delete char
        sb.delete(0, 1);
        System.out.println(sb);

        //append
        sb.append(" Stark");
        System.out.println(sb);

        //length
        System.out.println(sb.length());
    }
}
