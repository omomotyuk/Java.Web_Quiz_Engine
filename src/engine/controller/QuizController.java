package engine.controller;

import engine.model.Quiz;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuizController {

    private List<Quiz> quiz = new ArrayList<>();

    public QuizController() {
    }

    @PostMapping(path = "/quiz")
    public void addQuiz(@RequestBody Quiz task){
        quiz.add(task);
    }

    @GetMapping(path = "/quiz/{id}")
    public Quiz getQuiz(@PathVariable int id){
        return quiz.get(id - 1);
    }
}
