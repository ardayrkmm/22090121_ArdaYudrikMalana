/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableM;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_barang_keluar;

/**
 *
 * @author LENOVO
 */
public class TableM_barangK extends AbstractTableModel{
    private List<model_barang_keluar> list = new ArrayList<>();
public void tambahData(model_barang_keluar model_brgK){
    list.add(model_brgK);
    fireTableRowsInserted(list.size() - 1, list.size() - 1);
   JOptionPane.showMessageDialog(null, "Data telah di tambahkan");
}
public void perbaruiData(int Row,model_barang_keluar model_brg){
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
   public void setData(List<model_barang_keluar> list){
       clear();
       this.list.addAll(list);
       fireTableDataChanged();
   }
      public void setData(int index, model_barang_keluar model_brgK){
       list.set(index, model_brgK);
          fireTableRowsUpdated(index, index);
   }
      
      public model_barang_keluar getData(int index){
          
      return list.get(index);
          
      }
    @Override
    public int getRowCount() {
       return list.size();
    }

    @Override
    public int getColumnCount() {
       return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return list.get(rowIndex).getNo_keluar();
            case 1: return list.get(rowIndex).getTgl_keluar();
            case 2: return list.get(rowIndex).getTotal_keluar();
            case 3: return list.get(rowIndex).getId_pengguna().getId_pengguna();
           
            default: return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
                      case 0: return "No Keluar";
            case 1: return "Tanggal Keluar";
            case 2: return "Total Keluar";
            case 3: return "ID Pengguna";
            
            default: return null;
        }
    }
    
}
