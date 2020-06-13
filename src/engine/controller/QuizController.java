package engine.controller;

import engine.model.Quiz;
import engine.model.Respond;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuizController {

    private List<Quiz> quizzes = new ArrayList<>();

    public QuizController() {
        Quiz quiz = new Quiz();
        //quiz.setId(1L);
        quiz.setTitle("The Java Logo");
        quiz.setText("What is depicted on the Java logo?");
        List<String> options = new ArrayList<>(){{add("Robot"); add("Tea leaf"); add("Cup of coffee"); add("Bug");}};
        quiz.setOptions(options);
        quizzes.add(quiz);
    }

    @PostMapping(path = "/quiz")
        public Respond addQuiz(@RequestParam(name = "answer") int answer) {
        Respond respond = new Respond();
        return answer == 2 ? respond.success() : respond.failure();
    }

    @GetMapping(path = "/quiz")
    public Quiz getQuiz() {
        return quizzes.get(0);
    }
}
