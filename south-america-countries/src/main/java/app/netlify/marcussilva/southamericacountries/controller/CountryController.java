package app.netlify.marcussilva.southamericacountries.controller;

import app.netlify.marcussilva.southamericacountries.model.Country;
import app.netlify.marcussilva.southamericacountries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173/")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/countries")
    public List<Country> fetchCountry() {
        return countryRepository.findAll();
    }
}
