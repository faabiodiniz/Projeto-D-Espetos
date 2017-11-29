/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControlCarne;
import d.espetos.Carne;
import java.util.Date;
import java.util.List;

/**
 *
 * @author faad2
 */
public class CarneTableModel extends GenericTableModel{
    public CarneTableModel(List vDados) {
        // Use esse vetor de Strings para definir os titulos das colunas:
        super(vDados, new String[]{"id" ,"Nome", "QTD (KG)", "Valor(R$)", "Fabricaçao","Validade", "Marca", "Codigo Tipo", "Tipo"});
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
            case 6:
                return String.class;
            case 7:
                return Integer.class;
            case 8:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Carne carne = (Carne) vDados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return carne.getIdProduto();
            case 1:
                return carne.getNomeCarne();
            case 2:
                return carne.getQuantidade();
            case 3:
                return carne.getValorCusto();
            case 4:
                return carne.getFabricacao();
            case 5:
                return carne.getValidade();
            case 6:
                return carne.getMarca();
            case 7:
                return carne.getCodTipo();
            case 8:
                return carne.getTipo();
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
    
    public void refresh(){
        super.vDados.clear();
        super.vDados.addAll(ControlCarne.getListOfCarne());
        fireTableDataChanged();
    }
}
