package ejerciciofiguras1;

class Figura {
	//ATRIBUTOS
	public String nombre;
	public String color;
	public double perimetro;
	public double area;
	
	//COSTRUCTOR
	public Figura(String nombre, String color, double perimetro, double area) {
		
		this.nombre=nombre;
		this.color=color;
		
		
		}
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
	//METODO DIME CARACTERICTICAS
	public void dime_caracteristicas() {
		
		System.out.println("Nombre de la figura: " + nombre);
        System.out.println("Color de la figura: " + color);
        System.out.println("Perímetro de la figura: " + perimetro);
        System.out.println("Área de la figura: " + area);
	}

}
