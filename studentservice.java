package com.spring.springrest;


import java.util.List;

public interface studentservice {
     public String createstudentdetails(studentdetails det);
     public String updatestudentdetails(studentdetails det);
     public String deletestudentdetails(String id);
     public studentdetails getdetails(String id);
     public List<studentdetails> getalldetails();
     
     
}
