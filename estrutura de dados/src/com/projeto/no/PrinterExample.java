package com.projeto.no;

public class PrinterExample {
    public static void main(String[] args) {
        Printer<String> printString = new Printer<>("Test");
        printString.print();

        Printer<Integer> printInt = new Printer<>(5);
        printInt.print();

        Printer<Double> printDouble = new Printer<>(5.5);
        printDouble.print();
    }
}

