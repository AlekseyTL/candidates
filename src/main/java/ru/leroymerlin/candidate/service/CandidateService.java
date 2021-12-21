package ru.leroymerlin.candidate.service;

import lombok.AllArgsConstructor;
import ru.leroymerlin.candidate.exceptions.NotFoundExceprion;
import ru.leroymerlin.candidate.model.Candidate;
import ru.leroymerlin.candidate.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class CandidateService {
    private final CandidateRepository candidatesRepository;

    public void add(String text) {
        int randNum = (int)(Math.random() * 1e6);
        Candidate candidate = new Candidate(randNum, text);
        candidatesRepository.getCandidates().add(candidate);
    }

    public void update(String id, String text) {
        for (Candidate candidate : candidatesRepository.getCandidates()) {
            if (candidate.getId() == Integer.parseInt(id)) {
                candidate.setName(text);
            }
        }
        for (Candidate c : candidatesRepository.getCandidates()) {
            System.out.println("---" + c + " ||== " + id + " == " + text);
        }
    }

    public Candidate getUser(String id) {
        return candidatesRepository.getCandidates().stream()
                .filter(user -> Integer.parseInt(id) == user.getId())
                .findFirst()
                .orElseThrow(NotFoundExceprion::new);
    }
}