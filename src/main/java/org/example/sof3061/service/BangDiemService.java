package org.example.sof3061.service;

import org.example.sof3061.dto.BangDiemDto;
import org.example.sof3061.entity.BangDiem;

import java.util.List;

public interface BangDiemService {

    List<BangDiemDto> getAllBangDiem();

    BangDiemDto getBangDiem(long id);
}
