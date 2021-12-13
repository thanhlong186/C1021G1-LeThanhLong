package extra_exercises.bai_1.service;

import extra_exercises.bai_1.model.Candidate;

public interface CandidateService {
    void add(Candidate candidate);

    Candidate[] findAll();
}
