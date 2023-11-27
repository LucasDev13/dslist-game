package com.lucasdev.dslist.services;

import com.lucasdev.dslist.dto.GameMinDto;
import com.lucasdev.dslist.entities.Game;
import com.lucasdev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDto> findAll(){
        List<Game> result = repository.findAll();
        return result.stream().map(GameMinDto::new).toList();
    }
}
