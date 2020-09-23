package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id=nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals(name, job.name) &&
                Objects.equals(employer, job.employer) &&
                Objects.equals(location, job.location) &&
                Objects.equals(positionType, job.positionType) &&
                Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
public String toString(){
        String name=this.getName();
        if(getName()==""|| getName()==null) {
        name = "Data not available";
    }
    if(employer.getValue()==""|| employer.getValue()==null){
        employer.setValue("Data not available");
    }
    if(location.getValue()==""||location.getValue()==null){
        location.setValue("Data not available");
    }
    if(positionType.getValue()==""||positionType.getValue()==null) {
        positionType.setValue("Data not available");
    }
    if(coreCompetency.getValue()==""||coreCompetency.getValue()==null) {
        coreCompetency.setValue("Data not available");
    }

    return "\n Id:"+getId()+"\n Name:"+name+"\n Employer:"+employer+"\n Location:"+location+"\n Position Type:"+positionType+"\n CoreCompetency:"+coreCompetency+"\n";


        /*System.out.println("id:"+j.getId());
             if(j.name ==" "){
                 System.out.println("\nName:Data not available");
             }else{
                 System.out.println("\nName:"+j.name);
             }
             if(j.employer.getValue() == " "){
                 System.out.println("\nEmployer:Data not available");
             }else{y
                 System.out.println("\nEmployer:"+j.employer.getValue());
                  }
    if(j.location.getValue() ==" "){
        System.out.println("\nLocation:Data not available");
        }else{
        System.out.println("\nLocation:"+j.location.getValue());
    }
    if(j.positionType.getValue()=="") {
        System.out.println("\nPosition Type:Data not available");
    }else {
        System.out.println("\nPosition Type:" + j.positionType.getValue());
    }
    if(j.coreCompetency.getValue()=="") {
        System.out.println("\nCore Competency:Data not available");
    }else {
        System.out.println("\nPosition Type:" + j.getCoreCompetency());
    }*/

    }


                }


