package locs;
import Location;

public class Tunnel extends Location {
  
  public Tunnel(int w, int h){
  	super(w, h);

  }
  
  public int getWeight(){
  	return w;
  }

   public int getHeight(){
  	return h;
  }

  public void describe(){
     Time ti = new Time();
     mi = ti.mainn();
     if (mi<2){
    	System.out.println("Высота туннеля: ", getWeight(), " Ширина туннеля: ", getHeight());
    }
    else if (mi>=2) && (mi<=4){
    	System.out.println("Высота туннеля: ", getWeight()-0,5 , " Ширина туннеля: ", getHeight()-0,5 );
    }
    else {
        System.out.println("Высота туннеля: ", getWeight()-1 , " Ширина туннеля: ", getHeight()-1 );        
    }
	}

  public void ruin(){
    System.out.println("Обвалилась стена, обратный путь перекрыт.");

  }
}