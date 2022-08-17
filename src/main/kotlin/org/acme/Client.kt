package org.acme

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/")
@RegisterRestClient
interface Client {

    @GET
    @Path("")
    fun getGoogle(): String
}
