package io.ControlFlowStatements;

public class SwitchOperator {

	public static void main(String[] args) {
		int month=10;
		String MonthString;
		
		switch (month) {
		case 1:
			MonthString = "january";
			break;
		
		
		case 2 :
		MonthString="february";
		break;
		
		case 3 :
			MonthString="march";
			break;
			
		case 4 :
			MonthString ="april";
			break;
			
		case 5:
			MonthString ="March";
			break;
			
		case 6:
			MonthString ="april";
			break;
			
			default :
				MonthString="not found !!!";
				break;
		
		
		
		
		

	}
		System.out.println(MonthString);
	}

}
