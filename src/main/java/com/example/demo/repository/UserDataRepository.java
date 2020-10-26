package com.example.demo.repository;

import com.example.demo.model.UserData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends CrudRepository<UserData, Long> {
}
