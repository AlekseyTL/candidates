package ru.leroymerlin.candidate.service;

import lombok.AllArgsConstructor;
import ru.leroymerlin.candidate.exceptions.NotFoundExceprion;
import ru.leroymerlin.candidate.model.Candidate;
import ru.leroymerlin.candidate.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CandidateService {
    private final CandidateRepository candidatesRepository;

    public Candidate create(String name, String surname) {
        int randNum = (int)(Math.random() * 1e6);
        Candidate candidate = new Candidate(randNum, name, surname);
        candidatesRepository.getCandidates().add(candidate);
        return candidate;
    }

    public void update(String id, String name, String surname) {
        for (Candidate candidate : candidatesRepository.getCandidates()) {
            if (candidate.getId() == Integer.parseInt(id)) {
                candidate.setName(name);
                candidate.setSurname(surname);
            }
        }
    }

    public List<Candidate> getCandidates() {
        return candidatesRepository.getCandidates();
    }

    public Candidate getCandidate(String id) {
        return candidatesRepository.getCandidates().stream()
                .filter(user -> Integer.parseInt(id) == user.getId())
                .findFirst()
                .orElseThrow(NotFoundExceprion::new);
    }
}