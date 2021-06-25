package advance.dev;

public class Triangle extends Shape {
	double canhA;
	double canhB;
	double canhC;
	public Triangle(String name, double canhA, double canhB, double canhC) {
		super(name);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return canhA + canhB + canhC;
	}
	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi()/2;
		return Math.sqrt(p * (p-canhA) * (p-canhB) * (p-canhC));
	}
	@Override
	public String toString() {
		return String.format("Ten: %s, Canh A la: %f, Canh B la: %f, Canh C: %f, Chu vi la: %f, Dien tich la: %f", name, canhA, canhB, canhC, chuVi(), dienTich());
	}
	
}
