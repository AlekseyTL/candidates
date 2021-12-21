package ru.leroymerlin.candidate.api.http;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.leroymerlin.candidate.model.Candidate;
import ru.leroymerlin.candidate.repository.CandidateRepository;
import ru.leroymerlin.candidate.service.CandidateService;

import java.util.ArrayList;

@RestController
@AllArgsConstructor
@RequestMapping("/v1")
public class CandidateController {
    private final CandidateService candidatesService;
    private final CandidateRepository candidateRepository;

    @GetMapping()
    public ArrayList<Candidate> main() {
        return candidateRepository.getCandidates();
    }

    @GetMapping("/{id}")
    public Candidate getUser(@PathVariable String id) {
        return candidatesService.getUser(id);
    }

    @PostMapping
    public ArrayList<Candidate> create(@RequestBody String text) {
        candidatesService.add(text);
        return candidateRepository.getCandidates();
    }

    @PutMapping("/{id}")
    public ArrayList<Candidate> update(@PathVariable String id, @RequestBody String text) {
        candidatesService.update(id, text);
        return candidateRepository.getCandidates();
    }
}
