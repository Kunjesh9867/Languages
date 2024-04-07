public class Truck extends Vehicle { // OOPS Concept = Inheritance

    // 2 variables created below
    public int seats = 5;;
    public float trunkSpace = 6.6f;

    // Default COnstructor
    public Truck() {
    }

    // 4 identifical constructor from the Vehicle file
    public Truck(int numberOfDoors) {
        setNumberOfDoors(numberOfDoors);
    }

    public Truck(String gasPowered) {
        setGasPowered(gasPowered);
    }

    public Truck(char color) {
        setColor(color);
    }

    public Truck(String gasPowered, int numberOfDoors) {
        setNumberOfDoors(numberOfDoors);
        setGasPowered(gasPowered);
    }

    // Constructor created from this file
    public Truck(int numberOfDoors, String gasPowered, char color, int seats) {
        setNumberOfDoors(numberOfDoors);
        setGasPowered(gasPowered);
        setColor(color);
        setSeats(seats);
    }

    public Truck(int numberOfDoors, String gasPowered, char color, float trunkSpace) {
        setNumberOfDoors(numberOfDoors);
        setGasPowered(gasPowered);
        setColor(color);
        setTruckSpace(trunkSpace);
    }

    public Truck(int numberOfDoors, String gasPowered, char color, int seats, float trunkSpace) {
        setNumberOfDoors(numberOfDoors);
        setGasPowered(gasPowered);
        setColor(color);
        setSeats(seats);
        setTruckSpace(trunkSpace);
    }

    // Setter Methods
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setTruckSpace(float trunkSpace) {
        this.trunkSpace = trunkSpace;
    }

    // Getter Methods
    public int getSeats() {
        return seats;
    }

    public float getTruckSpace() {
        return trunkSpace;
    }

    // Override method is created below
    @Override
    public String toString() {
        return "Truck_File: " + super.toString() + // super = Vehicle class
                " Seats = " + getSeats() +
                " Truck Space = " + getTruckSpace();
    }

    // EcoFriendly method from Vehicle class is override
    @Override
    public void EcoFriendly() {
        if ((numberOfDoors == 2) && (!gasPowered.equals("YES")) && (seats <= 2) && (trunkSpace == 0.0f)) {
            System.out.println("Vehicle is 2 doored,not gas powered, at most 2 seats and no truckspace");
        }
    }
}
