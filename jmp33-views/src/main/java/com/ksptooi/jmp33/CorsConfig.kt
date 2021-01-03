package com.ksptooi.jmp33

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.CorsFilter
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
open class CorsConfig:WebMvcConfigurer {


    @Bean
    open fun corsFilter():CorsFilter{

        val config = CorsConfiguration()

        config.addAllowedOrigin("*")

        config.allowCredentials = true

        config.addAllowedMethod("*")

        config.addAllowedHeader("*")

        //config.addExposedHeader("*")

        val corsConfigurationSource = UrlBasedCorsConfigurationSource()
        corsConfigurationSource.registerCorsConfiguration("/**", config)

        return CorsFilter(corsConfigurationSource)
    }


}