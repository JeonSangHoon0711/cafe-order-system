
public class Data {
	String name, temp, size;
	int num, whipping, syrup, shot, price;
	
	public Data(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Data(String name, int num, String temp, String size, int whipping, int syrup, int shot, int price) {
		this(name, price);
		this.num = num;
		this.temp = temp;
		this.size = size;
		this.whipping = whipping;
		this.syrup = syrup;
		this.shot = shot;
	}
}
