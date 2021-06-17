package br.edu.infnet.csv.demo.repository;

import br.edu.infnet.csv.demo.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
