package org.betavzw.introj;

public class Main {

    public static void main(String[] args) {
	    int number = 42;
        double distance = 42.195;
        String race = "marathon";
        System.out.printf("The answer to life, the universe and everything is %d\n", number);
        System.out.printf("The %s is %5.2f kilometer long.\n", race, distance);
        String name = System.console().readLine("What is your name: ");
        System.out.printf("Hi %s", name);
    }
}
