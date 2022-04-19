package com.example.module_javaspingboot_day15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/get-all")
    public Flux<?> getAll(){
        return studentRepository.findAll();
    }

    //Mono tra ve 0 hoac 1 phan tu
    //Flux la nhieu phan tu
    @GetMapping("/find-one/{id}")
    public Mono<Student> findById(@PathVariable Long id){
        return studentRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono deleteStudent(@PathVariable Long id){
        return studentRepository.deleteById(id);
    }

    @PostMapping("/insert")
    public Mono insertStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @PostMapping("/update")
    public Mono updateStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }


}
