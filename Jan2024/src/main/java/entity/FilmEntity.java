package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="film")

@Data
@AllArgsConstructor
public class FilmEntity {
    @Id
    @Column(name="f_Id")
    private int f_Id;

    @Column(name="f_Name")
    private String f_Name;

    @Column(name="f_ProducerName")
    private String f_ProducerName;

    @Column(name="f_DirectorName")
    private String f_DirectorName;

    @Column(name="f_Budget")
    private String f_Budget;

}
