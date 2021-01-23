package org.github.vitorjclima.resource;

import org.github.vitorjclima.model.vo.CustomerVO;
import org.github.vitorjclima.service.CustomerService;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/customers")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class CustomerResource {

    @Inject private CustomerService service;

    @GET
    public List<CustomerVO> getAll() {
        return service.getAll();
    }

    @POST
    public void create(CustomerVO vo) {
        service.create(vo);
    }
}
