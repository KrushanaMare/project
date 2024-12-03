package com.project.project;

import java.util.List;

public interface projectservice {
    public String createdetails(projectmodelclass det);
    public String updatedetails(projectmodelclass det);
    public String deletedetails(String id);
    public String getdetails(String id);
    public List<projectmodelclass> getalldetails();

}
