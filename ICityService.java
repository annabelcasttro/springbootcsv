package br.edu.infnet.csv.demo.service;

import br.edu.infnet.csv.demo.model.City;
import java.util.List;

public interface ICityService {

    List<City> findAll();
    City findById(Long id);
}
