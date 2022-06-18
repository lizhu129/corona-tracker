package javaspringboot.coronatracker.controllers;

import javaspringboot.coronatracker.models.LocationStats;
import javaspringboot.coronatracker.services.CoronaDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
     CoronaDataServices coronaDataServices;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> data = coronaDataServices.getData();
        int totalCases = data.stream().mapToInt(stat -> stat.getNumOfCases()).sum();
        model.addAttribute("totalCases", totalCases);
        model.addAttribute("data", coronaDataServices.getData());

        return "index";
    }
}
