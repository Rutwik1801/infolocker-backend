package com.infoLocker.InfoLocker.Service;

import com.infoLocker.InfoLocker.model.Information;
import com.infoLocker.InfoLocker.repository.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InformationService {

    @Autowired
    private InformationRepository informationRepository;

    public List<Information> getAllInformations() {
        return informationRepository.findAll();
    }

    public Optional<Information> getInformationById(String id) {
        return informationRepository.findById(id);
    }

    public Information createTask(Information information) {
        return informationRepository.save(information);
    }

    public Information updateInformation(String id, Information information) {
        information.setId(id);
        return informationRepository.save(information);
    }

    public void deleteInformation(String id) {
        informationRepository.deleteById(id);
    }
}
