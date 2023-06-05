package ru.skyhomework.springhomework.service;

import java.util.List;
import java.util.Set;

public interface StoreService {
    Set<Integer> add(List<Integer> ids);

    Set<Integer> get();


}
