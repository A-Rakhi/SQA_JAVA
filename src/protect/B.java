package protect;
//import protect.A;

public class B extends A {
	public final void show()
	{ 
		System.out.println("show B");
	}

	public static void main(String[] args){

	B obj1 = new B();

	obj1.show();

	A obj2 = new B();

	obj2.show();

	}

}
