import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
		Scanner scan = new Scanner(System.in); // on demande a l'utilisateur de rentrer les valeurs des différents numerateurs et denominateurs
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		d=scan.nextInt();
		e=scan.nextInt();
		f=scan.nextInt();
		g=scan.nextInt();
		h=scan.nextInt();
		i=scan.nextInt();
		j=scan.nextInt();
		k=scan.nextInt();
		l=scan.nextInt();
		m=scan.nextInt();
		n=scan.nextInt();
		o=scan.nextInt();
		p=scan.nextInt();
		Fraction f =new Fraction(a,b); 
		Fraction f1 =new Fraction (c,d);
		Fraction f2 =new Fraction (e,f);
		Fraction f3= new Fraction(g,h);
		Fraction f4=new Fraction(i,j);
		Fraction f5=new Fraction(k,l);
		Fraction f6=new Fraction(m,n);
		Fraction f7=new Fraction(o,p);
		
		f.difference(f1).affiche(); //f+f1
		f2.somme(f3).affiche(); //f2+f3
		f4.quotient(f5).affiche(); //f4+f5
		f6.produit(f7).affiche(); //f6+f7
	}
	
	
}
