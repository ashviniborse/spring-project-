package com.spring.springrest;

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
public class studentdetailscontroller {

    private final studentservice service;

    // Constructor injection for the service
    public studentdetailscontroller(studentservice service) {
        this.service = service;
    }

    @GetMapping("{id}")
    public studentdetails getDetails(@PathVariable("id") String id) {
        return service.getdetails(id);
    }

    @PostMapping
    public String createStudentDetails(@RequestBody studentdetails det) {
        service.createstudentdetails(det);
        return "Created successfully";
    }

    @PutMapping
    public String updateStudentDetails(@RequestBody studentdetails det) {
        service.updatestudentdetails(det);
        return "Updated successfully";
    }

    @DeleteMapping("{id}")
    public String deleteStudentDetails(@PathVariable("id") String id) {
        service.deletestudentdetails(id); // Removed quotes around id
        return "Deleted successfully";
    }

    @GetMapping
    public List<studentdetails> getAllDetails() {
        return service.getalldetails();
    }
}
