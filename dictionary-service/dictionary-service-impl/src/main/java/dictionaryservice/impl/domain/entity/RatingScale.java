package dictionaryservice.impl.domain.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "rating", schema = "rating_scale")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RatingScale {
    @Id
    private UUID uuid;

    @Column(name = "degree", nullable = false)
    private int degree;
    @Column(name = "rating", nullable = false)
    private String rating;
}
