package com.exa.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class StudentExecption extends Throwable {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView getStudentExcetion(HttpServletRequest request,Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception" ,e);
        modelAndView.addObject("url",request.getRequestURL());
        modelAndView.addObject("exceptionClass",e.getClass());
        modelAndView.setViewName("errorPage");
        return modelAndView;
    }
}
