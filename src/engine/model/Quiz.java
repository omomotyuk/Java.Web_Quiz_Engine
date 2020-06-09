package engine.model;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

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
