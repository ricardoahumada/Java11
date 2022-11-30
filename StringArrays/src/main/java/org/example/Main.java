package org.example;

public class Main {

    public static void main(String[] args) {

        ProcesadorDNIs ps = new ProcesadorDNIs("hola mundo");
        System.out.println("valor dni:" + ps.getValor_dni());

        ps.setValor_dni("12345678a");
        System.out.println("valor dni:" + ps.getValor_dni());

        ProcesadorDNIs ps2 = new ProcesadorDNIs();
        System.out.println("valor dni 2:" + ps2.getValor_dni());


        ProcesadorDNIs ps3 = new ProcesadorDNIs();

        ProcesadorArrays pa = new ProcesadorArrays(ps, ps2, ps3);
        System.out.println(pa);
        System.out.println("DNI 0:" + pa.lista_dnis[0].getValor_dni());


        ProcesadorArrays pa_mejor = new ProcesadorArrays(new ProcesadorDNIs[]{ps, ps2, ps3, new ProcesadorDNIs()});
        System.out.println(pa_mejor);
        System.out.println("DNI 0:" + pa_mejor.lista_dnis[0].getValor_dni());

        pa_mejor.mostrarValores();

        ProcesadorArrays pa_null=new ProcesadorArrays();
        pa_null.mostrarValores2();

        System.out.println("FIN ejecución!!!");

        /*String ref=ps.valor_dni;

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
        System.out.println("en array:"+ arr_ps[1].valor_dni);*/


    }

}