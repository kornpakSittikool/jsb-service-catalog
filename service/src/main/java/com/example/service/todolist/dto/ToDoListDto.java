package com.example.service.todolist.dto;

import java.util.List;

public record ToDoListDto(
	String message,
	String param,
	List<String> items
) {
}
