package Day1;


public class Car{
	public static void main (String args[] ){
		CarDetails c= new CarDetails();
		c.name="BMW";
		c.color="white";
		c.number=5401;
		c.price=500000;
		c.Discount=25;
		c.netPrice = (c.price*c.Discount/100)+c.price;
		System.out.println(c.netPrice);
		CarDetails d=new CarDetails();
		d.name="nissan";
		d.color="white";
		d.number=5402;
		d.price=250000;
		d.Discount=30;
		d.netPrice = (d.price*d.Discount/100)+c.price;
		System.out.println(d.netPrice);
		
		
		}

class CarDetails {
	 String name;
	 String color;
	 int number;
	 int price;
	 int Discount;
	 int netPrice;
	 
	}}