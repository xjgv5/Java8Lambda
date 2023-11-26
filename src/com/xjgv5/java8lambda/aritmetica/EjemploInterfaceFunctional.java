package com.xjgv5.java8lambda.aritmetica;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {
        Aritmetica suma = Double::sum;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora calc = new Calculadora();
        System.out.println(calc.computar(10, 5, suma));
        System.out.println(calc.computar(5, 2, resta));
        System.out.println(calc.computar(2, 6, (a, b) -> a * b));
        System.out.println(calc.computarConBiFunction(10, 5, Double::sum));
    }
}
