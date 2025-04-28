/*Exercise 1: The Rectangle Class

Problem: Create a Rectangle class that has the following:

Instance Variables (Attributes):

length (of type double)
width (of type double)
Instance Methods (Behaviors):

setDimensions(double len, double wid): This method should take two double arguments 
and set the length and width of the Rectangle object.
calculateArea(): This method should calculate and return the area of the rectangle (length * width).
calculatePerimeter(): This method should calculate and return the perimeter of the rectangle (2 * (length + width)).
displayDetails(): This method should print the length, width, area, and perimeter of 
the rectangle to the console in a user-friendly format
*/
public class TheRectangleClass {
    double length; // Instance variable
    double width;  // Instance variable

    public void setDimensions(double len, double wid) {
        this.length = len;
        this.width = wid;
    }

    public double calculateArea() {
        double area = this.length * this.width;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (this.length + this.width);
        return perimeter;
    }

    public void displayDetails() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + calculateArea()); // Call the calculateArea() method
        System.out.println("Perimeter: " + calculatePerimeter()); // Call the calculatePerimeter() method
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        TheRectangleClass rectangle1 = new TheRectangleClass(); // Create the first Rectangle object
        rectangle1.setDimensions(12, 67); // Set its dimensions
        System.out.println("Rectangle 1:");
        rectangle1.displayDetails();

        TheRectangleClass rectangle2 = new TheRectangleClass(); // Create the second Rectangle object
        rectangle2.setDimensions(5, 10); // Set its dimensions
        System.out.println("Rectangle 2:");
        rectangle2.displayDetails();

        double area1 = rectangle1.calculateArea(); // Call calculateArea on rectangle1
        double perimeter1 = rectangle1.calculatePerimeter(); // Call calculatePerimeter on rectangle1
        System.out.println("Area of rectangle 1 (again): " + area1);
        System.out.println("Perimeter of rectangle 1 (again): " + perimeter1);
    }
}