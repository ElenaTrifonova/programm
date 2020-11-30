package clo;

public class Coat extends Clothes{

	public Coat(String m, String t){
        super(m, t);
    }

    @Override
    public void fall(){
      System.out.println("Рядом лежат мятые куртки.");
    }

    @Override
    public void cut(){
      System.out.println("На куртках они также имеются.");
    }

}