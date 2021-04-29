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
    @DeleteMapping("/product/{productId}")
    public void deleteProduct(@PathVariable Integer productId) {
        productService.deleteProduct(productId);
    }


//    @PostMapping("/product")
//    public Products newProduct(@RequestBody Products newProduct){
//        return productJpaRepository.save(newProduct);
//    }

//    @PutMapping("/product/{productId}")
//    public Products updateProduct(@PathVariable Integer productId, @RequestBody Products newProduct) throws ResourceNotFoundException {
//        return productJpaRepository.findById(productId).map(product -> {
//            product.setProductName(newProduct.getProductName());
//            product.setProductDescription(newProduct.getProductDescription());
//            product.setProductType(newProduct.getProductType());
//            product.setProductSize(newProduct.getProductSize());
//            product.setProductPrice(newProduct.getProductPrice());
//            product.setProductDate(newProduct.getProductDate());
//            product.setProductImg(newProduct.getProductImg());
//            product.setBrands(newProduct.getBrands());
//            product.setColors(newProduct.getColors());
//            return productJpaRepository.save(product);
//        }).orElseThrow(() -> new ResourceNotFoundException("Product not found for this id: " + productId));
//    }





}
