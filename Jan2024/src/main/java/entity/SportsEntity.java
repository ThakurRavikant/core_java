package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sports")

@Data
@AllArgsConstructor
public class SportsEntity {
    @Id
    @Column(name="s_Id")
    private  int s_Id;

    @Column(name="s_Name")
    private  String s_Name;

    @Column(name="s_PlayerName")
     private  String s_PlayerName;

    @Column(name="s_JerseyNumber")
     private int s_JerseyNumber;

    @Column(name="s_Age")
     private int s_Age;
}
