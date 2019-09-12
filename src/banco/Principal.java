
package banco;


public class Principal {


    public static void main(String[] args) {
       Banco b = new Banco();
       
       Cliente c = new Cliente();
       c.getBanco();
       c.getCodCliente();
       c.getCredito();       
    }
    
}
