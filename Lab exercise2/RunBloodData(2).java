import java.util.Scanner;
public class RunBloodData {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BloodData bd = new BloodData();
	
	System.out.println("Enter blood type of patient: ");
	String input1 = sc.nextLine();
		bd.setBloodType(input1);
		System.out.println("Enter the Rhesus factor: ");
		String input2 = sc.nextLine();
		bd.setRhFactor(input2);
	String data = input1 + input2;
	if(data.isEmpty()) {
		System.out.println("O+" + "is added to the blood bank");
			
	}	
	else if (data.equals("A+")||data.equals ("A-")|| data.equals("B+")|| data.equals("B-")|| data.equals("AB+")
		||data.equals("AB-")|| data.equals("O+")|| data.equals("O-")){
			System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank");
	}
	else{
	
		System.out.println("Invalid Input!");
	}	
	sc.close();
	}
	
}