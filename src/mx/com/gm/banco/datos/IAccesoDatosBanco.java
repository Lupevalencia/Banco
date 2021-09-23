
package mx.com.gm.banco.datos;

import java.util.List;
import mx.com.gm.banco.domain.*;
import mx.com.gm.banco.excepciones.*;


//Hacer esto con todos y revisar de nuevo
public interface IAccesoDatosBanco {
    /**
     * 
     * @param nombreFicheroClientes
     * Pasamos el nombre del fichero Clientes para ver si existe dicho fichero
     * @return
     * Devuelve un boolean,el cúal sólo puede devolver: true si existe y false si no existe
     * @throws AccesoDatosBanco 
     * Arrojamos una excepción en el caso de que haya algún error de Acceso de Datos
     */
    boolean existeCliente(String nombreFicheroClientes) throws AccesoDatosBanco;
    
    /**
     * 
     * @param nombreFicheroClientes
     * Pasamos el nombre del fichero Clientes para ver si existe dicho fichero y así poder mostrar una lista de su contenido
     * @return
     * Devuelve la lista de Clientes que hay hasta ese momento en el fichero
     * @throws LecturaDatosBanco 
     * Arrojamos una excepción en el caso de que haya algún error de Lectura de datos
     */
    List<Clientes> listarClientes(String nombreFicheroClientes) throws LecturaDatosBanco;
    
    /**
     * 
     * @param nombreFicheroCuentas
     * Pasamos el nombre del fichero Cuentas para ver si existe dicho fichero
     * @return
     * Devuelve un boolean,el cúal sólo puede devolver: true si existe y false si no existe
     * @throws AccesoDatosBanco 
     * Arrojamos una excepción en el caso de que haya algún error de Acceso de datos
     */
    boolean existeCuentaCC(String nombreFicheroCuentas) throws AccesoDatosBanco;
    /**
     * 
     * @param nombreFicheroCuentas
     * Pasamos el nombre del fichero Cuentas para ver si existe dicho fichero y así poder mostrar una lista de su contenido
     * @return
     * Devuelve la lista de Clientes que hay hasta ese momento en el fichero
     * @throws LecturaDatosBanco 
     * Arrojamos una excepción en el caso de que haya algún error de Lectura de datos
     */
    List<Cuentas> listarCuentas(String nombreFicheroCuentas) throws LecturaDatosBanco;
    
    
    /**
     * 
     * @param cliente
     * Le pasamos al método un objeto cliente con sus atributos correspondientes para que el método pueda escribirlo en el fichero de Clientes
     * @param nombreFicheroClientes
     * Pasamos el nombre del fichero Clientes para poder escribir en él
     * @param anexar
     * Le pasamos un boolean anexar para ir añadiendo información del cliente seguida de la anterior. Unión de campos
     * @throws EscrituraDatosBanco 
     * Arrojamos una excepción en el caso de que haya algún error de Escritura de datos
     */
    void escribirFicheroCliente(Clientes cliente ,String nombreFicheroClientes, boolean anexar) throws EscrituraDatosBanco;
    
    /**
     * 
     * @param cuenta
     * Le pasamos al método un objeto cuenta con sus atributos correspondientes para que el método pueda escribirlo en el fichero de Cuentas
     * @param anexar
     * Le pasamos un boolean anexar para ir añadiendo información de la cuenta del cliente seguida de la anterior. Unión de campos
     * @throws EscrituraDatosBanco 
     * Arrojamos una excepción en el caso de que haya algún error de Escritura de datos
     */
    void escribirFicheroCuenta(Cuentas cuenta, boolean anexar) throws EscrituraDatosBanco;
    
    /**
     * 
     * @param nombreFicheroCliente
     * Pasamos el nombre del fichero Clientes para que pueda crearlo antes de escribir en él, una vez ha comprobado si existe ya o no ese fichero
     * @throws AccesoDatosBanco
     * Arrojamos una excepción en el caso de que haya algún error Acceso de datos
     */
    void crearFicheroCliente(String nombreFicheroCliente) throws AccesoDatosBanco;
    
    /**
     * 
     * @param nombreFicheroCuentas
     * Pasamos el nombre del fichero Cuentas para que pueda crearlo antes de escribir en él, una vez ha comprobado si existe ya o no ese fichero
     * @throws AccesoDatosBanco
     * Arrojamos una excepción en el caso de que haya algún error Acceso de datos
     */
    void crearCuentas(String nombreFicheroCuentas) throws AccesoDatosBanco;
    
    /**
     * 
     * @param dni
     * Le pasamos al método el dni de un cliente, para así comprobar si existe en el fichero de Clientes( y con ello en nuestro Banco) y poder acceder a él
     * @param nombreFicheroCliente
     * Pasamos el nombre del fichero Clientes para comprobar que el dni introducido se corresponde con algún cliente
     * @return
     * Devuelve si efectivamente dicho dni corresponde a un cliente de nuestro Banco y por lo tanto podemos acceder a él y a sus campos y cuentas
     * @throws LecturaDatosBanco 
     * Arrojamos una excepción en el caso de que haya algún error de Lectura de datos
     */
    String comprobarDniCliente(String dni, String nombreFicheroCliente)throws LecturaDatosBanco;
    
    /**
     * 
     * @param saldo
     * Le pasamos el dinero que deseamos añadir a la cuenta de un determinado cliente del Banco
     * @param cuenta
     * Le pasamos el objeto cuenta para que así pueda insertar el dinero que desea en la cuenta que quiera de un determinado cliente, sólo necesitamos su dni y cuentas
     * @throws AccesoDatosBanco 
     * Arrojamos una excepción en el caso de que haya algún error de Acceso de datos
     */
    void añadirDinero(float saldo,Cuentas cuenta) throws AccesoDatosBanco;
    /**
     * 
     * @param saldo
     * Le pasamos el dinero que deseamos extraer de la cuenta de un determinado cliente del Banco
     * @param cuenta
     * Le pasamos el objeto cuenta para que así pueda extraer el dinero que desea de la cuenta que quiera de un determinado cliente, sólo necesitamos su dni y cuentas
     * @throws AccesoDatosBanco 
     * Arrojamos una excepción en el caso de que haya algún error de Acceso de datos
     */
    void extraerDinero(float saldo,Cuentas cuenta) throws AccesoDatosBanco;
    /**
     * 
     * @param cuenta
     * Le pasamos el objeto cuenta para que así pueda consultar el dinero que desea de la cuenta que quiera de un determinado cliente, sólo necesitamos su dni y cuentas
     * @return 
     * Devuelve el dinero que haya en la cuenta del cliente indicado
     */
    float consultarDineroCuenta(Cuentas cuenta);
    /**
     * 
     * @param dniACambiar
     * Le pasamos el dni del Cliente que desea cambiar de datos
     * @param cliente 
     * Una vez comprobado que el dni corresponde a un cliente del Banco, le pasamos el nuevo objeto cliente con sus datos que ocupará el lugar del anterior
     */
    void cambiarClienteBanco(String dniACambiar, Clientes cliente);

    /**
     * 
     * @param cuenta
     * Le pasamos el objeto cuenta para que pueda acceder a sus campos: saldo, intereses y comisiones de cada una de sus cuentas
     * @return 
     * Devuelve el saldo que resulta de realizar la operación de las cuentas mensuales: saldo = saldo + intereses - comisiones
     */
    float revisionMensualCuentas(Cuentas cuenta);
   
    
}
