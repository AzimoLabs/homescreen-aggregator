package com.azimo.quokka.aggregator.model.component.command;

import com.azimo.quokka.aggregator.dynamodb.UserStateRepository;
import com.azimo.quokka.aggregator.model.component.Component;

public class UpdateCommand implements Command {
    @Override
    public void execute(Component component, UserStateRepository repo) {
        repo.save(component);
    }
}
