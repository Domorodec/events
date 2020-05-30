package recipe.service.events.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipe.service.events.model.Action;
import recipe.service.events.repository.RecipeActionRepo;
import recipe.service.events.services.RecipeActionService;

import javax.transaction.Transactional;

@Service
@Transactional
public class RecipeActionServiceImpl implements RecipeActionService {

    @Autowired
    private RecipeActionRepo recipeActionRepo;

    @Override
    public Action saveAction(Action action) {
        this.recipeActionRepo.save(action);
        return action;
    }
}
