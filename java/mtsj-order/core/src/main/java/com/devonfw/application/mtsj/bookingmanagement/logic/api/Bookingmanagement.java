package com.devonfw.application.mtsj.bookingmanagement.logic.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.devonfw.application.mtsj.bookingmanagement.common.api.to.BookingCto;
import com.devonfw.application.mtsj.bookingmanagement.common.api.to.InvitedGuestEto;
import com.devonfw.module.rest.common.api.RestService;

@Path("/bookingmanagement/v1")
public interface Bookingmanagement extends RestService {

  @GET
  @Path("/booking/{id}/")
  public BookingCto getBooking(@PathParam("id") long id);

  /**
   * @param token
   * @return
   */
  @GET
  @Path("/booking/{token}/")
  public BookingCto findBookingByToken(@PathParam("token") String token);

  /**
   * @param token
   * @return
   */
  @GET
  @Path("/booking/{token}/")
  public InvitedGuestEto findInvitedGuestByToken(@PathParam("token") String token);

}
