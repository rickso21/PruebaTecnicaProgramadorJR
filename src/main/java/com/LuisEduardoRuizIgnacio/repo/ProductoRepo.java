/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LuisEduardoRuizIgnacio.repo;

import com.LuisEduardoRuizIgnacio.Entidades.productos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Felipe
 */
public interface ProductoRepo extends JpaRepository<productos, Integer> {
    
}
