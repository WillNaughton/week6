package homeworkWeek6;



public class SpacedLogger implements Logger{

	@Override
	public void error(String error) {
		
		for (int i = 0; i < error.length(); i++) {
            StringBuilder sb1 = new StringBuilder();
            
            System.out.print(sb1.append(error.charAt(i) + " "));
		}
		
	
		
	}

	@Override
	public void log(String log) {
		
		System.out.print("ERROR: ");
		for (int i = 0; i < log.length(); i++) {
            StringBuilder sb1 = new StringBuilder();
//            System.out.println("ERROR");
            System.out.print(sb1.append(log.charAt(i) + " "));
		}
		
	
		
	}

}
