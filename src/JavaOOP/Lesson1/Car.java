package JavaOOP.Lesson1;


import java.util.Objects;

public class Car {



    public  String color;
    private double weight;
    private int year;
    private double velosity = 0;
    private double gas;

    public Car(double weight, int year, double velosity, double gas) {
        this.weight = weight;
        this.year = year;
        this.velosity = velosity;
        this.gas = gas;
    }

    public Car() {
    }

    public void beep() {
        System.out.println("BEEP-BEEP!!!");
    }
    public void acceleration (double a) {
        velosity = velosity + a;
    }
    public void deceleration(double d){
        if (velosity-d>=0) velosity = velosity-d;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVelosity() {
        return velosity;
    }

    public void setVelosity(double velosity) {
        this.velosity = velosity;
    }

    public void print(){
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Year car: " + year);
        System.out.println("Velosity: " + velosity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.weight, weight) == 0 &&
                year == car.year &&
                Double.compare(car.velosity, velosity) == 0 &&
                Double.compare(car.gas, gas) == 0 &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, weight, year, velosity, gas);
    }
}
