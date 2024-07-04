package com.ClienteApiRestCetina.ClienteApiRestCetina.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

// defino el nombre de la tabla
@Entity @Table(name = "clients")

// agrego constructor, toString y EqualsAndHashCode
@NoArgsConstructor @ToString @EqualsAndHashCode
public class Client {
    // agrego los campos de la tabla
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private String name;
    @Getter @Setter private String lastname;
    @Getter @Setter private Integer dni;

    // defino la relacion... esta parte me dejo con dudas
    @ManyToOne
    @JoinColumn(name = "parent_id")
    @Getter @Setter private Client parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    @Getter @Setter private List<Client> children;
}