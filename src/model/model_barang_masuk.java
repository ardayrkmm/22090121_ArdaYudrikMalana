/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class model_barang_masuk {

    public String getNo_masuk() {
        return no_masuk;
    }

    public void setNo_masuk(String no_masuk) {
        this.no_masuk = no_masuk;
    }

    public String getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public Long getTotal_masuk() {
        return total_masuk;
    }

    public void setTotal_masuk(Long total_masuk) {
        this.total_masuk = total_masuk;
    }

    public model_distributor getId_distributor() {
        return id_distributor;
    }

    public void setId_distributor(model_distributor id_distributor) {
        this.id_distributor = id_distributor;
    }

    public model_pengguna getId_pengguna() {
        return id_pengguna;
    }

    public void setId_pengguna(model_pengguna id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
    private String no_masuk;
     private String tgl_masuk;
      private Long total_masuk;
       private model_distributor id_distributor;
          private model_pengguna id_pengguna;
}
