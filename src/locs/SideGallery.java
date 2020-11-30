package locs;
import Location;

public class SideGallery extends Location {

	public SideGallery(int w, int h){
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
		System.out.println("Сведения о галерее: ");
		return getClass() + " ширина: " + getWeight() + " метров   высота: " + getHeight() + " метров";
	}	
}