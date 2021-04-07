package com.sevak;

import java.util.Arrays;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random random = new Random();

        int [] array =  new int [20];
        System.out.println("My Array");
        for (int i = 0; i < 20; i++) {
            array[i]=random.nextInt(100)-30;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("--------------------------------");
        System.out.println("Bubble sort (analyze and implement bubble sort)");


        for (int i = 0; i < array.length-1; i++) {
            boolean enough = false;
            for (int j = 0; j < array.length-1-i; j++)
            {
                if(array[j]>array[j+1]) {
                    int current = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = current;
                    enough = true;
                }
            }
            if(!enough) {
                System.out.println("step = "+ i);
                break;
            }
            System.out.println("**************************");
            System.out.println(i+1+". " + Arrays.toString(array));
        }

        System.out.println("\nCreate Logical Structures");

        Car myCar = new Car();
            myCar.setColor("BLACK");
            myCar.setMaxSpeed(220);
            myCar.setModel("Toyota Camry");

        Developer developer = new Developer();
            developer.setName("Sevak");
            developer.setSurName("Tovmasyan");
            developer.setAge((byte) 36);
        developer.setCar(myCar);

        System.out.println("\nDeveloper "+developer.getName()+" "+developer.getSurName()+" "+developer.getAge());
        System.out.println("\nBefore change "+developer.getCar().getColor());
        developer.changeColorCar("WHITE");
        System.out.println("After "+developer.getCar().getColor());
    }
}
