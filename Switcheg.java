package Activity;

public class Switcheg {

	public static void main(String[] args) {
		int day=7;
		String dayString="";
		switch(day) {
		case 1: dayString="1-sunday";
		break;
		case 2: dayString="2-monday";
		break;
		case 3: dayString="3-tuesday";
		break;
		case 4: dayString="4-wednesday";
		break;
		case 5: dayString="5-thrusday";
		break;
		case 6: dayString="6-friday";
		break;
		case 7: dayString="7-saturday";
		break;
		default: System.out.println("ïnvalid day");
		
		}
		System.out.println(dayString);
	}

}
