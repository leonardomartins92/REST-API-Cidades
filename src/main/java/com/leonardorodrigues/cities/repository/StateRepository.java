package com.leonardorodrigues.cities.repository;

import com.leonardorodrigues.cities.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
