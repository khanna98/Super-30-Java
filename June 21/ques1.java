package june21;

import java.util.HashMap;
import java.util.Scanner;

public class ques1 {

	public static HashMap<String, String> myDate = new HashMap<String, String>();
	public static HashMap<String, String> myMonth = new HashMap<String, String>();
	public static HashMap<String, String> myYearHalf1 = new HashMap<String, String>();
	public static HashMap<String, String> myYearHalf2 = new HashMap<String, String>();

	public static void myData() {
		myDate.put("01", "First");
		myDate.put("02", "Second");
		myDate.put("03", "Third");
		myDate.put("04", "Fourth");
		myDate.put("05", "Fifth");
		myDate.put("06", "Sixth");
		myDate.put("07", "Seventh");
		myDate.put("08", "Eighth");
		myDate.put("09", "Nineth");
		myDate.put("10", "Tenth");
		myDate.put("11", "Eleventh");
		myDate.put("12", "Tweleveth");
		myDate.put("13", "Thirteenth");
		myDate.put("14", "Fourteenth");
		myDate.put("15", "Fifteenth");
		myDate.put("16", "Sixteenth");
		myDate.put("17", "Seventeenth");
		myDate.put("18", "Eighteenth");
		myDate.put("19", "Nineteenth");
		myDate.put("20", "Twenty");
		myDate.put("21", "Twenty First");
		myDate.put("22", "Twenty Second");
		myDate.put("23", "Twenty Third");
		myDate.put("24", "Twenty Fourth");
		myDate.put("25", "Twent Fifth");
		myDate.put("26", "Twenty Sixth");
		myDate.put("27", "Twenty Seventh");
		myDate.put("28", "Twenty Eighth");
		myDate.put("29", "Twenty Nineth");
		myDate.put("30", "Thirty");
		myDate.put("31", "Thirty First");

		myMonth.put("01", "January");
		myMonth.put("02", "February");
		myMonth.put("03", "March");
		myMonth.put("04", "April");
		myMonth.put("05", "May");
		myMonth.put("06", "June");
		myMonth.put("07", "July");
		myMonth.put("08", "August");
		myMonth.put("09", "September");
		myMonth.put("10", "October");
		myMonth.put("11", "November");
		myMonth.put("12", "December");

		myYearHalf1.put("07", "Seven");
		myYearHalf1.put("08", "Eight");
		myYearHalf1.put("09", "Nine");
		myYearHalf1.put("10", "Ten");
		myYearHalf1.put("11", "Eleven");
		myYearHalf1.put("12", "Tweleve");
		myYearHalf1.put("13", "Thirteen");
		myYearHalf1.put("14", "Fourteen");
		myYearHalf1.put("15", "Fifteen");
		myYearHalf1.put("16", "Sixteen");
		myYearHalf1.put("17", "Seventeen");
		myYearHalf1.put("18", "Eighteen");
		myYearHalf1.put("19", "Nineteen");
		myYearHalf1.put("20", "Twenty");
		myYearHalf1.put("21", "Twenty One");
		myYearHalf1.put("22", "Twenty Two");

		myYearHalf2.put("00", "Hundred");
		myYearHalf2.put("10", "Ten");
		myYearHalf2.put("20", "Twenty");
		myYearHalf2.put("30", "Thirty");
		myYearHalf2.put("40", "Forty");
		myYearHalf2.put("50", "Fifty");
		myYearHalf2.put("60", "Sixty");
		myYearHalf2.put("70", "Seventy");
		myYearHalf2.put("80", "Eighty");
		myYearHalf2.put("90", "Ninety");
	}

	public static String makeString(String s) {
		String date = s.substring(0, 2);
		String month = s.substring(3, 5);
		String yearHalf1 = s.substring(6, 8);
		String yearHalf2 = s.substring(8, 10);

		return myDate.get(date) + " " + myMonth.get(month) + " " + myYearHalf1.get(yearHalf1) + " "
				+ myYearHalf2.get(yearHalf2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the date in format dd/mm/yyyyy : ");
		String d = sc.nextLine();
		myData();
		System.out.println("The year in words is " + makeString(d));
		sc.close();
	}

}
