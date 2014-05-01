
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double pi = 3.1492;
		double radius = 2.5;
		double area = (pi * radius * radius);
		
		if (area >= 4.0)
			System.out.println(area + " High");
		else if (area >= 10)
			System.out.println(area + " Medium");
		
		else 
			System.out.println(area + " low");
			
			
		
		//System.out.println("The area is = " + area);

	}

}
