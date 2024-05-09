package org.example;

public class MyArray {
    private String[] array;
    private int size;

    public MyArray(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    public int length() {
        return size;
    }
    public void add(String element) {
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            System.out.println("Масив заповнений, неможливо додати елемент.");
        }
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Індекс виходить за межі масиву.");
        }
        return array[index];
    }
}
