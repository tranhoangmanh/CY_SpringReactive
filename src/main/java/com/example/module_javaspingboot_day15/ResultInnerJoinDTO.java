package com.example.module_javaspingboot_day15;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultInnerJoinDTO implements Serializable {
    private int id;
    private String name;
    private String wname;
}
