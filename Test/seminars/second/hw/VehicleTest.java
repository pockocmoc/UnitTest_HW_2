package seminars.second.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2020);
        Assertions.assertInstanceOf(Vehicle.class, car);
    }

    @Test
    public void testMotorcycleIsInstanceOfVehicle() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2019);
        Assertions.assertInstanceOf(Vehicle.class, motorcycle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Toyota", "Camry", 2020);
        Assertions.assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2019);
        Assertions.assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedDuringTestDrive() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedDuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2019);
        motorcycle.testDrive();
        Assertions.assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarSpeedAfterParking() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedAfterParking() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2019);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(0, motorcycle.getSpeed());
    }
}