package com.example.module_javaspingboot_day15;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

@Table("WAREHOUSE")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse implements Serializable {
    @Id
    private int id;
    private String name;
}
