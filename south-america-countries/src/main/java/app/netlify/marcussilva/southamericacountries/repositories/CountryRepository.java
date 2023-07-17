package app.netlify.marcussilva.southamericacountries.repositories;

import app.netlify.marcussilva.southamericacountries.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
