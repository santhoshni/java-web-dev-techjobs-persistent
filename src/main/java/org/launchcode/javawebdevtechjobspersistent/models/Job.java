package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Job extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;

    @ManyToOne
//    @JoinColumn(name = "employer")
    private Employer employer;

    //private String employer;

    //private String skills;

    @ManyToMany
    //@JoinColumn
    private List<Skill> skills =new ArrayList<>();

    public Job() {
    }

    //public Job(String anEmployer, String someSkills)
    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

}
