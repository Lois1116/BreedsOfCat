package com.example.breedsofcats.model;

public class Cat {
    private long id;
    private String catName;
    private int imageDrawableId;
    private String description;
    private String weight;
    private String temperament;
    private String origin;
    private String lifeSpan;
    private String wikipediaLink;
    private String friendlinessLevel;




    public Cat(String catName, int imageDrawableId, String description, String weight, String temperament,
               String origin, String lifeSpan, String wikipediaLink, String friendlinessLevel){

        this.catName = catName;
        this.imageDrawableId = imageDrawableId;
        this.description = description;
        this.weight = weight;
        this.temperament = temperament;
        this.origin = origin;
        this.lifeSpan = lifeSpan;
        this.wikipediaLink = wikipediaLink;
        this.friendlinessLevel = friendlinessLevel;
    }
    public long getId(){return id;}
    public void setId(int id){this.id = id;
    }

    public String getCatName() {
        return catName;
    }
    public void setCatName(String catName) {
        this.catName = catName;
    }
    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getWikipediaLink() {
        return wikipediaLink;
    }

    public void setWikipediaLink(String wikipediaLink) {
        this.wikipediaLink = wikipediaLink;
    }

    public String getFriendlinessLevel() {
        return friendlinessLevel;
    }

    public void setFriendlinessLevel(String friendlinessLevel) {
        this.friendlinessLevel = friendlinessLevel;
    }


}
