package com.ftv.bikeshopv1.controllers;

import com.ftv.bikeshopv1.models.dto.StockDTO;
import com.ftv.bikeshopv1.models.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProyectoController {

    @Autowired
    private BrandService brandService;

    @Autowired
    private StoreService storeService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private StockService stockService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "Bike Shop v.1");
        return "index";
    }

    @GetMapping("/consultasApi")
    public String consultasApi(Model model) {
        model.addAttribute("titulo", "API - Bike Shop v.1");
        return "consultasApi";
    }

    @GetMapping("/inventario")
    public String monitor(Model model) {
        model.addAttribute("titulo", "Monitor de Inventario");
        model.addAttribute("stocks", stockService.findAll());
        model.addAttribute("brands", brandService.findAll());
        model.addAttribute("stores", storeService.findAll());
        model.addAttribute("categories", categoryService.findAll());
        return "inventario";
    }


    @GetMapping("/producto/{id}")
    private String stock(Model model, @PathVariable Integer id) {
        model.addAttribute("titulo", "Producto");
        model.addAttribute("stocks", stockService.findByProduct_ProductId(id));
        return "producto";
    }

    @PostMapping("/listaFiltrada")
    public String listaFiltrada(
            Model model,
            @RequestParam(required = false) Integer storeId,
            @RequestParam(required = false) Integer categoryId,
            @RequestParam(required = false) Integer brandId) {

        List<StockDTO> filteredStock = stockService.findByFilters(storeId, categoryId, brandId);

        if (storeId == null && categoryId == null && brandId == null) {
            filteredStock = stockService.findAll();
            model.addAttribute("titulo", "Lista NO Filtrada");
        } else {
            model.addAttribute("titulo", "Lista Filtrada");

            if (storeId != null) {
                model.addAttribute("storeFiltered", storeService.findById(storeId));
            }
            if (categoryId != null) {
                model.addAttribute("categoryFiltered", categoryService.findById(categoryId));
            }
            if (brandId != null) {
                model.addAttribute("brandFiltered", brandService.findById(brandId));
            }

            filteredStock = stockService.findByFilters(storeId, categoryId, brandId);
        }

        // Agregar los datos necesarios al modelo

        model.addAttribute("stocks", filteredStock);
        model.addAttribute("stores", storeService.findAll());
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("brands", brandService.findAll());

        return "inventario";
    }

}
