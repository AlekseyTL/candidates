package org.example.logic.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class CandidatesRepository {
    private static ArrayList<Candidate> candidates = new ArrayList<>();

    @Bean
    public static ArrayList<Candidate> getCandidates() {
        return candidates;
    }
}