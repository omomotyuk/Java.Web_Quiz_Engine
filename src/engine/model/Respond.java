package engine.model;

import org.springframework.http.ResponseEntity;

public class Respond {

    private boolean success;
    private String feedback;

    public Respond() {
    }

    public Respond(boolean success, String feedback) {
        this.success = success;
        this.feedback = feedback;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    // If the passed answer is correct
    public static Respond success() {
        var feedback = "Congratulations, you're right!";
        return new Respond(true, feedback);
    }

    // If the answer is incorrect
    public static Respond failure() {
        var feedback = "Wrong answer! Please, try again.";
        return new Respond(false, feedback);
    }
}
