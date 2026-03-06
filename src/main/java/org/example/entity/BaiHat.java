package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaiHat {
    private String ma;
    private String ten;
    private String tenCaSi;
    private float thoiLuong;
    private String theLoai;
}
