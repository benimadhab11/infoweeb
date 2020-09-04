package com.bmk.infoweeb.controller;

import com.bmk.infoweeb.dto.TaskDTO;
import com.bmk.infoweeb.model.Task;
import com.bmk.infoweeb.repo.TaskRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path="task")
public class TaskController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = "/getAllTasks", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllPerson() {
        List<Task> entityList = (List<Task>) taskRepository.findAll();
        return new ResponseEntity<Object>(entityList, HttpStatus.OK);
    }

    @RequestMapping(value = "/persistTask", method = RequestMethod.POST)
    public ResponseEntity<String> persistPerson(@RequestBody TaskDTO task) {
          Task taskEntity = convertToEntity(task);
           taskRepository.save(taskEntity);
           return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    private Task convertToEntity(TaskDTO taskDto) {
        Task task = modelMapper.map(taskDto, Task.class);
        task.setStartTimeStamp(new Date(System.currentTimeMillis() - taskDto.getMinuteSpent() * 1000));
        task.setEndTimeStamp(new Date());
        return task;
    }

}
