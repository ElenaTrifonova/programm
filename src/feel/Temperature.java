package feel;

public class  Temperature implements Feelings {

	@Override
    public void depict() {
        System.out.println("Произошли некоторые климатические изменения.");
    }

	public void increase(){
		Time t = new Time();
	    m = t.mainn();
	    if ((m>0) && (m<=5)){
	    	System.out.println("Температура прохладная.")
	    }
        else if ((m>5) && (m<=7)){
        	System.out.println("Температура немного повысилась.")
        }
        else {
        	System.out.println("Температура все поднимается и поднимается.");
        }
	}
