package com.demo;

import javax.servlet.*;  
import javax.servlet.annotation.WebFilter;  
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import java.io.IOException;

@WebFilter("/*")
@Component
public class ApplicationFilter implements Filter {  
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
//        httpServletResponse.setHeader("X-Content-Type-Options", "nosniff");
//        httpServletResponse.setHeader("Content-Security-Policy", "script-src 'self'");
        httpServletResponse.setContentType("application/json");
        filterChain.doFilter(servletRequest, servletResponse);
    }

   
}
