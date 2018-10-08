package main;
import animals.*;
//import birds.*;



public class FarmApp {
    public static void main(String[] args) {

        System.out.println( " COW BEFORE: ");
        cow.info();

        while(cow.eat(20));
        while(cow.walk(10));

        System.out.println( "\nCOW AFTER: ");
        cow.info();
    }
}
