package com.employee.card;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {

    @RequestMapping("/")
    public String entryEmployeeData(Model model){
        model.addAttribute("employee", new Employee());
        return "entry-employee-data-view";
    }

    @RequestMapping("/outputData")
    public String outputEmployeeData(@ModelAttribute("employee") Employee emp){
        return "output-employee-data-view";
    }

}
