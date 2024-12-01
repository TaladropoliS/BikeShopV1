package com.ftv.bikeshopv1.controllers;

import com.ftv.bikeshopv1.models.dto.StockDTO;
import com.ftv.bikeshopv1.models.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiRestController {

    @Autowired
    private StockService stockService;

    @GetMapping("/api/inventario")
    public ResponseEntity<List<StockDTO>> listar() {
        try {
            List<StockDTO> lista = stockService.findAll();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
