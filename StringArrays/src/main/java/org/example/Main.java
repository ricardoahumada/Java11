package org.example;

public class Main {

    public static void main(String[] args) {
        ProcesadorDNIs ps= new ProcesadorDNIs();

        ps.valor_dni ="Hola mundo!";

        String ref=ps.valor_dni;

        System.out.println(ps.valor_dni);
        System.out.println(ps.aMayusculas());
        System.out.println("ref:"+ref);

        ps.reemplazar('a','@');

        System.out.println("interno:"+ps.valor_dni);
        System.out.println("ref:"+ref);


        ProcesadorDNIs[] arr_ps={new ProcesadorDNIs(), new ProcesadorDNIs(), new ProcesadorDNIs()};

        System.out.println("en array:"+ arr_ps[1].valor_dni);

        ProcesadorDNIs var_1=arr_ps[1];
        var_1.valor_dni ="Hola";
        System.out.println("var_1:"+var_1.valor_dni);
        System.out.println("en array:"+arr_ps[1].valor_dni);

        ProcesadorDNIs var_2=var_1;
        System.out.println("var_2:"+var_2.valor_dni);

        var_2.reemplazar('a','x');
        System.out.println("var_2:"+var_2.valor_dni);
        System.out.println("en array:"+ arr_ps[1].valor_dni);


    }

}