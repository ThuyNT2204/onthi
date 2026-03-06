package org.example.service;

public class XepLoai {
    public String xepLoai(double diemTrungBinh){
        if (diemTrungBinh<0 || diemTrungBinh>10){
            throw new IllegalArgumentException("diem tb tu 0-10");
        }
        if(diemTrungBinh>=9){
            return "xuat sac";
        }
        if(diemTrungBinh>=7 && diemTrungBinh<9){
            return "gioi";
        }
        if(diemTrungBinh>=5 && diemTrungBinh<7){
            return "trung binh";
        }
        if(diemTrungBinh<5){
            return "yeu";
        }
        throw new IllegalArgumentException("diem trung binh k dc trong");
    }
}
