package com.service.user;

import javax.ws.rs.*;


@Path("/user/service")  
public class UserServices { //RESOURCE CLASS , associated with @Path
	
	@PUT
	@Path("/create")
	public void createUser(){} // SERVICE RESOURCE METHOD Method have it's own @Path AND http methods 
	
	@GET
	public void getUser(){ // normal resource methods are just with http methods.
		System.out.println("Inside getUser method");
		
	}  
	
	@POST
	public void updateUser(){
		System.out.println("Inside updateUser method");
	}
	
	@DELETE
	public void deleteUser(){}
	
	@Path("/special")
	public SpecialUser getSpecialUser(){ //SUBRESOURCE LOCATOR METHOD - have only @Path, no http methods
										//purpose is to return another RESOURCE CLASS, called SUB RESOURCE CLASS 
		return new SpecialUser();
	}
	
}
