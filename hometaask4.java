/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;
public class hometaask4 {
    private int red;
    private int green;
    private int blue;

    // Constructor to initialize color values
    public hometaask4(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Getters for red, green, and blue values
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    // Override equals method to compare RGB values
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same object reference
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class

        hometaask4 otherColor = (hometaask4) obj;
        return red == otherColor.red && green == otherColor.green && blue == otherColor.blue;
    }

    // Override hashCode method for consistency with equals
    @Override
    public int hashCode() {
        return 31 * red + 31 * green + 31 * blue;
    }

    public static void main(String[] args) {
        hometaask4 color1 = new hometaask4(255, 0, 0); // Red color
        hometaask4 color2 = new hometaask4(255, 0, 0); // Another red color
        hometaask4 color3 = new hometaask4(0, 255, 0); // Green color

        System.out.println("color1 equals color2: " + color1.equals(color2)); // Should print true
        System.out.println("color1 equals color3: " + color1.equals(color3)); // Should print false
    }
}


