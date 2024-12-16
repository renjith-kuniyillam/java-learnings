package com.MyChar;

public class MyChar {
    private char character;

    public MyChar(char ch) {
        this.character = ch;
    }

    public boolean isVowel() {
        if (this.character == 'a' ||
                this.character == 'e' ||
                this.character == 'i' ||
                this.character == 'o' ||
                this.character == 'u' ||
                this.character == 'A' ||
                this.character == 'E' ||
                this.character == 'I' ||
                this.character == 'O' ||
                this.character == 'U'
        ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNumber() {
        //between '0' and '9'
        if(this.character >= 48  || this.character <= 57 ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAlphabet() {
        if(this.character >= 97  && this.character <= 122) {
            return true;
        }
        if(this.character >= 65  && this.character <= 90) {
            return true;
        }
        return false;

    }

    public static void printAllSmallAlphabets() {
        for(char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }
    public static void printAllUpperAlphabets() {
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }




}
