/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableM;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.model_detailbrgmasuk;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author LENOVO
 */
public class TableM_detailBrgM extends AbstractTableModel{
    private List<model_detailbrgmasuk> list = new ArrayList<>();
public void tambahData(model_detailbrgmasuk model_DbrgM){
    list.add(model_DbrgM);
    fireTableRowsInserted(list.size() - 1, list.size() - 1);
   JOptionPane.showMessageDialog(null, "Data telah di tambahkan");
}
public void perbaruiData(int Row,model_detailbrgmasuk model_DbrgM){
       list.add(Row,model_DbrgM);
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
   public void setData(List<model_detailbrgmasuk> list){
       clear();
       this.list.addAll(list);
       fireTableDataChanged();
   }
      public void setData(int index, model_detailbrgmasuk model_DbrgM){
       list.set(index, model_DbrgM);
          fireTableRowsUpdated(index, index);
   }
      
      public model_detailbrgmasuk getData(int index){
          
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
            case 0: return list.get(rowIndex).getNo_masuk();
            case 1: return list.get(rowIndex).getKode_barang().getKode_barang();
            case 2: return list.get(rowIndex).getJml_masuk();
            case 3: return list.get(rowIndex).getSubtotal_masuk();
         
            default: return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0: return "No Masuk";
            case 1: return "Kode Barang";
            case 2: return "Jumlah Masuk";
            case 3: return "Total Masuk";
          
            default: return null;
        }
    }
    
}
