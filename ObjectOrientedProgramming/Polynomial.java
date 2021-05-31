package DataStructures;

public class Polynomial 
{
	 	private int c[] = new int[100];
	    private int degree1;
	    private int max;
	    
		public void setCoefficient(int degree, int coeff){
	        if(degree>max){
	            max=degree;
	        }
	        c[degree] = coeff;
	        
		}
	    
		// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
		public void print(){
	        
	        for(int i=1 ; i<c.length ; i++){
	            if(c[i] != 0)
	            System.out.print(c[i] + "x" + i + " ");
	        }
	        
		}
	    // Adds two polynomials and returns a new polynomial which has result
		public Polynomial add(Polynomial p){
	        
	        Polynomial p1 = new Polynomial();
			
	        for(int i=0 ; i<c.length ; i++){
	            
	            p1.c[i] = this.c[i] + p.c[i];
	            
	        }
	        
	        return p1;
	        
		}
		
		// Subtracts two polynomials and returns a new polynomial which has result
		public Polynomial subtract(Polynomial p){
	        
	        Polynomial p1 = new Polynomial();
				
	        for(int i=0 ; i<c.length ; i++){
	            
	            p1.c[i] = this.c[i] - p.c[i];
	        }
	        
	        return p1;
	        
		}
		
		// Multiply two polynomials and returns a new polynomial which has result
		public Polynomial multiply(Polynomial p){
	        int i,j;
	       Polynomial p1 = new Polynomial();
	        
	        for(i=0 ; i<=this.max ; i++ ){
	            for(j=0 ; j<=p.max ; j++){
	               p1.c[i+j] += (this.c[i] * p.c[j]) ;
	            }
	            
	        }
	        return p1;
			
	        
		}
	
}
