package recipe.service.events.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import recipe.service.events.model.Action;
import recipe.service.events.services.impl.RecipeActionServiceImpl;

import java.util.Date;

@Service
public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @Autowired
    private RecipeActionServiceImpl recipeActionService;

    @KafkaListener(topics = "recipes", groupId = "group_id")
    public void consume(String message) {
        logger.info(String.format("Kafka consumer event service -> %s", message));
        Action action = new Action( message, (int) (Math.random() * 65530), new Date());
        this.recipeActionService.saveAction(action);
    }
}
