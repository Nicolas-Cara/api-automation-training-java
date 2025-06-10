package models.responses;

import java.util.List;

import models.requests.CatModel;

public class CatResponse {
    private Integer id;
    private String name;
    private Integer age;
    private String breed;
    private String dateJoined;
    private Boolean vaccinated;
    private List<String> temperament;
    private String staffInCharge;
    private Boolean isAdopted;
    private Integer adopterId;
    private CatModel cat;

    public CatResponse() {
    }

    public CatModel getCat() {
        return cat;
    }

    public void setCat(CatModel cat) {
        this.cat = cat;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean getVaccinated() {
        return vaccinated;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public List<String> getTemperament() {
        return temperament;
    }

    public void setTemperament(List<String> temperament) {
        this.temperament = temperament;
    }

    public String getStaffInCharge() {
        return staffInCharge;
    }

    public void setStaffInCharge(String staffInCharge) {
        this.staffInCharge = staffInCharge;
    }

    public boolean getIsAdopted() {
        return isAdopted;
    }

    public void setIsAdopted(boolean isAdopted) {
        this.isAdopted = isAdopted;
    }

    public Integer getAdopterId() {
        return adopterId;
    }

    public void setAdopterId(int adopterId) {
        this.adopterId = adopterId;
    }

}
