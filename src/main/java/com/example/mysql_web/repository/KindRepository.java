package com.example.mysql_web.repository;

import com.example.mysql_web.domain.Kind;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface KindRepository extends CrudRepository<Kind,Integer> {
}
