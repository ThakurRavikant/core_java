package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transport")

@Data
@AllArgsConstructor

public class TransportEntity {

    @Id
    @Column(name = "t_Id")
    private  int t_Id;

    @Column(name = "t_VehicleType")
    private String t_VehicleType;

    @Column(name = "t_VehicleNumber")
    private String t_VehicleNumber;

    @Column(name = "t_Route")
    private String t_Route;

    @Column(name = "")
    private String t_GoodsCarry;
}
