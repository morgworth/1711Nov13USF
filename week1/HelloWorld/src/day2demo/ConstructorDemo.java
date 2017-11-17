package day2demo;

public class ConstructorDemo {
	
	int x;
	int y;
	int a, b;
	
	//constructor demo cd= new ConstructorDemo();
	public ConstructorDemo(){
		//implicitly calls super();
		this.x=0;
		this.y=10;
		this.a=this.b=5;
		System.out.println("in no args constructor");
	}
	

		public ConstructorDemo(int x){
		this.x=x;
		System.out.println("in x constructor");
	}
	
	public ConstructorDemo(int x, int y, int a, int b){
		this.x=x;
		this.y=y;
		this.a=a;
		this.b=b;
	}
	
	public ConstructorDemo(int y, int a, int b){
		this(10);
		this.y=y;
		this.a=a;
		this.b=b;
		System.out.println("in y a b constructor");
	}
	
}