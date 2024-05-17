package dictionaryservice.impl.domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Table
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Id
    private UUID uuid;

    private String name;

    private String capitalName;

    private String isoCode;



}
