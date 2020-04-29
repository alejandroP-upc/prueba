/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.testws.testws_2020.model.services;

import co.edu.unipiloto.testws.testws_2020.model.Person;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Daniel
 */
@Path("service")
public class Service {
    private static Map<Integer,Person> persons= new HashMap<Integer,Person>();
    private static int promedio;
    
    static{
        for (int i=0;i<10;i++) {
            Person person=new Person();
            int id=i+1;
            person.setId(id);
            person.setFullName("Persona "+ id);
            person.setAge(new Random().nextInt(40)+1);
            persons.put(id, person);
            promedio=promedio+person.getSalario();
        }
    }
    
    
    @GET
    @Path("/getPersonByIdXML")
    @Produces(MediaType.APPLICATION_XML)
    public Person getPersonByIdXML (){
    return new Person();
    }
    
    @GET
    @Path("/getPersonByIdJSON/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonByIdJSON (@PathParam("id") int id){
    return persons.get(id);
    
    }
    
    @GET
    @Path("/getPromedio/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPromedio (@PathParam("id") int id){

        return persons.get(id)+"  "+promedio;
    
    }
    
}
