package at.fhtw.bic.UptimeCalculatorBIC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DowntimeController {
    @GetMapping("/uptime/minutes")
    public double calcUptime(@RequestParam double relative){
        double minutesOfMonth = 60*24*30;
        double definedUptimeInPercent = relative/100;
        return minutesOfMonth * definedUptimeInPercent;
    }
}
