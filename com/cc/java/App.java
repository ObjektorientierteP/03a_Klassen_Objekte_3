package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat("Grizabella", "white", 29);

        output(cat.getStringAttributes("#name"));
        output(cat.getStringAttributes("#color"));

        output(cat.getAge());  
        


        output("-------------------------");
        
        Cat cat2 = new Cat("Alonzo", "grey", 35);

        output(cat2.getStringAttributes("#name"));
        output(cat2.getStringAttributes("#color"));

        output(cat2.getAge()); 

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }


}

