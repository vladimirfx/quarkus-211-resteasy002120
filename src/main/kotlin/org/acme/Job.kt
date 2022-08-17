package org.acme

import io.quarkus.scheduler.Scheduled
import org.eclipse.microprofile.rest.client.inject.RestClient
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class Job(
    @RestClient private val client: Client,
) {

    @Scheduled(every = "1m")
    fun run() {
        println(client.getGoogle())
    }
}
