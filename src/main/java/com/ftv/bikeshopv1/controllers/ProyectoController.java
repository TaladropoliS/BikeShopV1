package com.ftv.bikeshopv1.controllers;

import com.ftv.bikeshopv1.models.dto.StockDTO;
import com.ftv.bikeshopv1.models.services.ProductService;
import com.ftv.bikeshopv1.models.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProyectoController {

    @Autowired
    private ProductService productService;

    @Autowired
    private StockService stockService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "Bike Shop v.1");
        return "index";
    }

    @GetMapping("/monitor")
    public String monitor(Model model) {
        model.addAttribute("titulo", "Monitor de Inventario");
        model.addAttribute("stock", stockService.findAll());
        return "monitor";
    }

    @GetMapping("/producto/{id}")
    private String producto(Model model, @PathVariable Integer id) {
        model.addAttribute("titulo", "Producto");
        model.addAttribute("producto", productService.findById(id));
        return "producto";
    }

    @GetMapping("/stock/{id}")
    private String stock(Model model, @PathVariable Integer id) {
        model.addAttribute("titulo", "Producto");
        model.addAttribute("stock", stockService.findByProduct(productService.findById(id)));
        return "stock";
    }

}
