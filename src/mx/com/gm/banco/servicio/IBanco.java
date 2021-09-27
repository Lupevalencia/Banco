
package mx.com.gm.banco.servicio;

import mx.com.gm.banco.domain.*;



public interface IBanco {
    
    String NOMBRE_FICHERO_CLIENTES = "clientes.txt";
    String NOMBRE_FICHERO_CUENTAS = "cuentas.txt";
    
    void ingresarDinero(float saldo, Cuentas cuenta);
    //Llamaría al método comprobar dni. Si no existe, entonces llamo al método crear(cliente y tipo cuenta) y escribir(cliente y cuenta)
    //Si existe, entonces llama al método añadir_dinero
    
    void sacarDinero( float saldo, Cuentas cuenta);
    //llamo al método comprobar dni. Si no existe, entonces, devuelvo. NO existe esa cuenta, NO puede sacar dinero
    //Si existe, llamo método extraer_dinero
    
    float consultarDinero(Cuentas cuenta);
    //Llama al método consultarDinero. Al pasarle la cuenta podemos acceder a cada uno de sus campos, 
    //concretamente al saldo y mostrar dicho campo de cada una de sus cuentas
    
    String cambiarCliente(String dniACambiar, Clientes cliente);
    //Llama al método comprobar dni y una vez aseguramos que es cliente de nuestro Banco, llamamos al método cambiar_cliente y cambiamos los datos
    //del antiguo cliente por los datos del nuevo cliente indicado
    
    float revisionMensual(Cuentas cuenta);
    //LLamamos al método revisión para que acceda a los campos que necesita y haga las operaciones que necesitamos para poder devolver
    //el saldo mensual correspondente a cada cliente del Banco
 }
