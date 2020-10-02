package com.company;

public class Main {

    public static void main(String[] args) {
	    short result = (short) myMult(3,7);
        String test = "Teststring_Einstufungstest";
	    System.out.println(result);
	    System.out.println(findMaxChar(test));
        System.out.println(findMaxChar("abcdefg"));
        System.out.println(findMaxChar("4321"));

        System.out.println(replaceNthChar(test, 1, '0'));
        System.out.println(replaceNthChar(test, 3, '#'));
        System.out.println(replaceNthChar(test, 10, '~'));
        System.out.println(replaceNthChar(test, 30, 'X'));
        System.out.println(replaceNthChar("A", 1, '#'));
        printPattern(3, '*');
        printPattern(5, '+');

    }

    static int myMult(int x, int y) {
        int sum = 0;
        int mult = Math.min(x, y);
        int factor = Math.max(x, y);
        for(int i = 0; i < mult; i++){
            sum += factor;
        }
        return sum;
    }

    static char findMaxChar(String text) {
        char maxChar = text.charAt(0);
        for(int i = 1; i < text.length(); i++) {
            if(text.charAt(i) > maxChar) {
                maxChar = text.charAt(i);
            }
        }
        return maxChar;
    }

    static String replaceNthChar(String text, int n, char replaceChar) {
        String newString = "";
        for(int i = 0; i < text.length(); i++) {
            if(i != 0 && i % n == 0){
                newString += replaceChar;
            }
            else {
                newString += text.charAt(i);
            }
        }
        return newString;
    }

    static void printPattern(int n, char character) {
        for(int i = 0; i < n; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print(' ');
            }
            for (int j = 0; j < n + i; j++) {
                System.out.print(character);
            }
            System.out.print("\n");
        }
    }
}
