
package banco;


public class Principal {


    public static void main(String[] args) 
    {
        //Feito pelo victor
       Banco b = new Banco();
       b.getCliente();
       b.getCodBanco();
       b.getFuncionario();
       b.getNome();
       
       Cliente c = new Cliente();
       c.getBanco();
       c.getCodCliente();
       c.getCredito();       
       
       Funcionario f = new Funcionario();
       f.getCodFuncionario();
       f.getSetor();
       f.getBanco();
       
       Pessoa p = new Pessoa(){};
       p.getNome();
       p.getIdade();
       p.getCpf();
    }
    
}
