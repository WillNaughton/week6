package homeworkWeek6;

public class AsteriskLogger implements Logger{

	@Override
	public void error(String error) {
		StringBuilder sb = new StringBuilder();
		int boxLength = error.length() + 13;
		for(int i = 0; i < boxLength; i++) {
			sb.append("*");
		}
		System.out.println(sb.toString());
		System.out.println("***" + "ERROR: " + error + "***");
		System.out.println(sb.toString());
		System.out.println("     ");
	}

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		System.out.println("     ");

	}




}
