//package com.sicr.train.config;
//
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDateTime;
//import java.util.Map;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ResponseBody
//    public Map<String, Object> handleNotFound(Exception ex, HttpServletRequest request) {
//        return Map.of(
//                "timestamp", LocalDateTime.now(),
//                "path", request.getRequestURI(),
//                "error", "Page Not Found)"
//        );
//    }
//}
