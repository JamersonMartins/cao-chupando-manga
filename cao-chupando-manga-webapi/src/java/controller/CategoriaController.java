package controller;

import javax.ws.rs.Path;

@Path("/categoria")
public class CategoriaController {
    
    @Path("/")
    public String index(){
        return "teste";
    }
    
}
