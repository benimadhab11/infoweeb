package com.bmk.infoweeb.repo;

import com.bmk.infoweeb.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends CrudRepository<User, Integer> {

}
