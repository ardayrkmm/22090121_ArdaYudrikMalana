/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableM;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.model_distributor;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author LENOVO
 */
public class TableM_distributor extends AbstractTableModel{
    private List<model_distributor> list = new ArrayList<>();
public void tambahData(model_distributor model_dis){
    list.add(model_dis);
    fireTableRowsInserted(list.size() - 1, list.size() - 1);
   JOptionPane.showMessageDialog(null, "Data telah di tambahkan");
}
public void perbaruiData(int Row,model_distributor model_dis){
       list.add(Row,model_dis);
    fireTableDataChanged();
   JOptionPane.showMessageDialog(null, "Data telah di diPerbarui");
}
    public void hapusData(int index){
         list.remove(index);
        fireTableRowsDeleted(index, index);
   JOptionPane.showMessageDialog(null, "Data telah di hapus");
    }
   public void scanBarcode(int index){
       
   }
   
   public void clear(){
       list.clear();
       fireTableDataChanged();
   }
   public void setData(List<model_distributor> list){
       clear();
       this.list.addAll(list);
       fireTableDataChanged();
   }
      public void setData(int index, model_distributor model_dis){
       list.set(index, model_dis);
          fireTableRowsUpdated(index, index);
   }
      
      public model_distributor getData(int index){
          
      return list.get(index);
          
      }
    @Override
    public int getRowCount() {
       return list.size();
    }

    @Override
    public int getColumnCount() {
       return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return list.get(rowIndex).getId_distributor();
            case 1: return list.get(rowIndex).getNama_distributor();
            case 2: return list.get(rowIndex).getAlamat_distributor();
            case 3: return list.get(rowIndex).getTelp_distributor();
         case 4: return list.get(rowIndex).getEmail_distributor();
            default: return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0: return "ID Distributor";
            case 1: return "Nama Distributor";
            case 2: return "Alamat Distributor";
            case 3: return "Telpon Distributor";
           case 4: return "Email Distributor";
            default: return null;
        }
    }
    
}
