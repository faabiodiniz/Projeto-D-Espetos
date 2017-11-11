/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControlEstoque;
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
        super(vDados, new String[]{"id" ,"Nome", "Quantidade em Estoque(KG)", "Valor(R$)", "Data de Validade"});
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
                return carne.getValidade();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
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
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        /*
        if ((columnIndex < 3) || (columnIndex == 5)) {
            return true;
        }
        */
        if(columnIndex > 0)
            // Permite alterar o email, mas nao o nome.
            return true;
        return false;
    }
    
    public void refresh(){
        super.vDados.clear();
        super.vDados.addAll(ControlEstoque.getListOfCarne());
        fireTableDataChanged();
    }
}
