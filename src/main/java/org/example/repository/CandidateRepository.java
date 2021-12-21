package org.example.repository;

import org.example.model.Candidate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CandidateRepository {
    private final ArrayList<Candidate> candidates = new ArrayList<>();

    public ArrayList<Candidate> getCandidates() {
        return candidates;
    }
}