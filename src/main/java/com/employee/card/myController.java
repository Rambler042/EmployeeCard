package com.employee.card;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String outputEmployeeData(@Valid @ModelAttribute("employee") Employee emp,
                                     BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "entry-employee-data-view";
        } else {
            return "output-employee-data-view";
        }
    }

}
