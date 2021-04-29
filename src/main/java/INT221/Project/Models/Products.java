package INT221.Project.Models;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Products implements Serializable {
    @Id
    @Column(name = "ProductId")
    private int productId;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
      name = "skorproduct",
      joinColumns = @JoinColumn(name = "ProductId"),
      inverseJoinColumns = @JoinColumn(name = "ColorId"))
    Set<Colors> colors;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "ProductDescription")
    private String productDescription;

    @Column(name = "ProductType")
    private String productType;

    @Column(name = "ProductSize")
    private String productSize;

    @Column(name = "ProductPrice")
    private Double productPrice;

    @Column(name = "ProductDate")
    private Date productDate;

    @Column(name = "ProductImg")
    private String productImg;

    @ManyToOne
    @JoinColumn(name = "BrandId")
    private Brands brands;







}
