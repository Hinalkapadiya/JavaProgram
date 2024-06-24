
public class Area {
	private double length;
    private double breadth;

    // Method to set the dimensions of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to get the area of the rectangle
    public double getArea() {
        return length * breadth;
    }



	public static void main(String[] args) {
		Area rectangle = new Area();
        rectangle.setDim(5.0, 10.0);
        System.out.println("The area of the rectangle is: " + rectangle.getArea());

		

	}

}
