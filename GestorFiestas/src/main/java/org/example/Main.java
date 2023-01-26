package org.example;

import java.sql.SQLOutput;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
       //EN EL MAIN LLAMO A MIS CLASES
        // EN EN MAIN CREO LOS OBJETOS DE MIS CLASES
        // EN EL MAIN CREO UNA INSTANCIA DE MICLASE
      //EN EL  MAIN LE SACO COPIA A MIS CLASES Y CREO OBJETOS

        Invitado objetoDeClaseInvitado=new Invitado();
        Invitado objeto2=new Invitado(18,true,"jhon",10000);
        Invitado objeto3=new Invitado("jhon");l
        //obtener el valor de los atributos

        System.out.println(objetoDeClaseInvitado.nombre);
        System.out.println(objeto2.nombre);
        System.out.println(objeto3.nombre);
    }
}
