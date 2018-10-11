package com.exa.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView backExceprion(HttpServletRequest request,Exception e)throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception" ,e);
        modelAndView.addObject("url",request.getRequestURL());
        modelAndView.setViewName("errorPage");
        return  modelAndView;
    }
}
