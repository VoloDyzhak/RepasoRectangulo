package clase;

public class rectangulo {
	private int base;
	private int altura;
	
		
	public rectangulo(int base ,int altura ) {
		if(base <= 0 || altura <= 0) {
			throw new IllegalArgumentException("La base y altura deben ser superiores a 0");
			
		}
		this.altura= altura;
		this.base = base ;
		
		
	}
	
	/**
	 * calcula el area de l rectangulo
	 *@return el area del rectangulo 
	 */
	
	public int arrea(){
		
	return base * altura ;
			
	}
	
	/**
	 * Calcula el perimetro del rectangulo
	 * 
	 * @return 
	 */
	public int perimetro(){
		
	return 2* base +  2 *altura ;
			
	}
	
	
	}
