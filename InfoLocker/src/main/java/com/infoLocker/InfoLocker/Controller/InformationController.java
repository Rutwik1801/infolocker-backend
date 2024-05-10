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
@RequestMapping("/")
public class InformationController {

        @Autowired
        private InformationService informationService;

        @GetMapping("/")
        public List<Information> getAllInformations() {
            return informationService.getAllInformations();
        }

        @GetMapping("/{id}")
        public Optional<Information> getInformationById(@PathVariable String id) {
            return informationService.getInformationById(id);
        }

//        @PostMapping
//        public Information createInformation(@RequestBody Information information) {
//            return informationService.createInformation(information);
//        }
//
//        @PutMapping("/{id}")
//        public Information updateInformation(@PathVariable String id, @RequestBody Information information) {
//            return informationService.updateInformation(id, information);
//        }
//
//        @DeleteMapping("/{id}")
//        public void deleteInformation(@PathVariable String id) {
//            informationService.deleteInformation(id);
//        }

}
