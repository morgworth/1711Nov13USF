
public class ObjectsClassJava {

	
	int x;
	int y;
	int a, b;
	
	
	// ConstructorDemo cd = new ConstructorDemo();
	public ObjectsClassJava() {
		// implicitly calls the superclass or super();
		// this will be called if no arguements are defined
		System.out.println("In no args constructor. ");
		x =0;
		y = 10;
		a = b = 5;
	}
	/*
	public ObjectsClassJava(int x){
		this.x = x;
	}
	*/
	
	public ObjectsClassJava(int x, int y){
		
	}
	public ObjectsClassJava(int a, int b, int y){
		this(10);
		
		this.y = y;
		this.a = a;
		this.b = b;
		System.out.println("In y a b constructor");
	}
	public ObjectsClassJava(int x, int y, int a, int b){
		super(); // not required as it is implicit
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
		
		
	}
	
	public ObjectsClassJava(int var) {
		// implicitly calls the superclass or super();
		x = var;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
