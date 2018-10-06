package hometask2;
import hometask2.StringChanger;

/**
 * This test class is used to check the work of class "StringChanger.java"
 */

public class Checker {

    public static void main(String[] args){

        String s = "World";
        String sen = "aaa bb cc cc vv";
        String sentence ="Clean Roof";

        StringChanger test = new StringChanger();
        System.out.println("Task number 9.13");
        test.stringPartOut(2, s);
        System.out.println("Task number 9.14");
        test.stringPartOut(s.length()-1, s);
        System.out.println("Task number 9.15");
        test.stringPartOut(test.stringPositionIn(), s);
        System.out.println("Task number 9.64");
        test.countSymbols(sen);
        System.out.println("Task number 9.100");
        test.changePositionOfSymbols(s);
        System.out.println("Additional Task");
        test.changeOrderOfSymbols(sentence);

    }
}
