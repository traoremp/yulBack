package ca.onepoint.yul.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "map")
@Data
public class Map {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    @Column
    private String map;

}
