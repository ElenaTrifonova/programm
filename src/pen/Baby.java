package pen;

import pen.Penguin;
public class Baby extends Penguin {

	public Baby(String age, String sex, String color){
		super(number, age, sex, color);
	}

    @Override
	public void run(){
    	if (countPen==1){
    	    System.out.println("Мимо пробегает 1 пингвин.");
        }
        else if ((countPen>1) && (countPen<5)){
            System.out.println("Мимо пробегают ", countPen ," пингвина.");
        }
        else {
        	System.out.println("Мимо пробегают ", countPen ," пингвинов.");
        }
    }

	public void hide(){
		System.out.println("Пингвин №", getNumber() ," успевает скрыться.");
	}
}