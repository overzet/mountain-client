package be.intecbrussel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mountain implements Comparable<Mountain>{

    private long id;
    private String name;
    private double height;
    private String coordinates;

    public Mountain(long id, String name, double height, String coordinates) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.coordinates = coordinates;
    }

    public Mountain() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }


    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", coordinates='" + coordinates + '\'' +
                '}';
    }

    @Override
    public int compareTo(Mountain mountain) {
        return (int) (mountain.getHeight() - this.getHeight());
    }
}
