package org.launchcode.javawebdevtechjobsauthentication.controllers.s5;

import org.launchcode.javawebdevtechjobsauthentication.models.data.s5.JobRepository;
import org.launchcode.javawebdevtechjobsauthentication.models.s5.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

/**
 * Created by LaunchCode
 */
@RequestMapping("s5")
@Controller
public class HomeController {

    @Autowired
    private JobRepository jobRepository;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("jobs", jobRepository.findAll());
        return "s5/index";
    }

    @GetMapping("add")
    public String displayAddJobForm(Model model) {
        model.addAttribute(new Job());
        return "s5/add";
    }

    @PostMapping("add")
    public String processAddJobForm(@ModelAttribute @Valid Job newJob,
                                       Errors errors) {

        if (errors.hasErrors()) {
            return "s5/add";
        }

        jobRepository.save(newJob);
        return "redirect:";
    }

    @GetMapping("view/{jobId}")
    public String displayViewJob(Model model, @PathVariable int jobId) {

        Optional optJob = jobRepository.findById(jobId);
        if (!optJob.isEmpty()) {
            Job job = (Job) optJob.get();
            model.addAttribute("job", job);
            return "s5/view";
        } else {
            return "redirect:/";
        }
    }


}
