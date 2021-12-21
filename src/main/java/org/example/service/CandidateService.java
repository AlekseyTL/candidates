package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.Candidate;
import org.example.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class CandidateService {
    private CandidateRepository candidatesRepository;

    public void main(Map<String, Object> model) {
        model.put("candidates", candidatesRepository.getCandidates());
    }

    public void add(Map<String, Object> model, String text) {
        int randNum = (int)(Math.random() * 1e6);
        Candidate candidate = new Candidate(randNum, text);
        candidatesRepository.getCandidates().add(candidate);
        model.put("candidates", candidatesRepository.getCandidates());
    }
}