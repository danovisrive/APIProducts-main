package array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Nodo {

    public static void main(String[] args) {
        int x = 10, y, z;

        System.out.println("ingrese y");

        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("resultado "+z);
        }
        catch (ArithmeticException ami){
            System.out.println("no se puede dividir por cero");
        }
        catch (InputMismatchException imn){
            System.out.println("introdujo una cadena de texto");
        }

        catch (Exception ex) {
            System.out.println("ERROR: "+ ex.getMessage());
            ex.printStackTrace(System.out);
        }

        }
    }
