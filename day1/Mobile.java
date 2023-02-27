package week1.day1;

public class Mobile {
	public void makeCall()
	{
		String mobileModel="A51";
		float mobileWeight=35.2f;
		
		System.out.println("What is the Mobile Model? "+mobileModel); 
		System.out.println("What is the Weight ? "+mobileWeight);
	}
	public void sendMsg()
	{
		boolean isFullCharged=true;
		int mobileCost=45000;
		System.out.println("Is it Charged fully? "+isFullCharged); 
		System.out.println("What is the Cost? "+mobileCost);
		System.out.println("This is my mobile");
	}
	
	public static void main(String[] args) {
	Mobile M=new Mobile();
	M.makeCall();
	M.sendMsg();
	}

}
