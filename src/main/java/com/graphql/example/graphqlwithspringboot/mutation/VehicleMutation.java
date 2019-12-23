package com.graphql.example.graphqlwithspringboot.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.example.graphqlwithspringboot.model.Vehicle;
import com.graphql.example.graphqlwithspringboot.service.VehicleService;
import org.springframework.stereotype.Component;

@Component

public class VehicleMutation implements GraphQLMutationResolver {

  private final VehicleService vehicleService;

  public VehicleMutation(VehicleService vehicleService) {
    this.vehicleService = vehicleService;
  }

  public Vehicle createVehicle(final String type, final String modelCode, final String brandName,
      final String launchDate) {

    return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
  }
}
