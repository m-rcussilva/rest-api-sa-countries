package app.netlify.marcussilva.southamericacountries.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "country_name", nullable = false)
    private String name;

    @Column(name = "country_capital", nullable = false)
    private String capital;

    @Column(name = "country_population", nullable = false)
    private long population;

    @Column(name = "country_territorial_area", nullable = false)
    private BigInteger area;
}
