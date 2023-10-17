/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import model.model_detailbrgkeluar;

/**
 *
 * @author LENOVO
 */
public interface service_detBrgKel {
void tambahData(model_detailbrgkeluar modDK);
        void sumTotal(model_detailbrgkeluar modDK);
        void hapusSementara(model_detailbrgkeluar modDK);
       model_detailbrgkeluar getById(String id);
    List<model_detailbrgkeluar> ambilData();
       List<model_detailbrgkeluar> pencarian(String id);
     boolean validasiStok(model_detailbrgkeluar modDK);
}
