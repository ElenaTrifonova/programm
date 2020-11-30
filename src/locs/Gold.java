package locs;

public class Gold extends SideGallery {
	public Gold(int w, int h){
		super(w, h);
	}

	@Override
	public void describe(){
		System.out.println("Галерея полностью из золота.");
	}
}