package ru.leroymerlin.candidate.api.http;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.leroymerlin.candidate.api.http.dto.CandidateParams;
import ru.leroymerlin.candidate.model.Candidate;
import ru.leroymerlin.candidate.service.CandidateService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/candidate")
public class CandidateController {
    private final CandidateService candidatesService;

    @GetMapping()
    public List<Candidate> getCandidates() {
        return candidatesService.getCandidates();
    }

    @GetMapping("/{id}")
    public Candidate getCandidate(@PathVariable String id) {
        return candidatesService.getCandidate(id);
    }

    @PostMapping
    public Candidate create(@RequestBody CandidateParams candidate) {
        return candidatesService.create(candidate.getName(), candidate.getSurname());
    }

    @PutMapping("/{id}")
    public Candidate update(@PathVariable String id, @RequestBody CandidateParams candidate) {
        candidatesService.update(id, candidate.getName(), candidate.getSurname());
        return candidatesService.getCandidate(id);
    }
}
