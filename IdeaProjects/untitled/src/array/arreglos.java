package array;

import javax.swing.*;

public class arreglos {

    private String nombres [];
    private  int cantidad;

    public arreglos(String nombres[], int cantidad)
    {
        this.nombres = nombres;
        this.cantidad = cantidad;
    }

    public void getentrada()
    {
        for ( String nombre : nombres) {
            if (nombre.equals(nombres)) {
                System.out.println(nombre);
            }
            else {
                System.out.println("vienvenido "+ nombre);
            }
        }
    }

    public static void main(String[] args) {
        String[] nombres = {"danobis", "juan", "andres"};
        arreglos intento = new arreglos(nombres,4);
        intento.getentrada();
    }
}