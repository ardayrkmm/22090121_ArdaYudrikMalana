/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class model_smntrpesan {

    public String getNo_pemesanan() {
        return no_pemesanan;
    }

    public void setNo_pemesanan(String no_pemesanan) {
        this.no_pemesanan = no_pemesanan;
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

    public Integer getJml_pemesanan() {
        return jml_pemesanan;
    }

    public void setJml_pemesanan(Integer jml_pemesanan) {
        this.jml_pemesanan = jml_pemesanan;
    }

    public Long getSubtotal_pemesanan() {
        return subtotal_pemesanan;
    }

    public void setSubtotal_pemesanan(Long subtotal_pemesanan) {
        this.subtotal_pemesanan = subtotal_pemesanan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
 private String no_pemesanan;
    private model_barang kode_barang;
    private Long harga;
    private Integer jml_pemesanan;
    private Long subtotal_pemesanan;
    private String status;
}
