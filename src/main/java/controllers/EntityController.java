package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {

    private String studentName = "Ali";
    private int studentAge = 21;

    @GetMapping("student")
    public String getStudent() {
        return "Student: " + studentName + ", Age: " + studentAge;
    }

    @GetMapping("is-adult/{age}")
    public String isAdult(@PathVariable int age) {
        return age >= 18 ? "You are an adult." : "You are not an adult.";
    }
}
