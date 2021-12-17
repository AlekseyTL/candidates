package logic.service;

import logic.repository.Candidate;
import logic.repository.CandidatesRepository;

import java.util.Map;

public class CandidatesService {
    public static void main(Map<String, Object> model) {
        model.put("candidates", CandidatesRepository.getCandidates());
    }

    public static void add(Map<String, Object> model, String text) {
        int randNum = (int)(Math.random() * 1e6);
        Candidate candidate = new Candidate(randNum, text);
        CandidatesRepository.getCandidates().add(candidate);
        model.put("candidates", CandidatesRepository.getCandidates());
    }
}