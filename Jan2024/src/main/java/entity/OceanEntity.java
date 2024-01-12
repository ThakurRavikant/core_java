package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ocean")
@Data
@AllArgsConstructor
public class OceanEntity {
    @Id
    @Column(name = "o_Id")
    private int o_Id;

    @Column(name = "o_Name")
    private  String o_Name;

    @Column(name = "o_Depth")
    private String o_Depth;

    @Column(name = "o_IsPolluted")
    private  String o_IsPolluted;

    @Column(name = "o_color")
    private String o_color;


}
