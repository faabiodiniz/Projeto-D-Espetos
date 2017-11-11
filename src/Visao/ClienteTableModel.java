package Visao;

import Controle.ControlCliente;
import controle.*;
import java.util.ArrayList;
import d.espetos.*;
import java.util.List;

/**
 *
 * @author prvilela
 */
public class ClienteTableModel extends GenericTableModel {

    public ClienteTableModel(List vDados) {
        // Use esse vetor de Strings para definir os titulos das colunas:
        super(vDados, new String[]{"id", "Nome", "CPF", "Email", "Telefone", "Tipo"});
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
        Cliente pessoa = (Cliente) vDados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return pessoa.getIdCliente();
            case 1:
                return pessoa.getNomeCliente();
            case 2:
                return pessoa.getCpfcnpj();
            case 3:
                return pessoa.getEmailCliente();
            case 4:
                return pessoa.getTelefoneCliente();
            case 5:
                return pessoa.getTipo();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
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
        super.vDados.addAll(ControlCliente.getListOfClientes());
        fireTableDataChanged();
    }
}
