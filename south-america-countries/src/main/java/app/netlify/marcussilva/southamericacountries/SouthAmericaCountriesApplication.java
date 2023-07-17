package app.netlify.marcussilva.southamericacountries;

import app.netlify.marcussilva.southamericacountries.model.Country;
import app.netlify.marcussilva.southamericacountries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.math.BigInteger;

@SpringBootApplication
public class SouthAmericaCountriesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SouthAmericaCountriesApplication.class, args);
	}

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public void run(String... args) throws Exception {

		Country country1 = Country.builder()
				.name("Argentina 🇦🇷")
				.capital("Buenos Aires")
				.population(46044703)
				.area(new BigInteger("2780400"))
				.build();

		Country country2 = Country.builder()
				.name("Bolívia 🇧🇴")
				.capital("Sucre")
				.population(12247471)
				.area(new BigInteger("1098581"))
				.build();

		Country country3 = Country.builder()
				.name("Brasil 🇧🇷")
				.capital("Brasília")
				.population(203062512)
				.area(new BigInteger("8510417771"))
				.build();

		Country country4 = Country.builder()
				.name("Chile 🇨🇱")
				.capital("Santiago")
				.population(19493184)
				.area(new BigInteger("756950"))
				.build();

		Country country5 = Country.builder()
				.name("Colômbia 🇨🇴")
				.capital("Bogotá")
				.population(50372424 )
				.area(new BigInteger("1138914"))
				.build();

		Country country6 = Country.builder()
				.name("Equador 🇪🇨")
				.capital("Quito")
				.population(16385068)
				.area(new BigInteger("256370"))
				.build();

		Country country7 = Country.builder()
				.name("Guiana 🇬🇾")
				.capital("Georgetown")
				.population(786793)
				.area(new BigInteger("214970"))
				.build();

		Country country8 = Country.builder()
				.name("Paraguai 🇵🇾")
				.capital("Assunção")
				.population(7152703)
				.area(new BigInteger("406752"))
				.build();

		Country country9 = Country.builder()
				.name("Peru 🇵🇪")
				.capital("Lima")
				.population(33105273)
				.area(new BigInteger("1285220"))
				.build();

		Country country10 = Country.builder()
				.name("Suriname 🇸🇷")
				.capital("Paramaribo")
				.population(558368)
				.area(new BigInteger("163821"))
				.build();

		Country country11 = Country.builder()
				.name("Uruguai 🇺🇾")
				.capital("Montevidéu")
				.population(3351016)
				.area(new BigInteger("176215"))
				.build();

		Country country12 = Country.builder()
				.name("Venezuela 🇻🇪")
				.capital("Caracas")
				.population(28067000)
				.area(new BigInteger("916445"))
				.build();

		countryRepository.save(country1);
		countryRepository.save(country2);
		countryRepository.save(country3);
		countryRepository.save(country4);
		countryRepository.save(country5);
		countryRepository.save(country6);
		countryRepository.save(country7);
		countryRepository.save(country8);
		countryRepository.save(country9);
		countryRepository.save(country10);
		countryRepository.save(country11);
		countryRepository.save(country12);
	}
}
