package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("iniciando....");

        int num_1=20;
        int num_2=3;

        Operaciones op=new Operaciones();
        Operaciones op2=new Operaciones();

        op.ultima_operacion="ninguna";
        op2.ultima_operacion="vacio";
        System.out.println("Ultima operacion:"+op.ultima_operacion+"::"+op2.ultima_operacion);

        int resultado=op.sumar(num_1,num_2);
        System.out.println("El resultado de sumar ("+num_1+" y "+num_2+") es: "+resultado);
        System.out.println("Ultima operacion:"+op.ultima_operacion+"::"+op2.ultima_operacion);

        double resultado_mod=op.resto(num_1,num_2);
        System.out.println("El resto de dividir ("+num_1+" y "+num_2+") es: "+resultado_mod);
        System.out.println("Ultima operacion:"+op.ultima_operacion+"::"+op2.ultima_operacion);

        double resultado_div=op.div(num_1,num_2);
        System.out.println("El resto de dividir ("+num_1+" y "+num_2+") es: "+resultado_div);
        System.out.println("Ultima operacion:"+op.ultima_operacion+"::"+op2.ultima_operacion);

        System.out.println("fin!");
    }



}