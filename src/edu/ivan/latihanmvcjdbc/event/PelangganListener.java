/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ivan.latihanmvcjdbc.event;

import edu.ivan.latihanmvcjdbc.entity.Pelanggan;
import edu.ivan.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author
 * NIM : 10119003
 * NAMA : IVAN FAATHIRZA
 * KELAS : IF-1
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
}
