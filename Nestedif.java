package Activity;

public class Nestedif {

	public static void main(String[] args) {
		String address="patuli,kolkata";
		if(address.startsWith("patuli")) {
			if(address.contains("Garia")){
				System.out.println("you are living in Garia");
			}
			else if(address.contains("New Garia")) {
				System.out.println("You are living New Garia");
			}
			else {
				System.out.println(address.split(",")[0]);
			}
		}
		else {
			System.out.println("you are not living in kolkata");
		}

	}

}
