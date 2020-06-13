package engine.model;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    //private Long id;
    private String title;
    private String text;
    private List<String> options;

    public Quiz() {
    }

    public Quiz(String title, String text, List<String> options) {
        //this.id = id;
        this.title = title;
        this.text = text;
        this.options = options;
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
}
