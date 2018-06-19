package com.test.camel.web.samplerest;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/rest")
public interface CamelWebRestService {

	@GET
	@Path("/order/{orderNo}")
	public String getOrder(@PathParam("orderNo")String orderNo);

	@PUT
	@Path("order")
	public String putOrder(String body);
}
