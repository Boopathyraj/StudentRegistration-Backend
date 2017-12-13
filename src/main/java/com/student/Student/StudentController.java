package com.student.Student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api//Registration")
public class StudentController{

    @Autowired
    private StudentService stdService;

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<?> post(@RequestBody Student bean,UriComponentsBuilder ucb){
        System.out.println("controller");
        stdService.save(bean);
        HttpHeaders headers = new HttpHeaders();    
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<List<Student>> all() {
        System.out.println("get Method");
        return new ResponseEntity<>(stdService.getAll(), HttpStatus.OK);
    }

    }

