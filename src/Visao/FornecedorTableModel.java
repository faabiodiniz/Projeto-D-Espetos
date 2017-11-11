/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControlFornecedor;
import d.espetos.Fornecedor;
import java.util.List;

/**
 *
 * @author faad2
 */
public class FornecedorTableModel extends GenericTableModel{
    public FornecedorTableModel(List vDados) {
        // Use esse vetor de Strings para definir os titulos das colunas:
        super(vDados, new String[]{"id", "Nome", "CNPJ", "Email", "Telefone", "Rua","Numero","Bairro","Cidade","Estado"});
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
            case 6:
                return String.class;
            case 7:
                return Integer.class;
            case 8:
            return String.class;
            case 9:
            return String.class;
            case 10:
            return String.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fornecedor fornecedor = (Fornecedor) vDados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return fornecedor.getIdFornecedor();
            case 1:
                return fornecedor.getNomeFornecedor();
            case 2:
                return fornecedor.getCnpj();
            case 3:
                return fornecedor.getEmail();
            case 4:
                return fornecedor.getTelefone();
            case 5:
                return fornecedor.getRua();
            case 6:
                return fornecedor.getNumero();
            case 7:
                return fornecedor.getBairro();
            case 8:
                return fornecedor.getCidade();
            case 9:
                return fornecedor.getEstado();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Fornecedor pessoa = (Fornecedor) vDados.get(rowIndex);
        switch (columnIndex) {
            case 0:
                break;
            case 1:
                pessoa.setNomeFornecedor((String) aValue);
                break;
            case 2:
                pessoa.setCnpj((String) aValue);
                break;
            case 3:
                pessoa.setEmail((String) aValue);
                break;
            case 4:
                pessoa.setTelefone((String) aValue);
                break;
            case 5:
                pessoa.setRua((String) aValue);
                break;
            case 6:
                pessoa.setNumero((int) aValue);
                break;
            case 7:
                pessoa.setBairro((String) aValue);
                break;
            case 8:
                pessoa.setCidade((String) aValue);
                break;
            case 9:
                pessoa.setEstado((String) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        ControlFornecedor.updateCliente(pessoa);
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
        super.vDados.addAll(ControlFornecedor.getListOfFornecedor());
        fireTableDataChanged();
    }
}
