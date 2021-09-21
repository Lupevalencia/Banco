
package mx.com.gm.banco.presentacion;

import java.util.Scanner;

public class PresentacionBanco {
    public static void main(String[] args) {
               var opcion = -1;
       var scanner = new Scanner(System.in);
       
      while(opcion != 0){
            System.out.println("Elige una opcion : \n"
                    
            + "1. Ingresar dinero\n"
            + "2. Sacar dinero\n"
            + "3. Consultar dinero\n"
            + "4. Cambiar cliente\n"
            + "5. Revisión mensual\n"
            + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el dni de la cuenta en la que desea hacer el ingreso: ");
                    //comprobar dni y llamar método
                    break;   
                case 2:
                    System.out.println("Introduce el dni de la cuenta de la que desea sacar dinero: ");
                    break;
                case 3:
                    System.out.println("Introduce el dni de la cuenta que desea consultar: ");
                    break;
                case 4:
                    System.out.println("Introduce el dni de la cuenta que desea hacer la revisión mensual: ");
                    break;
                case 5:
                
                    break;
                case 0:
                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;                   
                
            }
        }
    }
}
