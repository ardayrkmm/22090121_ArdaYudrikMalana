/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import model.model_detailbrgmasuk;

/**
 *
 * @author LENOVO
 */
public interface service_detBrgMsk {
    void tambahData(model_detailbrgmasuk modDM);
        void sumTotal(model_detailbrgmasuk modDM);
        void hapusSementara(model_detailbrgmasuk modDM);
       model_detailbrgmasuk getById(String id);
    List<model_detailbrgmasuk> ambilData();
       List<model_detailbrgmasuk> pencarian(String id);
 
}
