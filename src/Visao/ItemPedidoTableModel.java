/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import ClassesDAO.VendaDAO;
import Controle.ControlVenda;
import d.espetos.Carne;
import d.espetos.ItemPedido;
import java.util.Date;
import java.util.List;

public class ItemPedidoTableModel extends GenericTableModel{
    public ItemPedidoTableModel(List vDados) {
        // Use esse vetor de Strings para definir os titulos das colunas:
        super(vDados, new String[]{"Codigo Item" ,"Descricao", "QTD (KG)", "Valor(R$)", "Data de Validade", "Marca", "Codigo Tipo", "Tipo"});
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
                return String.class;
            case 6:
                return Integer.class;
            case 7:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItemPedido item = (ItemPedido) vDados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return item.getC().getIdProduto();
            case 1:
                return item.getC().getNomeCarne();
            case 2:
                return item.getQuantidade();
            case 3:
                return item.getValorVenda();
            case 4:
                return item.getC().getValidade();
            case 5:
                return item.getC().getMarca();
            case 6:
                return item.getC().getCodTipo();
            case 7:
                return item.getC().getTipo();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    /*@Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Carne carne = (Carne) vDados.get(rowIndex);
        switch (columnIndex) {
            case 0:
                break;
            case 1:
                carne.setNomeCarne((String) aValue);
                break;
            case 2:
                carne.setQuantidade((double) aValue);
                break;
            case 3:
                carne.setValorCusto((double) aValue);
                break;
            case 4:
                carne.setValidade((Date) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        ControlEstoque.updateCarne(carne);
    }*/
    
    /*public void refresh(){
        
        super.vDados.clear();
        super.vDados.addAll();
        fireTableDataChanged();
    }*/
}
