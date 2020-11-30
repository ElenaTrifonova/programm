package locs;


public class Brilliant extends SideGallery {
	public Brilliant(int w, int h){
		super(w, h);
	}
	@Override
	public void describe(){
		System.out.println("Галерея вся из бриллиантов.");
	}

	public void forGn(){
        System.out.println("Гномы тем временем в бриллиантовой галерее.");
	}
}
