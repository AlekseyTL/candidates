package org.example.api.http;

import lombok.AllArgsConstructor;
import org.example.service.CandidateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@AllArgsConstructor
public class CandidateController {
    private CandidateService candidatesService;

    @GetMapping
    public String main(Map<String, Object> model) {
        candidatesService.main(model);
        return "main";
    }

    @PostMapping
    public String add(@RequestParam String text, Map<String, Object> model) {
        candidatesService.add(model, text);
        return "main";
    }
}
