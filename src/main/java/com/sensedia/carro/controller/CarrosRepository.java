package com.sensedia.carro.controller;
import com.sensedia.carro.model.Carro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrosRepository extends JpaRepository<Carro, Integer> {

        List<Carro> findAllByIdContains(String id);

}
