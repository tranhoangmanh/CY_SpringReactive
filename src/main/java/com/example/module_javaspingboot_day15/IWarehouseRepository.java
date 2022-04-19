package com.example.module_javaspingboot_day15;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface IWarehouseRepository extends ReactiveCrudRepository<Warehouse, Integer> {
    @Query("SELECT p.id, p.name, w.name AS 'wname' FROM Product p INNER JOIN Warehouse w ON p.warehouse_id = w.id")
    Flux<ResultInnerJoinDTO> innerJoin2Tables();

    @Query("SELECT p.id, p.name, p.warehouse_id, w.name AS 'warehouse_name' " +
                "FROM Product p LEFT JOIN Warehouse w ON p.warehouse_id = w.id")
    Flux<ResultLeftJoinDTO> leftJoin2Tables();

    @Query("SELECT p.id, p.name, w.id AS 'warehouse_id', w.name AS 'warehouse_name' FROM Product p RIGHT JOIN Warehouse w " +
                "ON p.warehouse_id = w.id")
    Flux<ResultRightJoinDTO> rightJoin2Tables();
}
