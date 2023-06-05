package ru.skyhomework.springhomework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skyhomework.springhomework.service.StoreService;

import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public Set<Integer> add(@RequestParam List<Integer> ids) {
        return storeService.add(ids);
    }
    @GetMapping("/get")
    public Set<Integer> get() {
        return storeService.get();

    }


}


