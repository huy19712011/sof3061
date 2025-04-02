package org.example.sof3061;

import org.example.sof3061.dto.BangDiemDto;
import org.example.sof3061.entity.BangDiem;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sof3061Application {

    @Bean
    public ModelMapper modelMapper() {

        var modelMapper = new ModelMapper();

        //TypeMap<BangDiem, BangDiemDto> propertyMapper = modelMapper.createTypeMap(BangDiem.class, BangDiemDto.class);
        //propertyMapper.addMappings(mapper -> {
        //    mapper.map(src -> src.getSinhVien().getHoTen(), BangDiemDto::setHoTen);
        //    mapper.map(src -> src.getSinhVien().getDiaChi(), BangDiemDto::setDiaChi);
        //});


        return modelMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(Sof3061Application.class, args);
        System.out.println("running...");
    }

}
