/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;
import ClassesDAO.VendaDAO;
import Controle.ConexaoBD;
import Visao.MenuInicial;
import Visao.VerificarSerial;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;

public class DEspetos {

    public static void main(String[] args) throws ParseException {
        ConexaoBD bdConnection = new ConexaoBD();
        /*DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        Cliente c = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "Físico", "123.456.789-10");
        FormaPagamento formPag = new FormaPagamento(10, 1, 2);
        ArrayList<ItemPedido> vList = null;
        Pedido ped = new Pedido(c, vList);
        Carne ca = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
        //vList.add(e);
        ItemPedido itemPed = new ItemPedido(c, vList, ca, 2.0, (float) 2.0);
        Venda v = new Venda(c, ped, formPag, (float) 10.0, sourceFormat.parse("28/11/2017"), sourceFormat.parse("29/11/2017"));
        //VendaDAO.getInstance().Salvar(v);
        System.out.println("Cliente = " + v.getCliente().getNomeCliente());
        */
        File file = new File("javaX.txt");
        if(file.exists()){
            MenuInicial principal = new MenuInicial();
            principal.setVisible(true);
        }
        else{
            VerificarSerial serial = new VerificarSerial();
            serial.setVisible(true);
        }
    }
}
