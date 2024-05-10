package com.infoLocker.InfoLocker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class Information {
@Id
   private String _id;
    private List<Detail> details;
    private List<Link> links;
    private List<File> files;
    private String userId;
    
    public Information(String id) {
        this.userId = id;
        this.details = new ArrayList<>();
        this.links = new ArrayList<>();
        this.files = new ArrayList<>();
    }
}
