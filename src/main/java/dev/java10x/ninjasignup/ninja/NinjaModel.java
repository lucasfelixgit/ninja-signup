package dev.java10x.ninjasignup.ninja;

import dev.java10x.ninjasignup.mission.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @entity - turns a class into a database entity
// JPA - Java Persistence API
@Entity
@Table(name = "tb_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private int age;

    @ManyToOne
    @JoinColumn(name = "mission_id") // fk - foreign key
    private MissionModel mission;

}
