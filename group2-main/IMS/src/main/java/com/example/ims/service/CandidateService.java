package com.example.ims.service;

import com.example.ims.entity.Candidate;
import com.example.ims.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    public void saveCandidate(Candidate candidate) {
        candidateRepository.save(candidate);
    }

    public Candidate getCandidateById(Integer id) {
        return candidateRepository.findById(Long.valueOf(id)).orElse(null);
    }
}
