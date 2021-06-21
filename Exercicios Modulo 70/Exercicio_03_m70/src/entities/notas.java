package entities;

public class notas {
	public String  nome;
	public double n1;
	public double n2;
	public double n3;

	public double nf () {
    	return n1 + n2 + n3; }
    	
    public double resultadoFinal () { 
    	if (nf () < 60) {
    		return 60.0 - nf(); 		
    	}
    	else {
    		return 0.0;
    	}
    }
}
