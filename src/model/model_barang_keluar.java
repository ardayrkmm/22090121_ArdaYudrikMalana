/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class model_barang_keluar {

    public String getNo_keluar() {
        return no_keluar;
    }

    public void setNo_keluar(String no_keluar) {
        this.no_keluar = no_keluar;
    }

    public String getTgl_keluar() {
        return tgl_keluar;
    }

    public void setTgl_keluar(String tgl_keluar) {
        this.tgl_keluar = tgl_keluar;
    }

    public Long getTotal_keluar() {
        return total_keluar;
    }

    public void setTotal_keluar(Long total_keluar) {
        this.total_keluar = total_keluar;
    }

    public model_pengguna getId_pengguna() {
        return id_pengguna;
    }

    public void setId_pengguna(model_pengguna id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
     private String no_keluar;
      private String tgl_keluar;
       private Long total_keluar;
        private model_pengguna id_pengguna;
}
