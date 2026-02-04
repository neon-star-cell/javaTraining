package com.ibm.springmvc.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ibm.springmvc.model.Employee;
import com.ibm.springmvc.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String listEmployees(Model model) {
		Collection<Employee> employees = employeeService.findAll();
		model.addAttribute("employees", employees);
		return "list-employees";
	}
	
	@GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee-form";
    }
	
	@GetMapping("/update")
	public String updateEmployee(@RequestParam("id") Integer id, Model model) {
		Employee employee = employeeService.findById(id);
		model.addAttribute("employee", employee);
		return "employee-form";
	}
	
	@PostMapping("/save")
	public String saveForm(@Valid @ModelAttribute Employee employee, BindingResult result,
			RedirectAttributes redirectAttributes) {	    
		if (result.hasErrors()) {
	        return "employee-form";
	    }
		Employee emp = employeeService.findById(employee.getId());
		if(emp != null) {
			employeeService.updateEmployee(employee);
			redirectAttributes.addFlashAttribute("message", "Employee updated successfully!");
			return "redirect:./";
		}
		employeeService.insertEmployee(employee);
		redirectAttributes.addFlashAttribute("message", "Employee created successfully!");
		return "redirect:./";
	}
	
	@PostMapping("/delete")
	public String deleteEmployee(@RequestParam(value="id", required=false) Integer id, Model model, RedirectAttributes redirectAttributes) {
		System.out.println(id);
		Employee employee = employeeService.findById(id);
		if(employee == null) {
			redirectAttributes.addFlashAttribute("message", "Can't find the user.");
			return "redirect:./";
		}
		employeeService.deleteEmployee(employee);
		redirectAttributes.addFlashAttribute("message", "Employee deleted successfully!");
		return "redirect:./";
	}
}