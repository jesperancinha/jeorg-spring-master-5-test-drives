package org.jesperancinha.smtd.furniture.filters

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import org.springframework.web.filter.DelegatingFilterProxy
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

@Component
@Profile("broken")
class ChairDelegatingFilterProxy : DelegatingFilterProxy() {

    override fun doFilter(request: ServletRequest, response: ServletResponse, filterChain: FilterChain) {
        val writer = response.writer
        writer.println("This application is broken. We have overridden the entry point to our application")
    }
}