package vehiclerental;

import java.time.LocalTime;

public class Car implements Rentable{

    private String carId;
    private int pricePerMinute;
    private LocalTime rentingTime;

    public Car(String carId, int pricePerMinute) {
        this.carId = carId;
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public int calculateSumPrice(long minutes) {
        return (int) minutes * pricePerMinute;
    }

    @Override
    public LocalTime getRentingTime() {
        return LocalTime.now();
    }

    @Override
    public void rent(LocalTime time) {

    }

    @Override
    public void closeRent() {

    }

    @Override
    public int compareTo(Rentable other) {
        return ;
    }
}
