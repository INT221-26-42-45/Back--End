package INT221.Project.Services;

import INT221.Project.Models.Colors;
import INT221.Project.Models.Products;
import INT221.Project.Repositories.ProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductJpaRepository productJpaRepository;

    //GetMapping
    public List<Products> allProducts(){
        return productJpaRepository.findAll();
    }

    //GetMapping
    public Products showProduct(@PathVariable Integer productId){
        return productJpaRepository.findById(productId).orElse(null);
    }

    //DeleteMapping
    public void deleteProduct(@PathVariable Integer productId) {
        productJpaRepository.deleteProduct(productId);
        productJpaRepository.deleteById(productId);
    }

    //PutMapping
    public Optional<Products> updateProduct(@PathVariable Integer productId, @RequestBody Products newProduct) {
        return productJpaRepository.findById(productId).map(product -> {
            product.setProductName(newProduct.getProductName());
            product.setProductDescription(newProduct.getProductDescription());
            product.setProductType(newProduct.getProductType());
            product.setProductSize(newProduct.getProductSize());
            product.setProductPrice(newProduct.getProductPrice());
            product.setProductDate(newProduct.getProductDate());
            product.setProductImg(newProduct.getProductImg());
            product.setBrands(newProduct.getBrands());
            product.setColors(newProduct.getColors());
            return productJpaRepository.save(newProduct);
        });
    }

    //PostMapping
    public Products addProduct(@RequestBody Products newProducts){
        for(Colors c : newProducts.getColors()){
            newProducts.getColors().add(c);
        }
        return productJpaRepository.save(newProducts);
    }
}
