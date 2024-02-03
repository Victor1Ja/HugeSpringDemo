package me.vitocode.hs.javademo.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {
    /**
     * This method returns a greeting for the student
     * 
     * @param formal Boolean to check if the greeting is formal
     * @return String HTML
     */
    @GetMapping("v1/student")
    public String getMethodName(@RequestParam(value = "formal", defaultValue = "false") boolean formal) {
        return formal ? """
                <html>
                    <head>
                        <title>Victor</title>
                    </head>
                    <body>
                        <h1>Hello, Sr.Lopez!</h1>
                    </body>
                </html>
                """ : """
                <html>
                    <head>
                        <title>Student</title>
                    </head>
                    <body>
                        <h1>What's up, dude?</h1>
                    </body>
                </html>
                """;

    }

}
