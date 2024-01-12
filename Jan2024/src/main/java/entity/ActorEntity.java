package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actor")
@Data
@AllArgsConstructor
public class ActorEntity {
    @Id
    @Column(name = "a_Id")
    private int a_Id;

    @Column(name = "a_Name")
    private  String a_Name;

    @Column(name = "a_Gender")
    private String a_Gender;

    @Column(name = "a_Age")
    private int a_Age;

    @Column(name = "a_NickName")
    private String a_NickName;
}
