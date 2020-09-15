package com.devonfw.application.mtsj.imagemanagement.logic.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.devonfw.application.mtsj.imagemanagement.common.api.to.ImageEto;
import com.devonfw.module.rest.common.api.RestService;

/**
 * Interface for Imagemanagement component.
 */
@Path("/imagemanagement/v1")
public interface Imagemanagement extends RestService {

  @GET
  @Path("/image/{id}/")
  ImageEto findImage(@PathParam("id") Long id);

}