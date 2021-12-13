package extra_exercises.bai_1.service.impl;

import extra_exercises.bai_1.model.Candidate;
import extra_exercises.bai_1.service.CandidateService;

public class CandidateServiceImpl implements CandidateService {

    private static Candidate[] candidateList = new Candidate[5];

    static {
        candidateList[0] = new Candidate(1,"Long", "02/12/1998", 8, 7, 8);
        candidateList[1] = new Candidate(2, "Trọng", "14/05/1995", 7, 6, 8);
        candidateList[2] = new Candidate(3, "Tuân", "09/12/2001", 5, 6, 7);
        candidateList[3] = new Candidate(4, "Ngọc", "07/08/1997", 8, 8, 8);
        candidateList[4] = new Candidate(5, "Khoa" , "11/12/2003", 4, 5, 3);
    }

    @Override
    public void add(Candidate candidate) {
        Candidate[] newCandidateList = new Candidate[candidateList.length + 1];
        newCandidateList[newCandidateList.length - 1] = candidate;

        for (int index = 0; index < candidateList.length; index++) {
            newCandidateList[index] = candidateList[index];
        }
        candidateList = newCandidateList;
    }

    @Override
    public Candidate[] findAll() {

        return candidateList;
    }
}

