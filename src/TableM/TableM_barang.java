/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableM;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.model_barang;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class TableM_barang extends AbstractTableModel{
private List<model_barang> list = new ArrayList<>();
public void tambahData(model_barang model_brg){
    list.add(model_brg);
    fireTableRowsInserted(list.size() - 1, list.size() - 1);
   JOptionPane.showMessageDialog(null, "Data telah di tambahkan");
}
public void perbaruiData(int Row,model_barang model_brg){
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
   public void setData(List<model_barang> list){
       clear();
       this.list.addAll(list);
       fireTableDataChanged();
   }
      public void setData(int index, model_barang model_brg){
       list.set(index, model_brg);
          fireTableRowsUpdated(index, index);
   }
      
      public model_barang getData(int index){
          
      return list.get(index);
          
      }
    @Override
    public int getRowCount() {
       return list.size();
    }
   private final String[] columnName = {"No","Kode Barang", "Nama Barang", "Harga Jual", "Harga Beli", "Stok"};
    @Override
    public int getColumnCount() {
       return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return "   " + (rowIndex+1);
        }else{
             switch(columnIndex -1 ){
            case 0: return list.get(rowIndex).getKode_barang();
            case 1: return list.get(rowIndex).getNama_barang();
            case 2: return list.get(rowIndex).getHarga_jual();
            case 3: return list.get(rowIndex).getHarga_beli();
            case 4: return list.get(rowIndex).getStok();
         
            default: return null;
        }
        }
       
    }
    
    public String getColumnName(int column){
        if(column == 0){
            return "   "+ columnName[column];
        }else{
            return columnName[column];
        }
    }
    
}
