package com.studyplanner.studyplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlannerController {

    @GetMapping("/mainPlanner")
    public void getMainPlanner() {

    }
}
