package org.launchcode.techjobs.oo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

import static java.util.Objects.isNull;

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

    /* This constructor lists the id as a static integer. Subsequent objects will initialize with iterated unique IDs */
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        /* Calls the previous Constructor? Does this initialize id */
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    //Overrides
    @Override
    public boolean equals(Object comparedObj) {
        if (this == comparedObj) return true;

        if (comparedObj == null) return false;

        if (getClass() != comparedObj.getClass()) return false;

        // Return for more comparison after Getters/Setters added
        Job testJob = (Job) comparedObj;
        boolean b = testJob.getId() == getId();
        return b;

    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        // name, employer, location, positionType, coreCompetency


            if (name == null || name.isEmpty()) {name = "Data not available";}

            if ((employer.getValue()) == null || (employer.getValue()).isEmpty()) {employer.setValue("Data not available");}

            if ((location.getValue()) == null || (location.getValue()).isEmpty()) {location.setValue("Data not available");}

            if ((positionType.getValue()) == null || (positionType.getValue()).isEmpty()) {positionType.setValue("Data not available");}

            if ((coreCompetency.getValue()) == null || (coreCompetency.getValue()).isEmpty()) {coreCompetency.setValue("Data not available");}

        if (!(name == null) && !(location == null) && !(coreCompetency == null)) {
            return System.lineSeparator() +
                    "ID: " + id + System.lineSeparator() +
                    "Name: " + name + System.lineSeparator() +
                    "Employer: " + employer + System.lineSeparator() +
                    "Location: " + location + System.lineSeparator() +
                    "Position Type: " + positionType + System.lineSeparator() +
                    "Core Competency: " + coreCompetency +
                    System.lineSeparator(); }
        else { return "OOPS! This job does not seem to exist."; }
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    // Getters
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

    // Setters

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
}
