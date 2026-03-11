package com.example.service.todolist.controller;

import com.example.service.todolist.dto.ToDoListDto;
import com.example.service.todolist.service.ToDoListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class ToDoListController {

	private final ToDoListService toDoListService;

	public ToDoListController(ToDoListService toDoListService) {
		this.toDoListService = toDoListService;
	}

	@GetMapping("/")
	public ToDoListDto getToDoList(@RequestParam String param) {
		return toDoListService.getToDoList(param);
	}
}
