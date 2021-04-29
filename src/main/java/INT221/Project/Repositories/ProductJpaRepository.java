package INT221.Project.Repositories;

import INT221.Project.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface ProductJpaRepository extends JpaRepository<Products, Integer> {

    @Modifying
    @Query(value = "delete from skorproduct where ProductId= :ProductId", nativeQuery = true)
    void deleteProduct(@Param("ProductId") Integer productId);
}
