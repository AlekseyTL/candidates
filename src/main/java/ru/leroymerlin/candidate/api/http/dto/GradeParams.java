package ru.leroymerlin.candidate.api.http.dto;

import lombok.Data;

@Data
public class GradeParams {
    private int one;
    private int two;
    private int three;

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getThree() {
        return three;
    }

    public void setThree(int three) {
        this.three = three;
    }
}