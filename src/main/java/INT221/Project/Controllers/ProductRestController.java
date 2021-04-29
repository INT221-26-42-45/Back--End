package INT221.Project.Controllers;

import INT221.Project.Models.Products;
import INT221.Project.Services.ColorService;
import INT221.Project.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@RestController
public class ProductRestController {

    @Autowired
    ProductService productService;

    @Autowired
    ColorService colorService;

    @GetMapping("/product")
    public List<Products> showAllProducts(){
        return productService.allProducts();
    }

    @GetMapping("/product/{productId}")
    public Optional<Products> showProduct(@PathVariable Integer productId){
        return productService.showProduct(productId);
    }

    @Transactional
    @DeleteMapping("/product/delete/{productId}")
    public void deleteProduct(@PathVariable Integer productId) {
        productService.deleteProduct(productId);
    }


//    @PostMapping("/product")
//    public Products newProduct(@RequestBody Products newProduct){
//        return productJpaRepository.save(newProduct);
//    }

    @PutMapping("/product/edit/{productId}")
    public Optional<Products> updateProduct(@PathVariable Integer productId, @RequestBody Products newProduct) {
        return productService.updateProduct(productId, newProduct);
    }




}
