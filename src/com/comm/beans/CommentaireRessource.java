package com.comm.beans;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/article")
public class CommentaireRessource {
	@PUT
	@Consumes({"application/xml", "application/json"})
	@Produces({"application/xml", "application/json"})
	public Response put(Commentaire com){
		com.setTimestamp(System.currentTimeMillis());
		return Response.status(201).entity(com).build();
	}
}