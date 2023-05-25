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
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client v = clients.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return v.getId()+1;
            case 1:
                return v.getName();
            case 2:
                return v.getCpf();
            case 3:
                return v.getRg();
            case 4:
                return v.getEmail();
            case 5:
                return v.getAddress();
            case 6:
                return v.getBairro();
            case 7:
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
                return "ID";
            case 1:
                return "Nome";
            case 2:
                return "CPF";
            case 3:
                return "RG";
            case 4:
                return "Email";
            case 5:
                return "Endereco";
            case 6:
                return "Bairro";
            case 7:
                return "CEP";
            default:
                return "";
        }
    }
    
    public void adicionar(Client c) {
        clients.add(c);
        fireTableRowsInserted(clients.size() - 1, clients.size() - 1);
    }
    
    public int remover(Client c) {
        int index = c.getId();
        clients.remove(c);
        fireTableRowsInserted(clients.size() - 1, clients.size() - 1);
        return index;
    }
    
    public int countList() {
        int size = clients.size();
        return size;
    }
}
