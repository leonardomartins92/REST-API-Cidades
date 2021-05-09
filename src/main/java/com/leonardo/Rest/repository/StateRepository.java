package com.leonardo.Rest.repository;


import com.leonardo.Rest.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
