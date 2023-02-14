package com.example.demo.Controller;

import com.example.demo.Model.TodoTask;
import com.example.demo.Repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoListController {
    @Autowired
    TodoListRepository todoListRepository;

    @RequestMapping(value="/")
    public String getAllTasks(Model model) {
        List<TodoTask> todoTasks = todoListRepository.findAll();
        model.addAttribute("todo_tasks", todoTasks);
        return "index";
    }

//    @RequestMapping(value = "/{id}")
//    public String getTaskById(@PathVariable(value = "id") Long id, Model model) {
//        TodoTask todoTask = todoListRepository.getById(id);
//        model.addAttribute("todo_task", todoTask);
//        return "taskDetail";
//    }

    @PostMapping("/")
    public String saveTask(@RequestBody TodoTask todoTask, Model model) {
        todoListRepository.save(todoTask);
        List<TodoTask> todoTasks = todoListRepository.findAll();
        model.addAttribute("todo_tasks", todoTasks);
        return "todoList";
    }


}
