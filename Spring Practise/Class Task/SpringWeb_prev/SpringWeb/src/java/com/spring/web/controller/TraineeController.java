package com.spring.web.controller;

import com.spring.web.model.Employee;
import com.spring.web.service.impl.ITraineeService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/trainee")
public class TraineeController {

    @Autowired
    ITraineeService traineeService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "trainee/create";
    }

    @RequestMapping(value = "/store", method = RequestMethod.POST)
    public String store(HttpServletRequest request) {
        traineeService.save(request);
        return "trainee/create";
    }

    @ModelAttribute
    public String useAttr(ModelMap map) {
        String createTitle = "Create Trainee";
        String editTitle = "Edit Trainee";
        String viewTitle = "View Trainee";
        map.addAttribute("createTitle", createTitle);
        map.addAttribute("editTitle", editTitle);
        map.addAttribute("viewTitle", viewTitle);
        return "trainee/*";
    }
}
