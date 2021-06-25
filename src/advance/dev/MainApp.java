package advance.dev;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import advance.dev.Shape;

public class MainApp {	
	static void input(List<Shape> shapeList){
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 1; i++) {
			System.out.println("name, Ban Kinh:");
			String name = sc.next();
			double banKinh = sc.nextDouble();
			Shape cirShape = new Circle(name, banKinh);
			shapeList.add(cirShape);
		}

		for (int i = 0; i < 2; i++) {
			System.out.println("name, Canh A, Canh B:");
			String name = sc.next();
			double canhA = sc.nextDouble();
			double canhB = sc.nextDouble();
			Shape recShape = new Rectangle(name, canhA, canhB);
			shapeList.add(recShape);	
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("name, Canh A, Canh B, Canh C:");
			String name = sc.next();
			double canhA = sc.nextDouble();
			double canhB = sc.nextDouble();
			double canhC = sc.nextDouble();
			Shape triShape = new Triangle(name, canhA, canhB, canhC);
			shapeList.add(triShape);	
		}
	}
	
	static void print(List<Shape> shapeList) {
		for (Shape shape : shapeList) {
			System.out.println(shape);
		}
	}
	
	//maxChuvi
	static void findMaxChuVi(List<Shape> shapeList) {
		Shape max = shapeList.get(0);
		for (Shape shape : shapeList) {
			if(max.chuVi() < shape.chuVi()) {
				max = shape;
			}
		}
		System.out.println("Chu vi lon nhat la:" + max.chuVi());
	}
	//maxDienTich
	static void findMaxDienTich(List<Shape> shapeList) {
		Shape max = shapeList.get(0);
		for (Shape shape : shapeList) {
			if(max.chuVi() < shape.chuVi()) {
				max = shape;
			}
		}
		System.out.println("Dien tich lon nhat la:" + max.dienTich());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub)
		List<Shape> shapeList = new ArrayList<Shape>();
		input(shapeList);
		print(shapeList);
		findMaxChuVi(shapeList);
		findMaxDienTich(shapeList);

	}
}