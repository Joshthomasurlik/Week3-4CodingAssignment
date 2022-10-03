package test2;

import java.util.Arrays;

public class JoshCodingAssignmentWeek3and4 {

	private static final int[] String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 88};

		int lastNum = ages [ages.length - 1];

		System.out.println(lastNum);

		double total = 0;

		for (int i = 0; i < ages.length; i++) {
		total = total + ages [i];
		}
		double average = total / ages.length;
		System.out.println("The average of this array is: " + average);
		
			{
String [] names = new String [6];
names [0] = "Sam";
names [1] = "Tommy";
names [2] = "Tim";
names [3] = "Sally";
names [4] = "Buck";
names [5] = "Bob";

double sum2 = 0;
int x = 0;

for (String str : names) {
	sum2 += str.length();
}
	System.out.println(sum2/ names.length);


StringBuffer sb = new StringBuffer();
for (int i = 0; i < names.length; i++) {
	sb.append(names[i] + " ");
	}

int [] namelengths = new int [names.length];
for (int i = 0; i < names.length; i++) {
	namelengths[i] = names [i].length();
}
System.out.println(Arrays.toString(namelengths));


String str = sb.toString();
System.out.println(str);
for (String nameLengths : names) {
x += nameLengths.length();


}
		
System.out.println(x);

String word = "Nice";

int amount = 3;

System.out.println(word.repeat(amount));

String firstName = "Josh";
String lastName = "Thomas-Urlik";

System.out.println(firstName + " " + lastName.trim());

int[] arr = {22, 33, 44, 55};

for(int i = 4; i <= arr.length; i++) {
int sum = arr [0] + arr [1] + arr [2] + arr [3];
	
if (sum < 100) {
	System.out.println("True");
}
else {
	System.out.println("False");
}
double [] airry = {22.22, 33.33, 44.44, 55.55, 66.66, 77.77, 88.88, 99.99};

double totallyTubular = 0;

for (int i1 = 0; i1 < airry.length; i1++) {
	totallyTubular = totallyTubular + airry [i1];
	
}
double averageOfAirry = totallyTubular / airry.length;
System.out.println(averageOfAirry);
}
double [] airry2 = {100.01, 111.11, 122.22, 133.33, 144.44, 155.55};
double [] airry3 = {100, 111, 122, 133, 144, 155};

double totallyTubular2 = 0;
double totallyTubular3 = 0;

for (int i = 0; i < airry2.length; i++) {
	totallyTubular2 = totallyTubular2 + airry2 [i];
}
double averageOfAirry2 = totallyTubular2 / airry2.length;
System.out.println(averageOfAirry2);

for (int i = 0; i < airry3.length; i++) {
	totallyTubular3 = totallyTubular3 + airry3 [i];
}
double averageOfAirry3 = totallyTubular3 / airry3.length;			

if (averageOfAirry2 > averageOfAirry3 ) {
	System.out.println("True");
}
else {
	System.out.println("False");
}
boolean isHotOutside = true;
double moneyInPocket = 10.75;

if (moneyInPocket >= 10.50 && isHotOutside) {
	System.out.println("I will buy a drink");
}
else {
	System.out.println("I will not buy a drink");
}
//Aaron Judge is trying to hit somewhere between 50 and 65 homeruns.
//If he hits an average of 62 homeruns, output "I'll buy pizza."
// If he hits less than 62, output "No pizza for you."
//If he hits an average of more than 62 homeruns, output "Winner winner chicken dinner and Pizza."

int [] homerun = {50, 55, 60, 65};
double averageHomers = 0;

for (int i = 0; i < homerun.length; i++) {
	averageHomers = averageHomers + homerun [i];
}
double homerunAverage = averageHomers / homerun.length;


if (homerunAverage >= 62) {
	System.out.println("I'll buy pizza");
}
if (homerunAverage >= 63) {
	System.out.println("Winner winner chicken dinner and Pizza");
}
if (homerunAverage < 62) {
	System.out.println("No pizza for you.");
}



		
	




}
	





}
				
			
			

			
	
			


}//end of main
