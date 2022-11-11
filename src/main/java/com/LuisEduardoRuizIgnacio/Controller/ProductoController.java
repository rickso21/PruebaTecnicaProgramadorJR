/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LuisEduardoRuizIgnacio.Controller;

import com.LuisEduardoRuizIgnacio.Entidades.productos;
import com.LuisEduardoRuizIgnacio.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Felipe
 */
@RestController
@RequestMapping("/PruebaTecnica")
public class ProductoController {
    @Autowired
    
    private ProductoService productoservice;
    @GetMapping
    public List<productos>Lista_productos(){
        return productoservice.Lista_productos();
        
    }

    @PostMapping
    public productos insertar_registro(@RequestBody productos prod){
        return productoservice.insertar_registro(prod);
    }
    @PutMapping
    public productos Actualiza_registro(@RequestBody productos prod){
        return productoservice.Actualiza_registro(prod);
    }
    @DeleteMapping
    public void Elimina_registro(@RequestBody productos prod){
        productoservice.Elimina_registro(prod);
    }
}
