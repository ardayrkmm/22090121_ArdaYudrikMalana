/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class model_smntrbrgkeluar {

    public String getNo_keluar() {
        return no_keluar;
    }

    public void setNo_keluar(String no_keluar) {
        this.no_keluar = no_keluar;
    }

    public model_barang getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(model_barang kode_barang) {
        this.kode_barang = kode_barang;
    }

    public Long getHarga() {
        return harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    public Integer getJml_keluar() {
        return jml_keluar;
    }

    public void setJml_keluar(Integer jml_keluar) {
        this.jml_keluar = jml_keluar;
    }

    public Long getSubtotal_keluar() {
        return subtotal_keluar;
    }

    public void setSubtotal_keluar(Long subtotal_keluar) {
        this.subtotal_keluar = subtotal_keluar;
    }

       private String no_keluar;
    private model_barang kode_barang;
    private Long harga;
    private Integer jml_keluar;
    private Long subtotal_keluar;
}
