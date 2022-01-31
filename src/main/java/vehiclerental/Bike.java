package vehiclerental;

import java.time.LocalTime;

public class Bike implements Rentable{

    private String id;
    private LocalTime rentingTime;
    private static final int FIX_PRICE = 15;

    public Bike(String id) {
        this.id = id;
    }

    @Override
    public int calculateSumPrice(long minutes) {
        return (int) minutes * FIX_PRICE;
    }

    @Override
    public LocalTime getRentingTime() {
        return this.rentingTime = LocalTime.now();
    }

    @Override
    public void rent(LocalTime time) {

    }

    @Override
    public void closeRent() {

    }

    @Override
    public int compareTo(Rentable other) {
        return rentingTime.compareTo(other.getRentingTime());
    }
}
