package org.example;

public class Main {
    public static void main(String[] args) {
    MyArray myArray = new MyArray(3);
    myArray.add("Елемент 1");
    myArray.add("Елемент 2");
    myArray.add("Елемент 3");

    System.out.println("Кількість елементів у масиві: " + myArray.length());
}
}

