package locs;
import Location;

public class Undeground extends Location {
	public Undeground(int w, int h){
		super(w, h);
	}

    public int getWeight(){
    	return w;
    }

    public int getHeight(){
    	return h;
    }

	@Override
	public String toString(){
		System.out.println("Сведения о подземном ходе: ");
		return getClass() + " ширина: " + getWeight() + " метров   высота: " + getHeight() + " метров";
	}	
}