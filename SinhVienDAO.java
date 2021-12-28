/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MY HP
 */
public class SinhVienDAO {
    public static List<SinhVien> ls = new ArrayList<>();
    public int add(SinhVien sv){
        ls.add(sv);
        return 1;
    }
    public List<SinhVien> getAllSinhVien(){
        return ls;
    }
    public int delSinhVienByID(String ma){
        for(SinhVien sv : ls){
            if(sv.getMaSV().equalsIgnoreCase(ma)){
                ls.remove(sv);
                return 1;
            }
        }
        return -1;
    }
    public SinhVien getSinhVienByID(String id){
        for(SinhVien sv : ls){
            if(sv.getMaSV().equalsIgnoreCase(id)){
                return sv;
            }
        }
        return null;
    }
    public int updateSinhVienByID(SinhVien svNew){
        for(SinhVien sv : ls){
            if(sv.getMaSV().equalsIgnoreCase(svNew.getMaSV())){
                sv.setDiaChi(svNew.getDiaChi());
                sv.setGioiTinh(svNew.isGioiTinh());
                sv.setHinhAnh(svNew.getHinhAnh());
                sv.setNgaySinh(svNew.getNgaySinh());
                sv.setTenSV(svNew.getTenSV());
                return 1;
            }
        }
        return -1;
    }
}
