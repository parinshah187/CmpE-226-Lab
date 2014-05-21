package edu.sjsu.cmpe226.lab.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import edu.sjsu.cmpe226.lab.dto.MongoDao;

@Path("/users")
public class UserResource {

	private MongoDao mongoDao = new MongoDao();
	
	@GET
	@Path("/test")
	public Response responseMsg( ) {
		
		String output = "Hello World!";
		System.out.println("In responseMsg() function");
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/products")
	@Produces("text/html")
	public Response getProducts(){
		return Response.status(200).entity(mongoDao.getProducts()).build();
	}
	
	@GET
	@Path("/electronics")
	@Produces("text/html")
	public Response getElectronics(){
		return Response.status(200).entity(mongoDao.getElectronicsProducts()).build();
	}
	
	@GET
	@Path("/homeappliances")
	@Produces("text/html")
	public Response getHomeAppliances(){
		return Response.status(200).entity(mongoDao.getHomeAppliancesProducts()).build();
	}
	
	@GET
	@Path("/fashion")
	@Produces("text/html")
	public Response getFashion(){
		return Response.status(200).entity(mongoDao.getFashionProducts()).build();
	}
	
	@GET
	@Path("/books")
	@Produces("text/html")
	public Response getBooks(){
		return Response.status(200).entity(mongoDao.getBooksProducts()).build();
	}
	
	@GET
	@Path("/product/{product_id}")
	@Produces("text/html")
	public Response getProduct(@PathParam("product_id") String product_id){
		return Response.status(200).entity(mongoDao.getProduct(product_id)).build();
	}
	
	@GET
	@Path("/query/{query}")
	@Produces("text/html")
	public Response getQuery(@PathParam("query") String query){
		System.out.println(query);
		return Response.status(200).entity(mongoDao.getQuery(query)).build();
	}
	
}