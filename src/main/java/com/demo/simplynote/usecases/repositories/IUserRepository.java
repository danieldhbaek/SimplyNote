package com.demo.simplynote.usecases.repositories;

import com.demo.simplynote.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
