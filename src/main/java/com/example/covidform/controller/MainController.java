package com.example.covidform.controller;

import com.example.covidform.Model.Candidate;
import com.example.covidform.Services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

   @Autowired
   private CandidateService candidateServices;

    @RequestMapping("/")
    public String loginPage(Model model) {

        model.addAttribute("candidate",new Candidate());
        return "Login";

    }


    @RequestMapping("/inputform")
    public String covidForm(@ModelAttribute("candidate") Candidate candidate, Model model) {
         model.addAttribute("candidate",new Candidate());

          List<Candidate> listAllCandidate= candidateServices.selectAllCandidate(candidate.getStudentmasterid());

        model.addAttribute("listAllCandidate",listAllCandidate);

        return "CovidForm";

    }


}


