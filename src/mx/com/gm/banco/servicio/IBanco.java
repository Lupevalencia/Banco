
package mx.com.gm.banco.servicio;

import mx.com.gm.banco.domain.*;



public interface IBanco {
    
    String NOMBRE_FICHERO_CLIENTES = "clientes.txt";
    String NOMBRE_FICHERO_CUENTACC = "cuentaCC.txt";
    String NOMBRE_FICHERO_CUNETACV = "cuentaCV.txt";
    String NOMBRE_FICHERO_CUENTAFI = "cuentaFI.txt";
    
    void ingresarDinero(String dni, float saldo);
    //Llamaría al método comprobar dni. Si no existe, entonces llamo al método crear(cliente y tipo cuenta) y escribir(cliente y cuenta)
    //Si existe, entonces llama al método añadir_dinero
    
    void sacarDinero(String dni, float saldo);
    //llamo al método comprobar dni. Si no existe, entonces, devuelvo. NO existe esa cuenta, NO puede sacar dinero
    //Si existe, llamo método extraer dinero
    
    void consultarDinero(String dni);
        //llamo al listar cuenta de cada una de ellas con el campo 2 que corrresponde al saldo
    String cambiarCliente(String dniACambiar, Clientes cliente);
    
    void revisionMensual(String dni);
 }
