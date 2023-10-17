/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import model.model_detailpmsnan;

/**
 *
 * @author LENOVO
 */
public interface service_detPemesanan {
    void tambahData(model_detailpmsnan modDP);
        void sumTotal(model_detailpmsnan modDP);
        void hapusSementara(model_detailpmsnan modDP);
       model_detailpmsnan getById(String id);
    List<model_detailpmsnan> ambilData();
       List<model_detailpmsnan> pencarian(String id);
    
}
