package com.graphql.example.graphqlwithspringboot.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.example.graphqlwithspringboot.model.Vehicle;
import com.graphql.example.graphqlwithspringboot.service.VehicleService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component

public class VehicleQuery implements GraphQLQueryResolver {

  private final VehicleService vehicleService;

  public VehicleQuery(VehicleService vehicleService) {
    this.vehicleService = vehicleService;
  }

  public List<Vehicle> getVehicles(final int count) {

    return this.vehicleService.getAllVehicles(count);
  }

  public Optional<Vehicle> getVehicle(final int id) {

    return this.vehicleService.getVehicle(id);
  }
}
