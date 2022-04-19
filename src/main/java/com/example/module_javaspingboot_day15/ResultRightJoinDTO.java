package com.example.module_javaspingboot_day15;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultRightJoinDTO {
    private int id;
    private String name;
    private int warehouse_id;
    private String warehouse_name;
}
