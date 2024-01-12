package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resume")
@Data
@AllArgsConstructor
public class ResumeEntity {
    @Id
    @Column(name="")
    private  int r_Id;
    @Column(name="r_nameOfCandidate")
    private  String r_nameOfCandidate;
    @Column(name="r_addressOfCandidate")
    private  String r_addressOfCandidate;
    @Column(name="r_educationOfCandidate")

    private  String r_educationOfCandidate;
    @Column(name="r_ageOfCandidate")
    private  int r_ageOfCandidate;




}
