package persons;

import Person;
import Clothes;

public class Leader extends Person{

	public Leader(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}

	@Override
	public void saySomething(){
		System.out.println("-Идем строго прямо!, - сказал ", getName());
		}
	public void chooseWay(){
		int x = int(Math.random()*3 + 1);
		if (x == 1){
			System.out.println("-Сворачиваем налево, - сказал ", getName());
		}
		else if (x == 2){
			System.out.println("-Сворачиваем направо, - приказал ", getName());
		}
		else {
			System.out.println("Поторапливайтесь! Никуда не сворачиваем, - сказал ", getName());
		}
	}
	public void throww(){
		System.out.println(getType(), "скинул куртку.");
		Clothes cl1 = new Clothes();
		cl1.change();
	}
}