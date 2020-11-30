package persons;

import Person;


public class Scientist extends Person{
	public Scientist(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}

	@Override
	public void saySomething(){
		System.out.println("Пингвины! - восклицает ",getType() ," и бежит за ними." );
	}

}