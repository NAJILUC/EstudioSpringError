package com.bolsadeideas.springboot.error.app.controllers;

import com.bolsadeideas.springboot.error.app.errors.UsuarioNoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ErrorHandlerController {

    @ExceptionHandler(ArithmeticException.class)
    public String aritmeticaError(Exception ex, Model model){
        model.addAttribute("error","Error de aritmetica");
        model.addAttribute("message",ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestap",new Date());
        return "error/generica";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String numeroFormatoError(Exception ex, Model model){
        model.addAttribute("error","Formato numero incorrecto");
        model.addAttribute("message",ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestap",new Date());
        return "error/numero-formato";
    }

    @ExceptionHandler(UsuarioNoEncontradoException.class)
    public String usuarioNoEncontradoException(UsuarioNoEncontradoException ex, Model model){
        model.addAttribute("error","Usuario no encontrado");
        model.addAttribute("message",ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestap",new Date());
        return "error/usuario";
    }



}
