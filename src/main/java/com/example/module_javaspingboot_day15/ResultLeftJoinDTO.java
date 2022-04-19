package com.example.module_javaspingboot_day15;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultLeftJoinDTO implements Serializable {
    private int id;
    private String name;
    private int warehouse_id;
    private String warehouse_name;
}
