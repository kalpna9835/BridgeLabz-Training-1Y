package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class SubstringCount {

    static int countSub(String str, String sub) {
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String sub = sc.nextLine();

        System.out.println(countSub(str, sub));
    }
}

