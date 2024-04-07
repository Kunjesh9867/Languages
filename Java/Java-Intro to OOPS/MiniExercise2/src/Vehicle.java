public class Vehicle {
    // 3 variables are created below
    public int numberOfDoors = 5;
    public String gasPowered = "YES";
    public char color = 'B';
    /* For color
     * Red = R
     * Blue = B
     * Green = G
     * White = W
     * Black = B
     * Yellow = Y
     */

    // 4 constructor + default constructor
    // START
    public Vehicle() {
    }

    public Vehicle(int numberOfDoors) {
        setNumberOfDoors(numberOfDoors);
    }

    public Vehicle(String gasPowered) {
        setGasPowered(gasPowered);
    }

    public Vehicle(char color) {
        setColor(color);
    }

    public Vehicle(String gasPowered, int numberOfDoors) {
        setNumberOfDoors(numberOfDoors);
        setGasPowered(gasPowered);
    }
    // END

    // Some Extra Constructors
    public Vehicle(int numberOfDoors, String gasPowered) {
        setNumberOfDoors(numberOfDoors);
        setGasPowered(gasPowered);
    }

    public Vehicle(int numberOfDoors, char color) {
        setNumberOfDoors(numberOfDoors);
        setColor(color);
    }

    public Vehicle(char color, int numberOfDoors) {
        setNumberOfDoors(numberOfDoors);
        setColor(color);
    }

    public Vehicle(char color, String gasPowered) {
        setGasPowered(gasPowered);
        setColor(color);
    }

    public Vehicle(String gasPowered, char color) {
        setGasPowered(gasPowered);
        setColor(color);
    }

    // Getter Methods
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getGasPowered() {
        return gasPowered;
    }

    public char getColor() {
        return color;
    }

    // Setter Methods
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public void setGasPowered(String gasPowered) {
        this.gasPowered = gasPowered;
    }

    // Override method is created below
    @Override
    public String toString() {
        return " Number of Doors = " + getNumberOfDoors() +
                " Gas Powered = " + getGasPowered() +
                " Color = " + getColor();
    }       

    // EcoFriendly method is created below
    public void EcoFriendly() {
        if (numberOfDoors == 2 && !gasPowered.equals("YES")) {
            System.out.println("Vehicle is 2 doored and not gas powered");
        }
    }
}
