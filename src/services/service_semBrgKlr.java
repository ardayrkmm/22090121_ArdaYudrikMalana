/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import model.model_smntrbrgkeluar;

/**
 *
 * @author LENOVO
 */
public interface service_semBrgKlr {
      void tambahData(model_smntrbrgkeluar model_klr);
    void perbaruiData(model_smntrbrgkeluar model_klr);
    void hapusData(model_smntrbrgkeluar model_klr);
    
    model_smntrbrgkeluar getById(String id);
    List<model_smntrbrgkeluar> ambilData();
}
