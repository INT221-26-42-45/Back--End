package INT221.Project.Services;

import INT221.Project.Models.Products;
import INT221.Project.Repositories.ProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductJpaRepository productJpaRepository;

    @Autowired
    ColorService colorService;

    //GetMapping
    public List<Products> allProducts(){
        return productJpaRepository.findAll();
    }

    //GetMapping
    public Optional<Products> showProduct(@PathVariable Integer productId){
        return productJpaRepository.findById(productId);
    }

    //DeleteMapping
    public void deleteProduct(@PathVariable Integer productId) {
        productJpaRepository.deleteProduct(productId);
    }
}
