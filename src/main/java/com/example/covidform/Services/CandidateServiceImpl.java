package com.example.covidform.Services;

import com.example.covidform.Model.Candidate;
import com.example.covidform.Repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public List<Candidate> selectAllCandidate(String studentmasterid)
    {
        return candidateRepository.selectAllCandidate(studentmasterid);


    }










}
