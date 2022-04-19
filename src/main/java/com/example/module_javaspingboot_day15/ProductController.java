package com.example.module_javaspingboot_day15;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    IWarehouseRepository warehouseRepository;

    @GetMapping(value = "/innerjoin")
    public Flux<ResultInnerJoinDTO> innerJoinQuery(){
        return warehouseRepository.innerJoin2Tables();
    }

    @GetMapping(value = "/leftjoin")
    public Flux<ResultLeftJoinDTO> leftJoinQuery(){
        return warehouseRepository.leftJoin2Tables();
    }

    @GetMapping(value = "/rightjoin")
    public Flux<ResultRightJoinDTO> rightJoinQuery(){
        return warehouseRepository.rightJoin2Tables();
    }
}
