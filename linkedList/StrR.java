package linkedList;

import java.util.Scanner;

public class StrR {
    
    public static void main(String[] args) {
        String a = "a()";
        System.out.println(a.replace("()", "(1)"));

        Scanner sc = new Scanner(System.in);
        String[] calls = new String[101];
        for (int i = 0; i < calls.length; i++) {
            calls[i] = sc.nextLine();
        }
        String[] params = new String[101];
        for (int i = 0; i < params.length; i++) {
            params[i] = sc.nextLine();
        }
        for (int i = 0; i < calls.length; i++) {
            calls[i] = calls[i].replace("()", params[i]);   
        }
        for (int i = 0; i < calls.length; i++) {
            System.out.println(calls[i]);
        }
    }
}