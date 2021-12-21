package ru.leroymerlin.candidate.repository;

import ru.leroymerlin.candidate.model.Candidate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CandidateRepository {
    private final List<Candidate> candidates = new ArrayList<>();

    public List<Candidate> getCandidates() {
        return candidates;
    }
}