package com.bmk.infoweeb.repo;

import com.bmk.infoweeb.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface TaskRepository extends CrudRepository<Task, Integer> {
}
