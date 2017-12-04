/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControlCarne;
import d.espetos.Carne;
import java.util.List;

/**
 *
 * @author faad2
 */
public class CarnesDisponiveisTableModel extends GenericTableModel {
    public CarnesDisponiveisTableModel(List vDados) {
        // Use esse vetor de Strings para definir os titulos das colunas:
        super(vDados, new String[]{"id", "Nome", "QTD(KG)", "Marca", "Tipo", "Valor"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
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
                return carne.getCodTipo();
            case 1:
                return carne.getNomeCarne().trim();
            case 2:
                return ControlCarne.format(carne.getQuantidade()).trim();
            case 3:
                return carne.getMarca().trim();
            case 4:
                return carne.getTipo().trim();
            case 5:
                return ControlCarne.format(carne.getValorCusto()).trim();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    public void refresh(){
        super.vDados.clear();
        super.vDados.addAll(ControlCarne.getListOfCarne());
        fireTableDataChanged();
    }
}
