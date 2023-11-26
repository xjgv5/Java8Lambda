package com.xjgv5.java8lambda;

import com.xjgv5.java8lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {
        //
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorbi = (nombre,edad) -> System.out.println(nombre + " tiene " + edad);


        consumidorbi.accept("Andres", 23);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("hola mundo labda");

        List<String> nombre = Arrays.asList("andres", "pepe", "luz", "paco");
        nombre.forEach(consumidor2);

        Supplier<Usuario> crearUsuario = Usuario::new;
        Usuario usuario = new Usuario();

        BiConsumer<Usuario, String> asignarNombre =Usuario::setNombre;



        asignarNombre.accept(usuario, "Andres");

        System.out.println("Nombre usuario : " + usuario.getNombre());

        Supplier<String> proveedor = () -> "hola mundo supplier";

        System.out.println(proveedor.get());
    }
}
