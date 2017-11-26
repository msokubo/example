package com.example.web;


import com.example.api.FlightJSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/flight")
public class FlightRest {


    @GET
    public List<FlightJSON> search() {
        System.out.println("abc");
        return new ArrayList<FlightJSON>();
    }

}
