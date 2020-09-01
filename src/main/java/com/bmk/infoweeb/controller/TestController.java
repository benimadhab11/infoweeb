//package com.bmk.infoweeb.controller;
//
//import com.bmk.infoweeb.dto.TestDTO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//
//import javax.persistence.Column;
//import java.beans.IntrospectionException;
//import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
//
//
//@RestController
//@RequestMapping("test")
//public class TestController {
//
//    @Autowired
//    private TestDTO testDTO;
//
//    @ResponseStatus(value = HttpStatus.OK)
//    @GetMapping(value = "/{category}")
//    public String  testFieldGetters(@PathVariable String category) throws IntrospectionException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
//        for (Field field : testDTO.getClass().getDeclaredFields()) {
//
//            Column column = field.getAnnotation(Column.class);
//            System.out.println(column.name());
//            field.setAccessible(true);
//            Object value = field.get(testDTO);
//            System.out.println(value);
//
//        }
//
//
//        return "hi";
//    }
//
//
//
//}