package com.professorangoti.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.professorangoti.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByNome(String nome);
}
