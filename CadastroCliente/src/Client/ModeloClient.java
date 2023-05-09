package Client;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloClient extends AbstractTableModel {
    private List<Client> clients = new ArrayList<>();

    @Override
    public int getRowCount() {
        return clients.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client v = clients.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return v.getName();
            case 1:
                return v.getCpf();
            case 2:
                return v.getRg();
            case 3:
                return v.getEmail();
            case 4:
                return v.getAddress();
            case 5:
                return v.getBairro();
            case 6:
                return v.getCep();
            default:
                return "";
        }
    }
    
    public Client getClient(int linha) {
        return clients.get(linha);
    }
    
    public String getColumnName(int coluna) {
        switch(coluna) {
            case 0:
                return "Nome";
            case 1:
                return "CPF";
            case 2:
                return "RG";
            case 3:
                return "Email";
            case 4:
                return "Endereco";
            case 5:
                return "Bairro.";
            case 6:
                return "CEP";
            default:
                return "";
        }
    }
    
    public void adicionar(Client c) {
        clients.add(c);
        fireTableRowsInserted(clients.size() - 1, clients.size() - 1);
    }
    
    public void remover(Client c) {
        clients.remove(c);
        fireTableRowsInserted(clients.size() - 1, clients.size() - 1);
    }
}
