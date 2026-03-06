package org.example.service;

import org.example.entity.BaiHat;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    List<BaiHat> baiHatList = new ArrayList<>();
    public void addBaiHat(BaiHat baiHat){
        if(baiHat==null){
            throw new NullPointerException("k tim thay bai hat");
        }
        if (baiHat.getMa()==null || baiHat.getMa().trim().isEmpty()){
            throw new IllegalArgumentException("ma bai hat k dc de trong");
        }
        if (baiHat.getTen()==null || baiHat.getTen().trim().isEmpty()){
            throw new IllegalArgumentException("ten bai hat k dc de trong");
        }
        if (baiHat.getTenCaSi()==null || baiHat.getTenCaSi().trim().isEmpty()){
            throw new IllegalArgumentException("ten ca si k dc de trong");
        }
        if (baiHat.getTheLoai()==null || baiHat.getTheLoai().trim().isEmpty()){
            throw new IllegalArgumentException("th loai k dc de trong");
        }
        if (baiHat.getThoiLuong()<0){
            throw new IllegalArgumentException("thoi luong bai hat phai lon hon 0");
        }
        if (baiHat.getThoiLuong()<2 || baiHat.getThoiLuong()>5.59f){
            throw new IllegalArgumentException("thoi luong bai hat phai lon hon 2,<5,59");
        }
        baiHatList.add(baiHat);
    }
    public int size(){
        return baiHatList.size();
    }
}
