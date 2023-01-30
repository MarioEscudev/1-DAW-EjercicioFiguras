package ejerciciofiguras1;

class Triangulo extends Figura {
	//ATRIBUTOS ADICIONALES
	private double lado1;
    private double lado2;
    private double base;
    private double altura;
    
    //CONTRUCTOR HERDADO Y PROPIO
    public Triangulo(String nombreFigura, String color, double lado1, double lado2, double base, double altura) {
        super(nombreFigura, color, lado1 + lado2 + base, base * altura/2);
        this.lado1 = 8;
        this.lado2 = 8;
        this.base = 8;
        this.altura = 6.93;
    }
	
	
	//GETTERS Y SETTERS
	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getLado1() {
		return lado1;
	}



	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}



	public double getLado2() {
		return lado2;
	}



	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	// METODO GETTIPOTRIANGULO
    public void getTipoTriangulo() {
        if (lado1 == lado2 && lado2 == base) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado2 == base || lado1 == base) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }
    }
	
	

}
