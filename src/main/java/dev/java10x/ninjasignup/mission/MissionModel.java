package dev.java10x.ninjasignup.mission;

import java.util.List;

import dev.java10x.ninjasignup.ninja.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missions")
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String rank;

    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninjas;
}
