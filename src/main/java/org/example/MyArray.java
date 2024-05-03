package org.example;

public class MyArray {
    private String[] array;
    private int size;

    // Ініціалізація масиву заданого розміру
    public MyArray(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    // Додавання елемента в масив
    public void add(String element) {
        if (size < array.length) {
            array[size++] = element;
        } else {
            System.out.println("Масив повний. Неможливо додати елемент.");
        }
    }

    // Отримання довжини масиву
    public int length() {
        return size;
    }
}