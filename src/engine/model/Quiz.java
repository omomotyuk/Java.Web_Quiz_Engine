package engine.model;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    //private Long id;
    private String title;
    private String text;
    private List<String> options;
    private int correct;

    public Quiz() {
    }

    public Quiz(String title, String text, List<String> options, int correct) {
        //this.id = id;
        this.title = title;
        this.text = text;
        this.options = options;
        this.correct = correct;
    }

    // getters and setters
    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public boolean isCorrect(int value) {
        return correct == value;
    }
}
