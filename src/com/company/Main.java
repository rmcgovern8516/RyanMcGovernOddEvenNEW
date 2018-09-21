package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "abcdefg";
        System.out.println("Even Characters = "+evenCharacters(input));
        System.out.println("Odd Characters = "+oddCharacters(input));
        System.out.println("Even First Odd Last = "+evenFirstOddLast(input));
    }

    public static String oddCharacters(String input){
        int index = 0;
        String out = "";
        while (index<input.length()){
            out = out+input.substring(index,index+1);
            index = index+2;
        }
        return out;
    }

    public static String evenCharacters(String input){
        int index = 1;
        String out = "";
        while (index<input.length()){
            out = out+input.substring(index,index+1);
            index = index+2;
        }
        return out;
    }

    public static String evenFirstOddLast(String input){
        int evenIndex = 1;
        int oddIndex = 0;
        String evenOut = "";
        String oddOut = "";
        while (evenIndex<input.length()) {
            evenOut = evenOut + input.substring(evenIndex, evenIndex + 1);
            evenIndex = evenIndex + 2;
        }

        while (oddIndex<input.length()){
            oddOut = oddOut+input.substring(oddIndex,oddIndex+1);
            oddIndex = oddIndex+2;
        }
        return evenOut+oddOut;
    }

}
