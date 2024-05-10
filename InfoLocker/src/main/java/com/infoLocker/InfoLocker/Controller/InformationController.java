package com.infoLocker.InfoLocker.Controller;

import com.infoLocker.InfoLocker.Service.InformationService;
import com.infoLocker.InfoLocker.model.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/infolocker")
public class InformationController {

    @Autowired
    private InformationService informationService;

    @GetMapping("/fetchAll")
    public List<Information> getAllInformations() {
        return informationService.getAllInformations();
    }

    @GetMapping("/fetch/{id}")
    public Optional<Information> getInformationById(@PathVariable String id) {
        return informationService.getInformationById(id);
    }
    @PostMapping("/addInformation")
    public void addInformation(@RequestBody Information information) {
        System.out.println(information);
        informationService.addInformation(information);
    }
    @PostMapping("/updateInformation")
    public void updateInformation(@RequestParam String userId, @RequestBody Information information) {
        System.out.println(information);
        informationService.updateInformation(userId,information);
    }
}
