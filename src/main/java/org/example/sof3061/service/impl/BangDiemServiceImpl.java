package org.example.sof3061.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.sof3061.dto.BangDiemDto;
import org.example.sof3061.entity.BangDiem;
import org.example.sof3061.repository.BangDiemRepository;
import org.example.sof3061.service.BangDiemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BangDiemServiceImpl implements BangDiemService {

    private final BangDiemRepository bangDiemRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<BangDiemDto> getAllBangDiem() {

        TypeMap<BangDiem, BangDiemDto> propertyMapper = modelMapper.createTypeMap(BangDiem.class, BangDiemDto.class);
        propertyMapper.addMappings(mapper -> {
            mapper.map(src -> src.getSinhVien().getHoTen(), BangDiemDto::setHoTen);
            mapper.map(src -> src.getSinhVien().getDiaChi(), BangDiemDto::setDiaChi);
        });

        return bangDiemRepository.findAll().stream()
                .map(i -> modelMapper.map(i, BangDiemDto.class))
                .collect(Collectors.toList());
    }
}
