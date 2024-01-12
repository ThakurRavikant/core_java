package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "festival")

@Data
@AllArgsConstructor
public class FestivalEntity {

    @Id
    @Column(name = "f_Id")
    private int f_Id;

    @Column(name = "f_Name")
    private String f_Name;

    @Column(name = "f_WorshipGod")
    private String f_WorshipGod;

    @Column(name = "f_cloths")
    private String f_cloths;

    @Column(name = "f_Food")
    private String f_Food;
}
