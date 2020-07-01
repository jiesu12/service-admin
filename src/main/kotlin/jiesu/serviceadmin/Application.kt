package jiesu.serviceadmin

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
