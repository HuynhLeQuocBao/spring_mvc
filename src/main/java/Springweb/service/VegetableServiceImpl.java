/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Springweb.service;

import Springweb.entity.Vegetable3;
import Springweb.repository.VegetableRepository;
import Springweb.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author caothanh
 */
@Service
public class VegetableServiceImpl implements VegetableService {

    @Autowired
    private VegetableRepository vegtableRepository;

    @Override
    public Iterable<Vegetable3> findAll() {

        return vegtableRepository.findAll();

    }

    @Override
    public List<Vegetable3> search(String term) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
