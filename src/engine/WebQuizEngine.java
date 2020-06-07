package engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class WebQuizEngine {

    public static void main(String[] args) {
        SpringApplication.run(WebQuizEngine.class, args);
    }

    public static class Quiz {

        private int id;
        private String title;
        private String text;
        private String[] options;

        public Quiz() {
        }

        public Quiz(int id, String title, String text, String[] options) {
            this.id = id;
            this.title = title;
            this.text = text;
            this.options = options;
        }

        // getters and setters
    }

    @RestController
    public static class QuizController {

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
}

