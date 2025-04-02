package org.example.sof3061.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.sof3061.entity.SinhVien;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BangDiemDto {

    private int id;
    private String maDiem;


    private String hoTen; // hoTen of SinhVien
    private String diaChi; // diaChi of SinhVien


    private String monHoc;
    private double diemSo;
}
