package org.example.sof3061.service;

import org.example.sof3061.dto.BangDiemDto;

import java.util.List;

public interface BangDiemService {

    List<BangDiemDto> getAllBangDiem();

    BangDiemDto getBangDiem(long id);

    BangDiemDto updateBangDiem(BangDiemDto bangDiemDto, long id);

    void deleteBangDiem(long id);
}
