package com.infoLocker.InfoLocker.Service;

import com.infoLocker.InfoLocker.model.Detail;
import com.infoLocker.InfoLocker.model.Information;
import com.infoLocker.InfoLocker.repository.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InformationService {

    @Autowired
    private InformationRepository informationRepository;

    public List<Information> getAllInformations() {
        System.out.println("ddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        informationRepository.findAll().forEach(item -> System.out.println("yessss"));
    
        return informationRepository.findAll();
    }

    public Optional<Information> getInformationById(String userId) {
        return informationRepository.findByUserId(userId);
    }

    public Information addInformation(Information information) {
        return informationRepository.save(information);
    }

    public Information updateInformation(String userId, Information information) {
        System.out.println(userId);
        Detail obj = new Detail("22","test","label test");
        List<Detail> newList = new ArrayList<Detail>();
        newList.add(obj);
        information.setDetails(newList);
        return informationRepository.save(information);
    }

    public void deleteInformation(String id) {
        informationRepository.deleteById(id);
    }
}
