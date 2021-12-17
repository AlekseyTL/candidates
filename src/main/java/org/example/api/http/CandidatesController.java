package org.example.api.http;

import logic.service.CandidatesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CandidatesController {
    @GetMapping
    public String main(Map<String, Object> model) {
        CandidatesService.main(model);
        return "main";
    }

    @PostMapping
    public String add(@RequestParam String text, Map<String, Object> model) {
        CandidatesService.add(model, text);
        return "main";
    }
}
