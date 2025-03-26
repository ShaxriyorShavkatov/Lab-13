package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/")
public class WebController {

    @GetMapping("home")
    public String home() {
        return "Welcome to Home Page!";
    }

    @GetMapping("services")
    public String services() {
        return "<h2>Our Services</h2>" +
                "<ul>" +
                "<li>Web Development</li>" +
                "<li>Mobile App Development</li>" +
                "<li>SEO Optimization</li>" +
                "</ul>";
    }

    @GetMapping("about")
    public String about() {
        return "This application provides various services including web development.";
    }

    @GetMapping("faq")
    public String faq() {
        return "FAQ: Frequently Asked Questions will be displayed here.";
    }

    @GetMapping("contact-us")
    public String contactUs() {
        return "Contact us at support@example.com";
    }

    @GetMapping("team")
    public String team() {
        return "Our team consists of experienced developers and designers.";
    }
    @GetMapping("greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num);
    }

    @GetMapping("double/{num}")
    public String doubleValue(@PathVariable int num) {
        return "Double of " + num + " is " + (num * 2);
    }

    @GetMapping("length/{text}")
    public String length(@PathVariable String text) {
        return "Length of '" + text + "' is " + text.length();
    }

    @GetMapping("reverse/{text}")
    public String reverse(@PathVariable String text) {
        return "Reversed: " + new StringBuilder(text).reverse().toString();
    }

    @GetMapping("concat/{str1}/{str2}")
    public String concat(@PathVariable String str1, @PathVariable String str2) {
        return "Concatenated: " + str1 + str2;
    }
    @GetMapping("add/{x}/{y}")
    public String add(@PathVariable int x, @PathVariable int y) {
        return "The sum of " + x + " and " + y + " is " + (x + y);
    }

    @GetMapping("multiply/{x}/{y}")
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return "The product of " + x + " and " + y + " is " + (x * y);
    }

    @GetMapping("subtract/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return "The difference between " + x + " and " + y + " is " + (x - y);
    }

    @GetMapping("divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        if (y == 0) return "Division by zero is not allowed!";
        return "The division of " + x + " by " + y + " is " + (x / y);
    }

    @GetMapping("modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        return "The remainder of " + x + " divided by " + y + " is " + (x % y);
    }

    @GetMapping("power/{base}/{exp}")
    public String power(@PathVariable int base, @PathVariable int exp) {
        return base + " raised to power " + exp + " is " + Math.pow(base, exp);
    }

}
