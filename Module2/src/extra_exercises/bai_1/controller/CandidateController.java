package extra_exercises.bai_1.controller;

import extra_exercises.bai_1.model.Candidate;
import extra_exercises.bai_1.service.CandidateService;
import extra_exercises.bai_1.service.impl.CandidateServiceImpl;

import java.util.Scanner;

public class CandidateController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CandidateService candidateService = new CandidateServiceImpl();
        Candidate[] candidateList = null;

        int select = 0;
        do {
            System.out.println("--Candidate List--");
            System.out.println("1. List all");
            System.out.println("2. Add new");
            System.out.println("0. Exit");

            select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1:
                    candidateList = candidateService.findAll();
                    for (Candidate candidate : candidateList) {
                        System.out.println(candidate);
                    }
                    break;
                case 2:
                    System.out.print("Input id:");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Input name:");
                    String name = sc.nextLine();
                    System.out.print("Input dayOfBrith: ");
                    String dayOfBirth = sc.nextLine();
                    System.out.print("Input pointMath: ");
                    int pointMath = Integer.parseInt(sc.nextLine());
                    System.out.print("Input pointLiterature: ");
                    int pointLiterature = Integer.parseInt(sc.nextLine());
                    System.out.print("Input pointEnglish: ");
                    int pointEnglish = Integer.parseInt(sc.nextLine());
                    Candidate candidateNew = new Candidate(id, name, dayOfBirth, pointMath, pointLiterature, pointEnglish);
                    candidateService.add(candidateNew);

                    break;
                case 0:
                    for (Candidate candidate : candidateList) {
                        if (candidate.getSum() > 15) {
                            System.out.println(candidate);
                        }

                    }
                    break;
                    }


            }
            while (select != 0) ;
        }
    }

