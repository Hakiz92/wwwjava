package vn.edu.iuh.fit.controller;

import java.util.List;
import vn.edu.iuh.fit.entities.Job;
import vn.edu.iuh.fit.entities.Skill;
import vn.edu.iuh.fit.services.JobService;
import vn.edu.iuh.fit.services.CompanyService;
import vn.edu.iuh.fit.services.SkillService;
import vn.edu.iuh.fit.services.CandidateRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private JobService jobService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private SkillService skillService;
    @Autowired
    private CandidateRecommendationService candidateRecommendationService;

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("job", new Job());
        model.addAttribute("companies", companyService.getAllCompanies());
        model.addAttribute("skills", skillService.getAllSkills());
        return "create-job";
    }

    @PostMapping("/save")
    public String saveJob(@ModelAttribute Job job, @RequestParam List<Long> skillIds) {
        jobService.createJobWithSkills(job, skillIds);
        return "redirect:/jobs";
    }

    @GetMapping
    public String getAllJobs(Model model) {
        model.addAttribute("jobs", jobService.getAllJobs());
        return "job-list";
    }

//    @GetMapping("/recommendations/{id}")
//    public String showCandidateRecommendations(@PathVariable("id") long id, Model model) {
//        model.addAttribute("candidates", candidateRecommendationService.recommendCandidatesForJob(id));
//        return "candidate-recommendations";
//    }
    @GetMapping("/recommendations/{id}")
    public String showCandidateRecommendations(@PathVariable("id") long id, Model model) {
        model.addAttribute("candidates", candidateRecommendationService.recommendCandidatesForJob(id));
        model.addAttribute("jobId", id);
        return "candidate-recommendations";
    }

    @PostMapping("/send-email/{candidateId}")
    @ResponseBody
    public String sendEmailToCandidate(@PathVariable Long candidateId, @RequestParam Long jobId) {
        candidateRecommendationService.sendEmailToCandidate(candidateId, jobId);
        return "Email sent successfully!";
    }
}