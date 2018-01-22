class Dog{

	int size;
	String breed;
	String name;

	void bark(){
		System.out.print("Ruff\n");
	}
}

class DogTestDrive{

	public static void main(String []argv){

		Dog d = new Dog();
		d.size = 40;
		d.bark();
	}
}
