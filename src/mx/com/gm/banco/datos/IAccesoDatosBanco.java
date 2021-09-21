
package mx.com.gm.banco.datos;

import java.util.List;
import mx.com.gm.banco.domain.*;
import mx.com.gm.banco.excepciones.*;



public interface IAccesoDatosBanco {
    boolean existeCliente(String nombreFicheroClientes) throws AccesoDatosBanco;
    List<Clientes> listarClientes(String nombreFicheroClientes) throws LecturaDatosBanco;
    
    boolean existeCuentaCC(String nombreFicheroCuentaCC) throws AccesoDatosBanco;
    List<Cuentas> listarCuentaCC(String nombreFicheroCuentaCC) throws LecturaDatosBanco;
    
    boolean existeCuentaCV(String nombreFicheroCuentaCV) throws AccesoDatosBanco;
    List<Cuentas> listarCuentaCV(String nombreFicheroCuentaCV) throws LecturaDatosBanco;
    
    boolean existeCuentaFI(String nombreFicheroCuentaFI) throws AccesoDatosBanco;
    List<Cuentas> listarCuentaFI(String nombreFicheroCuentaFI) throws LecturaDatosBanco;
    
    
    void escribirCliente(Clientes cliente ,String nombreFicheroClientes, boolean anexar) throws EscrituraDatosBanco;
    
    void escribirCuentaCC(Cuentas cuentacc ,String nombreFicheroCuentaCC, boolean anexar) throws EscrituraDatosBanco;
    void escribirCuentaCV(Cuentas cuentacv ,String nombreFicheroCuentaCV, boolean anexar) throws EscrituraDatosBanco;
    void escribirCuentaFI(Cuentas cuentafi ,String nombreFicheroCuentaFI, boolean anexar) throws EscrituraDatosBanco;
    
    void crearCliente(String nombreFicheroCliente) throws AccesoDatosBanco;
    
    void crearCuentaCC(String nombreFicheroCuentaCC) throws AccesoDatosBanco;
    void crearCuentaCV(String nombreFicheroCuentaCV) throws AccesoDatosBanco;
    void crearCuentaFI(String nombreFicheroCuentaFI) throws AccesoDatosBanco;
    
    String comprobarDniCliente(String dni, String nombreFicheroCliente)throws LecturaDatosBanco;
    
    void añadirDinero(Cuentas cuentacc, Cuentas cuentacv, Cuentas cuentafi) throws AccesoDatosBanco;
    void extraerDinero(Cuentas cuentacc, Cuentas cuentacv, Cuentas cuentafi) throws AccesoDatosBanco;
    void consultarDineroCuenta();
    void cambiarClienteBanco();
    void revisionMensualCuentas();
    //String opcionCuenta(CuentaCC cc, CuentaCV cv, CuentaFI fi);
   
    
}
