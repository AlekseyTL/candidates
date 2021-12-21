package org.example.service;

import lombok.AllArgsConstructor;
import org.example.exceptions.NotFoundExceprion;
import org.example.model.Candidate;
import org.example.repository.CandidateRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TemplateService {
    CandidateRepository candidatesRepository;

    public Candidate getUser(String id) {
        return candidatesRepository.getCandidates().stream()
                .filter(user -> user.getId() == Integer.parseInt(id))
                .findFirst()
                .orElseThrow(NotFoundExceprion::new);
    }
}
