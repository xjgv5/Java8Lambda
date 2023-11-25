package com.xjgv5.java8lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {
        //
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorbi = (nombre,edad) -> {
              //cuerpo de la funcion
            System.out.println(nombre + " tiene " + edad);
        };

        consumidorbi.accept("Andres", 23);
    }
}
