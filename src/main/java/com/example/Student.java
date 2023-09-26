package com.example;

public class Student {
    private int score;

    public Student(int score) {
        this.score = score;
        // TODO: Initialize the score
    }

    public String grade() {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score <= 89) {
            return "B";
        } else if (score >= 70 && score <= 79) {
            return "C";
        } else if (score >= 60 && score <= 69) {
            return "D";
        } else {
            return "F";
        }
        // TODO: Calculate and return the grade based on the score. 
        // Use the following grading scale:
        // 90-100: "A"
        // 80-89: "B"
        // 70-79: "C"
        // 60-69: "D"
        // Below 60: "F"
          // Change this default return statement
    }

    public boolean isPassing() {
        // TODO: Return true if the score is 60 or above, otherwise return false
        return score >= 60; // Change this default return statement
    }
}
