package org.example.sof3061.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.sof3061.dto.BangDiemDto;
import org.example.sof3061.entity.BangDiem;
import org.example.sof3061.exception.ResourceNotFoundException;
import org.example.sof3061.repository.BangDiemRepository;
import org.example.sof3061.service.BangDiemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BangDiemServiceImpl implements BangDiemService {

    private final BangDiemRepository bangDiemRepository;
    private final ModelMapper modelMapper;

    public BangDiemServiceImpl(BangDiemRepository bangDiemRepository, ModelMapper modelMapper) {
        this.bangDiemRepository = bangDiemRepository;
        this.modelMapper = modelMapper;
        TypeMap<BangDiem, BangDiemDto> propertyMapper = modelMapper.createTypeMap(BangDiem.class, BangDiemDto.class);
        propertyMapper.addMappings(mapper -> {
            mapper.map(src -> src.getSinhVien().getHoTen(), BangDiemDto::setHoTen);
            mapper.map(src -> src.getSinhVien().getDiaChi(), BangDiemDto::setDiaChi);
        });

    }

    @Override
    public List<BangDiemDto> getAllBangDiem() {

        //TypeMap<BangDiem, BangDiemDto> propertyMapper = modelMapper.createTypeMap(BangDiem.class, BangDiemDto.class);
        //propertyMapper.addMappings(mapper -> {
        //    mapper.map(src -> src.getSinhVien().getHoTen(), BangDiemDto::setHoTen);
        //    mapper.map(src -> src.getSinhVien().getDiaChi(), BangDiemDto::setDiaChi);
        //});

        return bangDiemRepository.findAll().stream()
                .map(i -> modelMapper.map(i, BangDiemDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public BangDiemDto getBangDiem(long id) {

        BangDiem bangDiem = bangDiemRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("BangDiem not found with id: " + id));

        return modelMapper.map(bangDiem, BangDiemDto.class);
    }

    @Override
    public BangDiemDto updateBangDiem(BangDiemDto bangDiemDto, long id) {

        BangDiem bangDiem = bangDiemRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("BangDiem not found with id: " + id));

        bangDiem.setDiemSo(bangDiemDto.getDiemSo());

        BangDiem updatedBangDiem = bangDiemRepository.save(bangDiem);

        return modelMapper.map(updatedBangDiem, BangDiemDto.class);

    }

    @Override
    public void deleteBangDiem(long id) {

        BangDiem bangDiem = bangDiemRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("BangDiem not found with id: " + id));

        bangDiemRepository.deleteById(id);
    }
}
