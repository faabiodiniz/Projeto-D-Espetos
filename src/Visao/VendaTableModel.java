/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControlVenda;
import d.espetos.Venda;
import java.util.Date;
import java.util.List;

/**
 *
 * @author faad2
 */
public class VendaTableModel extends GenericTableModel{
    
    public VendaTableModel(List vDados) {
        // Use esse vetor de Strings para definir os titulos das colunas:
        super(vDados, new String[]{"id", "Nome Cliente", "Valor", "Desconto", "Data de Compra", "Data de Entrega"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Double.class;
            case 3:
                return Double.class;
            case 4:
                return Date.class;
            case 5:
                return Date.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venda venda = (Venda) vDados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return venda.getIdVenda();
            case 1:
                return venda.getNomeCliente();
            case 2:
                return venda.getValor();
            case 3:
                return venda.getDesconto();
            case 4:
                return venda.getDataCompra();
            case 5:
                return venda.getDataEntrega();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    /*@Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Cliente pessoa = (Cliente) vDados.get(rowIndex);
        switch (columnIndex) {
            case 0:
                break;
            case 1:
                pessoa.setNomeCliente((String) aValue);
                break;
            case 2:
                pessoa.setCpfcnpj((String) aValue);
                break;
            case 3:
                pessoa.setEmailCliente((String) aValue);
                break;
            case 4:
                pessoa.setTelefoneCliente((String) aValue);
                break;
            case 5:
                pessoa.setTipo((String) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        ControlCliente.updateCliente(pessoa);
    }*/
    
    public void refresh(){
        super.vDados.clear();
        super.vDados.addAll(ControlVenda.getListOfVendas());
        fireTableDataChanged();
    }
}
