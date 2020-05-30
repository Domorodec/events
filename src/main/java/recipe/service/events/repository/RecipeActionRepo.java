package recipe.service.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recipe.service.events.model.Action;

public interface RecipeActionRepo extends JpaRepository<Action, Integer> {
}
