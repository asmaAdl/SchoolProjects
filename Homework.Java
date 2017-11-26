package Mathematiques;
import java.util.Scanner;
public class Algorithme 
{
	static double m;
	static double fa;
	static double fm;
	private static Scanner sc;

    public static void main(String[] args) {
    	sc = new Scanner(System.in);
    	System.out.print("Entrez la valeur de a:");
    	double a = sc.nextDouble();
    	System.out.print("Entrez la valeur de b:");
    	double b = sc.nextDouble();
    	System.out.print("Entrez la valeur de N:");
		int N = sc.nextInt();
    	for(int k = 1; k <N; k++) {
    		m = (a+b)/2;
    		fa = Math.pow(a, 3)+2*(a)-2 ;
    		fm = Math.pow(m, 3)+2*(m)-2 ;
    	if((fm*fa)>0){
    		a = m;
        }
    	else {
    		b =m;
    	        }
    	
   	 }
    	System.out.println("La solution est comprise entre "+a+"et "+b);
    }
}

    
