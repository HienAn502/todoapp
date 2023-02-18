package com.example.demo.Controller;

import com.example.demo.Model.TodoTask;
import com.example.demo.Repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TodoListController {
    @Autowired
    TodoListRepository todoListRepository;

//    @RequestMapping(value="/")
//    public String getAllTasks(Model model) {
//        List<TodoTask> todoTasks = todoListRepository.findAll();
//        model.addAttribute("todo_tasks", todoTasks);
//        return "index";
//    }
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("todo_tasks", todoListRepository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute("todo_task") TodoTask todo_task) {
        return "addTask";
    }

    @PostMapping("/create")
    public String create(Model model, @ModelAttribute("todo_task") TodoTask todoTask) {
        todoListRepository.save(todoTask);
        model.addAttribute("todo_tasks", todoListRepository.findAll());
        return "redirect:/";
    }
    @PostMapping("/update")
    public String update(@RequestParam("id") Long id, @ModelAttribute TodoTask todoTask, Model model) {
        todoListRepository.save(todoTask);
        model.addAttribute("todo_tasks",todoListRepository.findAll());
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam(name="id") Long id, Model model) {
        model.addAttribute("todo_task", todoListRepository.findById(id).get());
        return "updateTask";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam(name="id") Long id, Model model) {
        todoListRepository.delete(todoListRepository.findById(id).get());
        model.addAttribute("todo_tasks", todoListRepository.findAll());
        return "index";
    }
//

}
