package Class;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloClient extends AbstractTableModel {
    private List<Client> clients = new ArrayList<>();
    private DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    @Override
    public int getRowCount() {
        return clients.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client c = clients.get(rowIndex);
        switch(columnIndex) {
            case 1:
                return c.getName();
            case 2:
                return c.getEmail();
            case 3:
                return df.format(c.getEntrada());
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
