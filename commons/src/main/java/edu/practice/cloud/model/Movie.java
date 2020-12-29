package edu.practice.cloud.model;

public class Movie {
    private Integer id;
    private String name;
    private String synopsis;

    public Movie() {
    }

    public Movie(Integer id, String name, String synopsis) {
        this.id = id;
        this.name = name;
        this.synopsis = synopsis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
