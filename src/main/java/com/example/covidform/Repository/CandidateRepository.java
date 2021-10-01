package com.example.covidform.Repository;

import com.example.covidform.Model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CandidateRepository extends JpaRepository<Candidate,Long> {

      List<Candidate> selectAllCandidate(String masterid);


}
