package com.example.service.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.service.todolist.dto.ToDoListDto;

@Service
public class ToDoListService {

	public ToDoListDto getToDoList(String param) {
		return new ToDoListDto(
			"success",
			param,
			List.of("task-1", "task-2", "task-3")
		);
	}

}
