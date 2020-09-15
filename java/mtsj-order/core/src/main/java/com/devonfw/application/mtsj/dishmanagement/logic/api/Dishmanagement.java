package com.devonfw.application.mtsj.dishmanagement.logic.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.devonfw.application.mtsj.dishmanagement.common.api.to.DishCto;

//@FeignClient(value = "dish", url = "${feignclient.dish.url}", configuration = FeignConfig.class)
@Path("/dishmanagement/v1")
public interface Dishmanagement {

  @GET
  @Path("/dish/{id}/")
  public DishCto findDish(Long dishId);

}
