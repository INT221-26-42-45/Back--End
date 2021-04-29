package INT221.Project.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "brands")
public class Brands {
    @Id
    @Column(name = "BrandId")
    private int brandId;

    @Column(name = "BrandName")
    private String brandName;

}
