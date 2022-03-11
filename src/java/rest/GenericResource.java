/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import been.demoBeenLocal;
import entity.TestTable;
import java.util.Date;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author meet
 */
@Path("generic")
public class GenericResource {
    
    @EJB demoBeenLocal dbl;

    @Context
    private UriInfo context;

    public GenericResource() {
        
        
    }
    
    @POST
    @Path("insert/{name}/{price}/{date}")
    public void insert(@PathParam ("name")String name,@PathParam("price") Integer price,@PathParam("date") Date date) {
     dbl.insert(name, price, date);
    }

}
