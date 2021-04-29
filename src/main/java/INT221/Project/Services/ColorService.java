package INT221.Project.Services;

import INT221.Project.Repositories.ColorJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorService {
    @Autowired
    ColorJpaRepository colorJpaRepository;
}
