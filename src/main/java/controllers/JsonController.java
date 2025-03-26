package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class JsonController {

    @GetMapping("student-info")
    public Map<String, Object> getStudentInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Ali");
        response.put("age", 21);
        response.put("status", "active");
        return response;
    }
}
