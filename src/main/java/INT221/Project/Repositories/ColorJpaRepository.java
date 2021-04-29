package INT221.Project.Repositories;

import INT221.Project.Models.Colors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorJpaRepository extends JpaRepository<Colors, Integer> {
}
