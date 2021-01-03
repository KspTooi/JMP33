package com.ksptooi.jmp33

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
open class EurekaL1 {

}


fun main(args: Array<String>) {
    SpringApplication.run(EurekaL1::class.java)
}