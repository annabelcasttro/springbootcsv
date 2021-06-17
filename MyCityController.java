package br.edu.infnet.csv.demo.controller;


import br.edu.infnet.csv.demo.model.City;
import br.edu.infnet.csv.demo.service.ICityService;
import br.edu.infnet.csv.demo.util.WriteCsvToResponse;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCityController {

    @Autowired
    ICityService cityService;

    @RequestMapping(value = "/cities", produces = "text/csv")
    public void findCities(HttpServletResponse response) throws IOException {

        List<City> cities = (List<City>) cityService.findAll();

        WriteCsvToResponse.writeCities(response.getWriter(), cities);
    }

    @RequestMapping(value = "/cities/{cityId}", produces = "text/csv")
    public void findCity(@PathVariable Long cityId, HttpServletResponse response) throws IOException {

        City city = cityService.findById(cityId);
        WriteCsvToResponse.writeCity(response.getWriter(), city);
    }
}
