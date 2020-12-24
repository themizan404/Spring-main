package com.spring.web.service;

import com.spring.web.dao.impl.IEmployeeDAO;
import com.spring.web.model.Employee;
import com.spring.web.service.impl.IEmpService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpService implements IEmpService{

    @Autowired
    IEmployeeDAO empDAO;
    
    @Override
    public Map<String, Object> save(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap(); // for request 
        String name = map.get("name")[0];
        String area = map.get("area")[0];
        Employee emp = new Employee();
        
        Map<String, Object> obj = new HashMap<String, Object>();
        List<Employee> e = empDAO.getAll();
        if(!name.isEmpty()){
            for (int i = 0; i<e.size(); i++) {
                if (name.equals(e.get(i).getName())) {
                    obj.put("found", "Name value found");
                }
            }
        }else if(area.equals("Banani")){
           obj.put("error1", "Banani area has No employee");
        }
        else{
            emp.setName(name);
            emp.setId(Integer.valueOf(map.get("id")[0]));
            emp.setNid(Integer.valueOf(map.get("nid")[0]));
            emp.setSalary(Double.parseDouble(map.get("salary")[0]));
            emp.setCity(map.get("city")[0]);
            emp.setArea(area);
            empDAO.save(emp);
            obj.put("success", "Employee Saved");
        }
        return obj;
    }

    
    
}
