package com.ksptooi.jmp33

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
open class DomCategory {

}

fun main(args: Array<String>) {
    SpringApplication.run(DomCategory::class.java)
}