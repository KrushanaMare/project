package com.project.project;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class projectimpservice implements projectservice{
    projectrepo repo;
    

    public projectimpservice(projectrepo repo) {
        this.repo = repo;
    }

    @Override
    public String createdetails(projectmodelclass det) {
        //throw new UnsupportedOperationException("Unimplemented method 'createdetails'");
        repo.save(det);
        return"success";
    }

    @Override
    public String updatedetails(projectmodelclass det) {
        //throw new UnsupportedOperationException("Unimplemented method 'updatedetails'");
        repo.save(det);
        return "updated";
    }

    @Override
    public String deletedetails(String id) {
        //throw new UnsupportedOperationException("Unimplemented method 'deletedetails'");
        repo.deleteById(id);
        return "deleted";
    }

    @Override
    public String getdetails(String id) {
        //throw new UnsupportedOperationException("Unimplemented method 'getdetails'");
        repo.findById(id);
        return "success";
    }

    @Override
    public List<projectmodelclass> getalldetails() {
        //throw new UnsupportedOperationException("Unimplemented method 'getalldetails'");
        return repo.findAll();
        
    }
}
