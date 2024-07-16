package com.ChintaTravels.demo.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ChintaTravels.demo.model.Passanger;

@Repository
public interface PassangerRepositary extends CrudRepository<Passanger, Integer>{

}
