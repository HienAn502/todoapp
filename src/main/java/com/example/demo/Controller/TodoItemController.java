package com.example.demo.Controller;

import com.example.demo.Repository.TodoListRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodoItemController {

//    @Autowired
//    private TodoListRepository todoListRepository;
//
//    private final Logger logger = LoggerFactory.getLogger(TodoItemController.class);
//
//    @GetMapping("/")
//    public ModelAndView index() {
//        logger.debug("request to GET index");
//        ModelAndView modelAndView = new ModelAndView("index");
//        System.out.println(todoListRepository.findAll());
//        modelAndView.addObject("todo_tasks",todoListRepository.findAll());
//        return new ModelAndView("index");
//    }
//    @GetMapping("/add")
//    public ModelAndView addTask() {
//        logger.debug("request to GET addTask");
//        return new ModelAndView("addTask");
//    }
//@GetMapping("/update")
//    public ModelAndView updateTask() {
//        logger.debug("request to GET updateTask");
//        return new ModelAndView("updateTask");
//    }
}
