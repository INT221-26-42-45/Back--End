package INT221.Project.Controllers;

import INT221.Project.Models.Products;
import INT221.Project.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@RestController
public class ProductRestController {

    @Autowired
    ProductService productService;

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

    @PutMapping("/product/edit/{productId}")
    public Optional<Products> updateProduct(@PathVariable Integer productId, @RequestBody Products newProduct) {
        return productService.updateProduct(productId, newProduct);
    }

    @PostMapping("/add")
    public Products newProduct(@RequestBody Products newProduct){
        return productService.addProduct(newProduct);
    }






}
