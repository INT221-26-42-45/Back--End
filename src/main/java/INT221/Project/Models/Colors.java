package INT221.Project.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "colors")
@JsonIgnoreProperties(value = "products")
public class Colors {
    @Id
    @Column(name = "ColorId")
    private int colorId;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "colors")
    Set<Products> products;

    @Column(name = "ColorName")
    private String colorName;

}
