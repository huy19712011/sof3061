package org.example.sof3061.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class BangDiem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String maDiem;

    @ManyToOne
    //@JoinColumn(name = "sinh_vien_id", referencedColumnName = "id")
    private SinhVien sinhVien;

    private String monHoc;
    private double diemSo;
}
