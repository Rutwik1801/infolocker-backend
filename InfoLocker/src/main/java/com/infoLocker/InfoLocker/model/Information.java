package com.infoLocker.InfoLocker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document("informations")
public class Information {
@Id
   private String id;
    private List<Detail> details;
    private List<Link> links;
    private List<File> files;

    public Information(String id) {
        this.id = id;
        this.details = new ArrayList<>();
        this.links = new ArrayList<>();
        this.files = new ArrayList<>();
    }
    public Information(String id, List<Detail> details, List<Link> links, List<File> files) {
        this.id = id;
        this.details = details;
        this.links = links;
        this.files = files;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
