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


    /**
     * multiplies to numbers without using the '*' operator
     * @param x factor 1
     * @param y factor 2
     * @return product
     */
    static int myMult(int x, int y) {
        int sum = 0;
        int mult = Math.min(x, y);
        int factor = Math.max(x, y);
        for(int i = 0; i < mult; i++){
            sum += factor;
        }
        return sum;
    }

    /**
     * finds the char with the highest ASCII value from an input string.
     * <p>Assumes text.length() > 0</p>
     * @param text the input string
     * @return highest ascii value char
     */
    static char findMaxChar(String text) {
        char maxChar = text.charAt(0);
        for(int i = 1; i < text.length(); i++) {
            if(text.charAt(i) > maxChar) {
                maxChar = text.charAt(i);
            }
        }
        return maxChar;
    }

    /**
     * replaces every character of text at positions that are a natural multiple of n with the param replaceChar
     * @param text
     * @param n base for natural multiples
     * @param replaceChar
     * @return String with replaced Chars
     */
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

    /**
     * print out a pattern for one char
     * <p>n determines how many lines and how many char repetitions are in the first line</p>
     * <p>the first line contains n chars, the second one 1 space and n + 1 chars and so on</p>
     * @param n
     * @param character
     */
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
