package org.example.sof3061.controller;

import lombok.RequiredArgsConstructor;
import org.example.sof3061.dto.BangDiemDto;
import org.example.sof3061.dto.TodoDto;
import org.example.sof3061.entity.BangDiem;
import org.example.sof3061.service.BangDiemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bangdiem")
@RequiredArgsConstructor
public class BangDiemController {

    private final BangDiemService bangDiemService;

    @GetMapping
    public ResponseEntity<List<BangDiemDto>> getAllBangDiem() {

        List<BangDiemDto> bangDiems = bangDiemService.getAllBangDiem();

        return new ResponseEntity<>(bangDiems, HttpStatus.OK);

        //return ResponseEntity.ok(bangDiems);
    }

    @GetMapping("{id}")
    public ResponseEntity<BangDiemDto> getBangDiem(@PathVariable("id") long bangDiemId) {

        BangDiemDto bangDiemDto = bangDiemService.getBangDiem(bangDiemId);

        return new ResponseEntity<>(bangDiemDto, HttpStatus.OK);
    }
}
