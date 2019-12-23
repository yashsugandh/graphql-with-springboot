package com.graphql.example.graphqlwithspringboot.repository;

import com.graphql.example.graphqlwithspringboot.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
