package com.lab2.firstmvc.repositories;

import com.lab2.firstmvc.domain.Product;
import com.lab2.firstmvc.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
