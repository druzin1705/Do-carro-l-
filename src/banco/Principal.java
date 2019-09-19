
package banco;

import java.lang.reflect.Array;


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
       
        System.out.println("Mostrando informações do Banco: "+b.getCliente()+"; "+b.getCodBanco()+"; "+b.getFuncionario()+"; "+b.getNome()+"\n");
        System.out.println("Mostrando informações do Cliente: "+c.getBanco()+"; "+c.getCodCliente()+"; "+c.getCredito()+"; \n");
        System.out.println("Mostrando informações do Cliente: "+f.getCodFuncionario()+"; "+f.getSetor()+"; "+f.getBanco()+"; \n");
        System.out.println("Mostrando informações do Cliente: "+p.getNome()+"; "+p.getIdade()+"; "+p.getCpf()+"; \n");
    }
    
}
