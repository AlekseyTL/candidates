package org.example.api.http;

import lombok.AllArgsConstructor;
import org.example.model.Candidate;
import org.example.repository.CandidateRepository;
import org.example.service.TemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@AllArgsConstructor
@RequestMapping("template")
public class TemplateController {
    private CandidateRepository candidatesRepository;
    private TemplateService templateService;

    @GetMapping
    public ArrayList<Candidate> list() {
        return candidatesRepository.getCandidates();
    }

    @GetMapping("{id}")
    public Candidate getUser(@PathVariable String id) {
        return templateService.getUser(id);
    }
}
