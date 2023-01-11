package by.koolbasov.videoperimetrproject.controllers;

import by.koolbasov.videoperimetrproject.entity.Request;
import by.koolbasov.videoperimetrproject.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RequestController {
  //  @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/recordRequest")
    public String addUser(@RequestBody Request request) {
        Request request1 =request;
        return "New request";
    }
}
