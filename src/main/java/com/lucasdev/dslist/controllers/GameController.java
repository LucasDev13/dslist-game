package com.lucasdev.dslist.controllers;

import com.lucasdev.dslist.dto.GameMinDto;
import com.lucasdev.dslist.entities.Game;
import com.lucasdev.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDto > findAll(){
        return service.findAll();
    }
}
