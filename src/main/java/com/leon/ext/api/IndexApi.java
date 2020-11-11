package com.leon.ext.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@RestController
@RequestMapping(path = "/index")
public class IndexApi {

    @GetMapping(path = "/hello/{name}")
    public String index(@PathVariable(name = "name") String name) {
        return MessageFormat.format("hello {0}!", name);
    }
}
