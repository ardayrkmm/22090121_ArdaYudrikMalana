/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableM;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_barang_masuk;

/**
 *
 * @author LENOVO
 */
public class TableM_barangM extends AbstractTableModel{
    private List<model_barang_masuk> list = new ArrayList<>();
public void tambahData(model_barang_masuk model_brg){
    list.add(model_brg);
    fireTableRowsInserted(list.size() - 1, list.size() - 1);
   JOptionPane.showMessageDialog(null, "Data telah di tambahkan");
}
public void perbaruiData(int Row,model_barang_masuk model_brg){
       list.add(Row,model_brg);
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
   public void setData(List<model_barang_masuk> list){
       clear();
       this.list.addAll(list);
       fireTableDataChanged();
   }
      public void setData(int index, model_barang_masuk model_brg){
       list.set(index, model_brg);
          fireTableRowsUpdated(index, index);
   }
      
      public model_barang_masuk getData(int index){
          
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
            case 0: return list.get(rowIndex).getNo_masuk();
            case 1: return list.get(rowIndex).getTgl_masuk();
            case 2: return list.get(rowIndex).getTotal_masuk();
            case 3: return list.get(rowIndex).getId_distributor().getId_distributor();
            case 4: return list.get(rowIndex).getId_pengguna().getId_pengguna();
        
            default: return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
                      case 0: return "No Masuk";
            case 1: return "Tanggal Masuk";
            case 2: return "Total Masuk";
            case 3: return "ID Distributor";
            case 4: return "ID Pengguna";
           
            default: return null;
        }
    }
    
}
