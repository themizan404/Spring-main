package com.mizan.web.controller;

import com.mizan.web.service.StudentService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("")
    public String displayPage() {
        return "index";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String savePage(HttpServletRequest request) {
        studentService.save(request);
        return "edit";
    }

    @RequestMapping("/edit")
    public String editNdeletePage() {
        return "edit";
    }

}
