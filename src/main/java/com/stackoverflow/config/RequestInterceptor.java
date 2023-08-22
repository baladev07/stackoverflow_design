package com.stackoverflow.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){

//        if (request.getRequestURI().contains("swagger")) {
//            return true;
//        }
//
//        if(!SecurityValidator.isPublicURI(request.getRequestURI()))
//        {
//            entityContext.initialize();
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            Jwt jwt = (Jwt) authentication.getPrincipal();
//            String email = jwt.getSubject();
//            entityContext.registerEntity(UserEntity.class, userRepository.findByEmail(email));
//            EntityContextHolder.setEntityContext(entityContext);
//        }
        return true;
    }

}
