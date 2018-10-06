package hometask2;

import java.util.Scanner;

/**
 * String tasks for Epam Java Development Courses.
 * @author Vadim Frants
 * @version 0.1.0
 */

public class StringChanger {

    //this method finds and pulls up to console symbol at needed position
    public void stringPartOut(int position, String s){
        System.out.println("Result is " + s.charAt(position));
    }

    //this method initializes the stream to insert position at console
    public Integer stringPositionIn(){
        int i;

        Scanner in = new Scanner(System.in);
        System.out.print("Insert position of symbol:");
        i  = in.nextInt();
        return i;
    }

    //this method changes the positions of 2 and 5 symbols
    public void changePositionOfSymbols(String s){
        String stemp = (s.substring(0,1) + s.substring(4,5) + s.substring(2,4) + s.substring(1,2));
        System.out.println(stemp);
    }

    //this method changes the order of symbols to reverse order
    public void changeOrderOfSymbols(String sen){
        String[] subStr= sen.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<subStr.length; i++){
            for(int b = subStr[i].length() - 1; b >= 0; b--){
                str.append(subStr[i].charAt(b));
            }
            str.append(" ");
            //System.out.println(subStr[i]);
        }
        System.out.println(str);
    }

    //this method count equals symbols in string
    public void countSymbols(String sen){
        int count = 0;
        int temp = 0;
        char tempchar = '\u0000';

        for (int i = 0; i < sen.length(); i++) {
            if (i == sen.length() - 1){

            } else if(sen.charAt(i) == sen.charAt(i+1)){
                temp++;
                tempchar = sen.charAt(i);
            }
            if (tempchar != sen.charAt(i)){
                temp++;
                tempchar = '\u0000';
            }
            if ((tempchar == sen.charAt(i)) && (i == sen.length() - 1)){
                temp++;
            }
            count += temp;
            temp = 0;
        }
        System.out.println(count);
    }
}
