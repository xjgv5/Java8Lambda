package com.xjgv5.java8lambda;

import com.xjgv5.java8lambda.models.Usuario;

import java.util.Locale;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 10;
        System.out.println(test.test(8));

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("es admin ? " + t2.test("ROLE_ADMIN"));

        String a, b;
        a = "gato";
        b = a;
        BiPredicate<String, String> t3 = String::equals; //(a, b) -> a.equals(b)
        System.out.println(a + " es igual a " + b + " : " + t3.test("perro", "gato"));
        BiPredicate<Integer, Integer> t4 = (i, j) -> i > j;
        System.out.println(t4.test(6, 5));

        Usuario usuario = new Usuario();
        Usuario usuario1 = new Usuario();

        usuario.setNombre("Maria");
        usuario1.setNombre("maria");

        BiPredicate<Usuario, Usuario> t5 = (ua, ub) -> ua.getNombre().equalsIgnoreCase(ub.getNombre());
        System.out.println(t5.test(usuario1, usuario));

    }
}
