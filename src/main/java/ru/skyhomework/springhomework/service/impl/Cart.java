package ru.skyhomework.springhomework.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class Cart {
    private final Set<Integer> goods = new HashSet<>();
   public Set<Integer> add(List<Integer> ids) {
       goods.addAll(ids);
       return goods;
    }

    public Set<Integer> get() {
        return new HashSet<>(goods);
    }


}
