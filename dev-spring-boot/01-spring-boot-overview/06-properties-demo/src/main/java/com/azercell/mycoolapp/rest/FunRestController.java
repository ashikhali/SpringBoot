package com.azercell.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for programmer.name and team.name

    @Value("${programmer.name}")
    public String programmerName;

    @Value("${team.name}")
    public String teamName;

    // expose a new endpoint for "teaminfo"

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Programmer name: " + programmerName + " Team name: " + teamName;
    }

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

    // exposing new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucy day.";
    }
}
