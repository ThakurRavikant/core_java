package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shop")

@Data
@AllArgsConstructor
public class ShopEntity {
    @Id
    @Column(name="s_Id")
    private int s_Id;

    @Column(name="s_Name")
    private String s_Name;

    @Column(name="s_GstNumber")
    private String s_GstNumber;

    @Column(name="")
    private String s_Address;

    @Column(name="s_OwnerName")
    private String s_OwnerName;
}
