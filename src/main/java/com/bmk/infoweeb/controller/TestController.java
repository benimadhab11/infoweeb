package com.bmk.infoweeb.controller;

import com.bmk.infoweeb.client.AnimeClient;
import com.bmk.infoweeb.model.AnimeDetailModel;
import com.bmk.infoweeb.model.AnimeModel;
import com.bmk.infoweeb.model.Model;
import com.bmk.infoweeb.model.TestModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import javax.persistence.Column;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;


@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestModel testModel;

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/{category}")
    public String  testFieldGetters(@PathVariable String category) throws IntrospectionException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        for (Field field : testModel.getClass().getDeclaredFields()) {

            Column column = field.getAnnotation(Column.class);
            System.out.println(column.name());
            field.setAccessible(true);
            Object value = field.get(testModel);
            System.out.println(value);

        }


        return "hi";
    }



}