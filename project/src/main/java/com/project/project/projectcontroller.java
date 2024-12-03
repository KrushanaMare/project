package com.project.project;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class projectcontroller {
    projectservice service;

    public projectcontroller(projectservice service) {
        this.service = service;
    }
    
    @GetMapping("{id}")//read
    public String getdetails(@PathVariable("id") String id){
        return service.getdetails(id);
    }

    @PostMapping//create
    public String createdetails(@RequestBody projectmodelclass det){
        service.createdetails(det);
        return "created Successfully";
    }

    @PutMapping //update
    public String updatedetails(@RequestBody projectmodelclass det){
        service.updatedetails(det);
        return "updated Successfully";
    }

    @DeleteMapping("{id}") //delete
    public String deletedetails(@PathVariable("id") String id){
        service.deletedetails(id);
        return "deleted Successfully";
    }

    @GetMapping()
    public List<projectmodelclass> getalldetails(){
        return service.getalldetails();
    }


}
