package logic.repository;

import java.util.ArrayList;

public class CandidatesRepository {
    private static ArrayList<Candidate> candidates = new ArrayList<>();
    public static ArrayList<Candidate> getCandidates() {
        return candidates;
    }
}