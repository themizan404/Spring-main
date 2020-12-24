package com.spring.web.controller;

import com.spring.web.dao.impl.IEmployeeDAO;
import com.spring.web.dao.impl.ITraineeDAO;
import com.spring.web.model.Employee;
import com.spring.web.service.impl.IEmployeeService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/employee")  //Class level @RequestMapping for Specific Entity
public class EmployeeController {

    @Autowired
    IEmployeeDAO employeeDAO;

    @Autowired
    ITraineeDAO traineeDAO;

    @Autowired
    IEmployeeService employeeService;
    

    // @RequestMapping - simple page return by Handler Mapping
    // method = RequestMethod.GET to specify HTTP request method
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "employee/create";
    }

    // @RequestMapping - simple page return with values Using ModelAndView
    @RequestMapping(value = "/create1", method = RequestMethod.GET)
    public ModelAndView create1() {
        ModelAndView model = new ModelAndView();
        model.addObject("obj", "From Object");
        model.setViewName("employee/create");
        return model;
    }
    
    //Entity data bind with front end properties by using @ModelAttribute
    //Type and Error Handling Using BindingResult
    @RequestMapping(value = "/store", method = RequestMethod.POST)
    public String store(ModelMap map, @ModelAttribute("employee") Employee employee, BindingResult rs) {
        if (rs.hasErrors()) { // Error Handling by BindingResult
            map.addAttribute("err", rs); //sending the rs to the front end
            return "employee/create";
        } else {
            Employee e = employeeService.save(employee);
            return "redirect:/employee/view";  // Redirect to a Handler Mapping after an action
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) { //Using @PathVariable by URL
        employeeDAO.delete(id);
        return "redirect:/employee/view";  // Redirect to a Handler Mapping after an action
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(ModelMap map, @PathVariable("id") int id) {
        Employee emp = employeeDAO.getById(id);
        map.addAttribute("emp", emp);
        return "employee/edit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(ModelMap map, @ModelAttribute("employee") Employee employee) {
        //map.addAttribute("emp", employee);
        Employee e = employeeDAO.update(employee);
        return "redirect:/employee/view";
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view(ModelMap model, Map<String, Object> map) {
        List<Employee> empList = employeeDAO.getAll();
        //model.addAttribute("empList", empList);  // ************** data By Modelmap ***************
        map.put("empList", empList);             // ************** data By Collection *************
        return "employee/create";
    }

    @RequestMapping(value = "/view1", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView view1() {    // Using ModelAndView for processing view and data
        Map<String, Object> map = new HashMap<String, Object>();
        List<Employee> empList = employeeDAO.getAll();
        //ModelAndView model = new ModelAndView();
        //model.setViewName("employee/create");
        //model.addObject("obj", "object  val");
        map.put("empList", empList);
        map.put("obj", "Object value");
        return new ModelAndView("employee/create", "map", map);
    }

    @ModelAttribute  // Using Model Attributes for the returned Models by Annotation
    public String useAttr(ModelMap map) {
        String createTitle = "Create Employee";
        String editTitle = "Edit Employee";
        String viewTitle = "View Employee";
        map.addAttribute("createTitle", createTitle);
        map.addAttribute("editTitle", editTitle);
        map.addAttribute("viewTitle", viewTitle);
        return "employee/*";
    }

     // =================== If we don't want to bind any property, using @InitBinder =====================
    /*
    @InitBinder
    public void restrictBind(WebDataBinder db) {
        db.setDisallowedFields(new String[]{"name", "salary", "area"});
    }
    */
    
    //test for jQuery
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "hello";
    }
}
