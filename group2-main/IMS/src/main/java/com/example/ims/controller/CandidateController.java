package com.example.demo.controller;

import com.example.ims.entity.Candidate;
import com.example.ims.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/candidates")
    public String viewCandidatesPage(Model model) {
        model.addAttribute("candidates", candidateService.getAllCandidates());
        return "candidateList";
    }

    @GetMapping("/showNewCandidateForm")
    public String showNewCandidateForm(Model model) {
        Candidate candidate = new Candidate();
        model.addAttribute("candidate", candidate);
        return "createCandidate";
    }

    @PostMapping("/saveCandidate")
    public String saveCandidate(@ModelAttribute("candidate") Candidate candidate) {
        candidateService.saveCandidate(candidate);
        return "redirect:/candidates";
    }

    @GetMapping("/offerDetails/{id}")
    public String viewOfferDetails(@PathVariable("id") Integer id, Model model) {
        Candidate candidate = candidateService.getCandidateById(id);
        model.addAttribute("candidate", candidate);
        return "offerDetails";
    }

    @GetMapping("/editOffer/{id}")
    public String editOffer(@PathVariable("id") Integer id, Model model) {
        Candidate candidate = candidateService.getCandidateById(id);
        model.addAttribute("candidate", candidate);
        return "editOffer";
    }
}
