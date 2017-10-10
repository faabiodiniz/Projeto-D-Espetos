/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;
import Controle.ConexaoBD;
import Visao.menuInicial;
import Visao.verificarSerial;
import java.io.File;
import java.util.Calendar;

/**
 *
 * @author faad2
 */
public class DEspetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexaoBD bdConnection = new ConexaoBD();
        bdConnection.Conexao();
        
        File file = new File("javaX.txt");
        Licensa licensa = new Licensa();        
        if(file.exists()){
            menuInicial principal = new menuInicial();
            principal.setVisible(true);
        }
        else{
            verificarSerial serial = new verificarSerial();
            serial.setVisible(true);
        }
        
        
        
        Carne  O1;
        Cliente O2;
        Calendar c = Calendar.getInstance();
        c.set(1997,03,22);
        
        O1 = new Carne("Picanha", (float) 18.7, 10);
        O2 = new Cliente("Fabio Diniz", "341.411.558.85", "98840-9575", "faad2005@hotmail.com", "Rua jeremias");
        
        System.out.println("Tipo de carne: " + O1.getTipo());
        System.out.println("Preco: " + O1.getPreco());
        System.out.println("Quantidade: " + O1.getQuantidade());
        System.out.println("Nome Cliente: "+ O2.getNome());
        System.out.println("Cpf: " + O2.getCpf());
        System.out.println("Telefone: "+ O2.getTelefone());
        System.out.println("Email: "+ O2.getEmail());
        System.out.println("Endereco: "+ O2.getEndereco());

        System.out.println("Dia: " +c.get(Calendar.DAY_OF_MONTH));
        
    }    
}
