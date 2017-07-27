import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Please enter your salary ");
		System.out.println("Please enter your salary (AUD/YEAR):");
		Scanner s = new Scanner(System.in);
		double x = s.nextDouble();
		s.close();
		System.out.println("If Before Tax Your Income is "+ x +" After tax your income is " + beforetax(x)+" you will obtain "+beforetax(x)/52+" dollars per week" + " your hourly income will be about " +(beforetax(x)/52)/40);
		System.out.println("If Before Tax Your Income is "+ aftertax(x) +" After tax your income is " + x+" you will obtain "+ x/52+" dollars per week"+ " your hourly income will be about " +(x/52)/40);
		
	}
	
	public static double beforetax(double salary){
		if(salary<=18200){
			return salary;
		}else if(18200<salary && salary<=37000){
			return (salary-((salary-18200)*0.19));
		}else if(salary>37000 && salary<=87000){
			return(salary-3572-((salary-37000)*0.325));
		}else if(salary>87000 && salary<=180000){
			return(salary-19822-((salary-87000)*0.37));
		}else{
			return(salary-54232-((salary-180000)*0.45));
		}
	}
	
	public static double aftertax(double salary){
		if(salary<=18200){
			return salary;
		}else if(18200<salary && salary<=(37000-3572)){
			return (salary-(18200*0.19))/0.81;
		}else if(salary>(37000-3572) && salary<=(87000-17547)){
			return(salary+3572-(0.325*37000))/0.675;
		}else if(salary>(87000-17547) && salary<=(180000-54547)){
			return(salary+19822-(87000*0.37))/0.63;
		}else{
			return(salary+54232-(180000*0.45))/0.55;
		}
	}
}
