package pl.pjatk.car;

import org.springframework.boot.SpringApplication;

public class Car {

    private String mark;

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", wheels=" + wheels +
                '}';
    }

    private String model;
    private String color;
    private int year;
    private int wheels;


    public Car(String mark, String model, String color, int year, int wheels) {
        this.mark = "honda";
        this.model = "civic";
        this.color = "red";
        this.year = 2005;
        this.wheels = 4;
    }


    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getWheels() {
        return wheels;
    }

}