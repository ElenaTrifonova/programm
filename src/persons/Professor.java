package persons;


import persons.Person;

public class Professor extends Person {

	public Professor(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}

	@Override
	public void saySomething(){
		System.out.println("-У них кирки!!!!!!, - тихо вскрикнул ", getName());
	}

	public void returnStudent(){
		System.out.println("Немедленно подойди ко мне!, - воскликнул  ", getType());
	}

	public void saySmell(){
    Time tt = new Time();
    mm = tt.mainn();
    if (mm<2){
    	System.out.println("Какой едкий запах! - отметил", getType());
    }
    else {
    	System.out.println("Едкий запах усиливается, - осказал", getName());
    }
	}
}
