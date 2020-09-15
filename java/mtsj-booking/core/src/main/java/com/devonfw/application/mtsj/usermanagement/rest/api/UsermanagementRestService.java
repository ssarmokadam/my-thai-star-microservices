package com.devonfw.application.mtsj.usermanagement.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.devonfw.application.mtsj.usermanagement.common.api.to.UserEto;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Usermanagement}.
 */
@Path("/usermanagement/v1")
public interface UsermanagementRestService {

  /**
   * Delegates to {@link Usermanagement#findUser}.
   *
   * @param id the ID of the {@link UserEto}
   * @return the {@link UserEto}
   */

  @GET
  @Path("/user/{id}")
  public UserEto getUser(@PathParam("id") long id);

}
