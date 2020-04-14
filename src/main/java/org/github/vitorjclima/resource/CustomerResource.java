package org.github.vitorjclima.resource;

import org.github.vitorjclima.model.vo.CustomerVO;
import org.github.vitorjclima.service.CustomerService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/customers")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class CustomerResource {

  @Inject
  private CustomerService service;

  @GET
  public List<CustomerVO> getAll() {
    return service.getAll();
  }
}
