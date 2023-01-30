package ejerciciofiguras1;

public class Rectangulo extends Figura {
	
	  	//ATRIBUTOS ADICIONALES
	    private double ladoArriba;
	    private double ladoDerecho;
	    private double ladoAbajo;
	    private double ladoIzquierdo;
	 
	    //CONTRUCTOR PROPIO Y HEREDADO
	    public Rectangulo(String nombre, String color, double ladoArriba,double ladoDerecho, double ladoAbajo, double ladoIzquierdo) {
	        super(nombre, color, ladoIzquierdo + ladoArriba + ladoDerecho + ladoAbajo, ladoIzquierdo * ladoArriba);

	        this.ladoIzquierdo = ladoIzquierdo;
	        this.ladoArriba = ladoArriba;
	        this.ladoDerecho = ladoDerecho;
	        this.ladoAbajo = ladoAbajo;
	    	
	    }
	    
	    //METODO BOOLEAN PAA DETERMINAR SI ES CUADRADO O RECTANGULO
	    public boolean comprobarCuadrado(Rectangulo rec){
	        if(rec.getLadoIzquierdo() == rec.getLadoArriba() && rec.getLadoArriba() == rec.getLadoDerecho() && rec.getLadoDerecho() == rec.getLadoAbajo()){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }

	    //GETTERS Y SETTERS
		public double getLadoArriba() {
			return ladoArriba;
		}

		public void setLadoArriba(double ladoArriba) {
			this.ladoArriba = ladoArriba;
		}

		public double getLadoDerecho() {
			return ladoDerecho;
		}

		public void setLadoDerecho(double ladoDerecho) {
			this.ladoDerecho = ladoDerecho;
		}

		public double getLadoAbajo() {
			return ladoAbajo;
		}

		public void setLadoAbajo(double ladoAbajo) {
			this.ladoAbajo = ladoAbajo;
		}

		public double getLadoIzquierdo() {
			return ladoIzquierdo;
		}

		public void setLadoIzquierdo(double ladoIzquierdo) {
			this.ladoIzquierdo = ladoIzquierdo;
		}
	    
	    
	    
	    

}
