/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import d.espetos.ItemPedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ItemPedidoTableModel extends AbstractTableModel{
    private List<ItemPedido> vDados;
    private String[] colunas = {"Nome" , "QTD(KG)" ,"Valor","Tipo"};

    public ItemPedidoTableModel(){
        vDados = new ArrayList<ItemPedido>();
    }
    
    public void addRow(ItemPedido ip){
        this.vDados.add(ip);
        this.fireTableDataChanged();
    }
 
    public String getColumnName(int num){
        return this.colunas[num];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Double.class;
            case 2:
                return Double.class;
            case 3:
                return String.class;
            case 4:
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
                return item.getC().getNomeCarne();
            case 1:
                return item.getQuantidade();
            case 2:
                return item.getC().getValorCusto();
            case 3:
                return item.getC().getMarca();
            case 4:
                return item.getC().getTipo();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    public void removeRow(int linha){
        this.vDados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
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

    @Override
    public int getRowCount() {
        return vDados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;    
    }
}
