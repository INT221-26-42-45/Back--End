package INT221.Project.Controllers;

import INT221.Project.Models.Colors;
import INT221.Project.Repositories.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ColorController {

    @Autowired
    ColorRepository colorRepository;

    @GetMapping("/color")
    public List<Colors> showAllColor(){
        return colorRepository.findAll();
    }

}
