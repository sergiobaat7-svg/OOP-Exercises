public class TrafficLight {
    private String color;
    private int duration; // Duration in seconds

    // Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Setter for duration
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Method to check if the light is red
    public boolean isRed() {
        return "red".equalsIgnoreCase(color);
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return "green".equalsIgnoreCase(color);
    }

    // Main method for testing
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red", 60);

        System.out.println("Color: " + light.getColor());
        System.out.println("Duration: " + light.getDuration());

        System.out.println("Is red? " + light.isRed());
        System.out.println("Is green? " + light.isGreen());

        // Change color to green
        light.setColor("green");
        light.setDuration(45);

        System.out.println("\nColor changed to: " + light.getColor());
        System.out.println("Duration changed to: " + light.getDuration());
        System.out.println("Is red? " + light.isRed());
        System.out.println("Is green? " + light.isGreen());
    }
}
