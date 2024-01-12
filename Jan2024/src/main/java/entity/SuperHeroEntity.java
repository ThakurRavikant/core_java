package entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "super_hero")

@Data
@AllArgsConstructor

public class SuperHeroEntity {
    @Id
    @Column(name="s_Id")
    private int s_Id;

    @Column(name="s_RealName")
    private String s_RealName;

    @Column(name="s_FrictionalName")
    private String s_FrictionalName;

    @Column(name="s_Power")
    private String s_Power;

    @Column(name="s_Weakness")
    private String s_Weakness;

    @Column(name="s_Country")
    private String s_Country;



}
