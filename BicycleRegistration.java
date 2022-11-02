public class BicycleRegistration {
	public static void main(String[] args) {
		
		Bicycle bike1,bike2;
		Bicycle tagno1,tagno2;	
		
		String owner1,owner2;	
		String tagnum1, tagnum2;		
	
		bike1= new Bicycle();
			bike1.setOwnerName("Mr. Tyrone Dagalea");
		bike2= new Bicycle();
			bike2.setOwnerName("Mr. James Gonzales");
		
		owner1=bike1.getOwnerName();
		owner2=bike2.getOwnerName();
		
		tagno1= new Bicycle();
			tagno1.setTagNo("2004-134R");
		tagno2= new Bicycle();
			tagno2.setTagNo("2005-456T");
		
				tagnum1=tagno1.getTagNo();
				tagnum2=tagno2.getTagNo();
		
		System.out.println(owner1+" owns a Bicycle");
		System.out.println(owner2+" also owns a Bicycle");	}
}