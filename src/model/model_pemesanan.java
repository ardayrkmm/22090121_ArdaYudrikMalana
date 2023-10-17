/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class model_pemesanan {

    public String getNo_pesan() {
        return no_pesan;
    }

    public void setNo_pesan(String no_pesan) {
        this.no_pesan = no_pesan;
    }

    public String getTgl_pesan() {
        return tgl_pesan;
    }

    public void setTgl_pesan(String tgl_pesan) {
        this.tgl_pesan = tgl_pesan;
    }

    public long getTotal_pesan() {
        return total_pesan;
    }

    public void setTotal_pesan(long total_pesan) {
        this.total_pesan = total_pesan;
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

     private String no_pesan;
         private String tgl_pesan;
          private long total_pesan;
       private model_distributor id_distributor;
       private model_pengguna id_pengguna;
    
}
