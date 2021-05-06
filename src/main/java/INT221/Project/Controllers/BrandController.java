package INT221.Project.Controllers;

import INT221.Project.Models.Brands;
import INT221.Project.Repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8081"})
@RestController
public class BrandController {

    @Autowired
    BrandRepository brandRepository;

    @GetMapping("/brands")
    public List<Brands> showAllBrands(){
        return brandRepository.findAll();
    }

}
