package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="traffic")

@Data
@AllArgsConstructor
public class TrafficEntity {

    @Id
    @Column(name="t_Id")
    private int t_Id;

    @Column(name="t_Location")
    private String t_Location;

    @Column(name="t_VehicleCount")
    private int t_VehicleCount;

    @Column(name="t_TrafficColor")
    private String t_TrafficColor;
    @Column(name="t_AverageSpeed")
    private String t_AverageSpeed;


}
