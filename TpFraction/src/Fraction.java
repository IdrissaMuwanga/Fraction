public class Fraction{
	private int numerateur;
	 private int denominateur;


	/*Constructeur*/
	 public Fraction(){
	  this.numerateur=0;
	  this.denominateur=1;
	 }
	 public Fraction(int unNumerateur,int unDenominateur){
	  this.numerateur=unNumerateur;
	  this.denominateur=unDenominateur;
	 }
	 public Fraction(int unNumerateur){
	  this.numerateur=unNumerateur;
	  this.denominateur=1;
	 }
	 
	 
	/*Affichage*/
	 public void affiche(){
	  if(this.denominateur!=0){
	   
	    System.out.println((float)(this.numerateur)/(float)(this.denominateur));
	   }
	  }
	 


	 /*Soustraction*/
	 public Fraction difference(Fraction uneFraction){
	   int numF2= uneFraction.numerateur;
	   int denF2= uneFraction.denominateur;
	   int num=this.numerateur*denF2-numF2*this.denominateur;
	   int den=this.denominateur*denF2;
	   Fraction frac = new Fraction(num, den);
	   return frac;
	 }
	 /*Addition*/
	 public Fraction somme(Fraction uneFraction){
	  int numF2= uneFraction.numerateur;
	  int denF2= uneFraction.denominateur;
	  int num=this.numerateur*denF2+numF2*this.denominateur;
	  int den=this.denominateur*denF2;
	  Fraction frac=new Fraction(num,den);
	  return frac;
	 }
	 /*Multiplication*/
	 public Fraction produit(Fraction uneFraction){
	   int numF2= uneFraction.numerateur;
	   int denF2= uneFraction.denominateur;
	   int num=this.numerateur*numF2;
	   int den=this.denominateur*denF2;
	   Fraction frac = new Fraction(num, den);
	   return frac;
	 }

	 /*Division*/
	 public Fraction quotient(Fraction uneFraction){
	  if(this.denominateur!=0 && uneFraction.denominateur!=0 && uneFraction.numerateur!=0){
	   int num=this.numerateur*uneFraction.denominateur;
	   int den=this.denominateur*uneFraction.numerateur;
	   Fraction frac=new Fraction(num,den);
	   return frac;
	  }
	  else
	   return uneFraction;
	 }


	 /*Methode getPgcd*/
	 private int getPgcd(){
	  int a = this.numerateur;
	  int b = this.denominateur;
	  if ( a!=0 && b!=0){
	   if ( a<0 ) a =-a;
	   if ( b<0 ) b =-b;
	   while ( a!=b ){
	    if ( a<b )
	     b =b - a;
	    else
	     a =a - b;
	   }
	   return a;
	  }
	  return -1;
	 
	}
	 /*
	 public String toString() {
		 return this.numerateur + "/" + this.denominateur;
		 
	 }
*/
}

