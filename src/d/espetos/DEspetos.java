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
import java.util.Date;

public class DEspetos {

    public static void main(String[] args) {
        ConexaoBD bdConnection = new ConexaoBD();
        bdConnection.Conexao();
        
        File file = new File("javaX.txt");
        Licenca licensa = new Licenca();        
        if(file.exists()){
            menuInicial principal = new menuInicial();
            principal.setVisible(true);
        }
        else{
            verificarSerial serial = new verificarSerial();
            serial.setVisible(true);
        }
        
        
        
        Boi  carne1;
        Fisico c1;
        Calendar c = Calendar.getInstance();
        c.set(1997,03,22);
        
        carne1 = new Boi("Picanha", (float) 18.7,Date(10,03,2017), Date(10,03,2018), 10);
        c1 = new Fisico("Diego Parreira", 425617648-93, "(19) 9 9160-7229", "d166558@gmail.com", "Rua Pedro Zaccaria", "Jardim Santa Luiza", 621, Date(10,03,1994));
        
        System.out.println("Tipo de carne: " + carne1.getTipo());
        System.out.println("Preco: " + carne1.getValorCusto());
        System.out.println("Quantidade: " + carne1.getQuantidade());
        System.out.println("Nome Cliente: " + c1.getNomeCliente());
        System.out.println("Cpf: " + c1.getCPF());
        System.out.println("Telefone: " + c1.getTelefoneCliente());
        System.out.println("Email: " + c1.getEmailCliente());
        System.out.println("Endereco: "+ c1.getEndereco());

        System.out.println("Dia: " +c.get(Calendar.DAY_OF_MONTH));
        
    }

	private static Date Date(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}    
}
