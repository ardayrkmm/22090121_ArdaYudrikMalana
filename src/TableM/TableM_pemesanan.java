/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableM;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.model_pemesanan;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author LENOVO
 */
public class TableM_pemesanan extends AbstractTableModel{
    private List<model_pemesanan> list = new ArrayList<>();
public void tambahData(model_pemesanan model_psn){
    list.add(model_psn);
    fireTableRowsInserted(list.size() - 1, list.size() - 1);
   JOptionPane.showMessageDialog(null, "Data telah di tambahkan");
}
public void perbaruiData(int Row,model_pemesanan model_psn){
       list.add(Row,model_psn);
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
   public void setData(List<model_pemesanan> list){
       clear();
       this.list.addAll(list);
       fireTableDataChanged();
   }
      public void setData(int index, model_pemesanan model_psn){
       list.set(index, model_psn);
          fireTableRowsUpdated(index, index);
   }
      
      public model_pemesanan getData(int index){
          
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
            case 0: return list.get(rowIndex).getNo_pesan();
            case 1: return list.get(rowIndex).getTgl_pesan();
            case 2: return list.get(rowIndex).getTotal_pesan();
            case 3: return list.get(rowIndex).getId_distributor().getId_distributor();
         case 4: return list.get(rowIndex).getId_pengguna().getId_pengguna();
            default: return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0: return "No Pesan";
            case 1: return "Tanggal Pesan";
            case 2: return "Total Pesan";
            case 3: return "ID distributor";
           case 4: return "ID pengguna";
            default: return null;
        }
    }
    
}
