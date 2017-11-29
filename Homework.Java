package Mathematiques;
import java.util.Scanner;
public class Algorithme //Class
{
	static double m;//Initialisation des toutes les variables que les entrées clavier n'auront pas fournit 
	static double fa;
	static double fm;
	private static Scanner sc;//Initialisation de la variable entrée clavier

    public static void main(String[] args) {
    	sc = new Scanner(System.in);
    	System.out.print("Entrez la valeur de a:");//Afficher un message à l'écran
    	double a = sc.nextDouble();//Une entrée clavier est requise pour affecter une valeur décimal à A
    	System.out.print("Entrez la valeur de b:");//Afficher un message à l'écran
    	double b = sc.nextDouble();//Une entrée clavier est requise pour affecter une valeur décimal à B
    	System.out.print("Entrez la valeur de N:");//Afficher un message à l'écran
	int N = sc.nextInt();//Une entrée clavier est requise pour affecter un entier à N
    	for(int k = 1; k <=N; k++) {
	//Boucle "pour", k est un entier egal à 1 au debut de la boucle, pour k allant de 1 à N,on effecte à k la valeur k = k+1
    		m = (a+b)/2;// m prend cette valeur
    		fa = Math.pow(a, 3)+2*(a)-2 ;//formule de f(a)
    		fm = Math.pow(m, 3)+2*(m)-2 ;//formule de f(b)
    	if((fm*fa)>0){
    		a = m;
		//Si f(a)xf(m) est strictement positif alors a prend la valeur m
        }
    	else {
    		b =m;
		//Sinon b prend la valeur m
    	        }
    	
   	 }
    	System.out.println("La solution est comprise entre "+a+" et "+b);
	    //Affichage des solutions à l'ecran
    }
}

    
