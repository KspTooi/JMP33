package com.ksptooi.jmp33

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
open class Documents {

}


fun main(args: Array<String>) {
    SpringApplication.run(Documents::class.java)
}

