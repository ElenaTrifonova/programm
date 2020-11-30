package persons;

import persons.Person;


public class Student extends Person {

	public Student(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}

	@Override
	public boolean equals(String obj) {
		if (obj == "stone"| obj == "tunnel") {
			return true;
		}
		else if (obj == "undeground" | obj == "gold" | obj == "brilliant"){
			return false;
		}
	}	
	@Override
	public void saySomething(String x){
		if (equals(x) = true){
			System.out.println("-Тут тоже жуткий запах!, - крикнул студент.");
		}
		else if (equals(x) = false ){
			System.out.println("-Тут не чувствуется запах!, - крикнул  ", getName());
		}
	}

	public void see(){
		System.out.println("Участники экспедиции внезапно увидели гномов.");
	}
	public void comeIntoGallery(){
		System.out.println(getName(), " забежал в боковую галерею.");
	}
}
