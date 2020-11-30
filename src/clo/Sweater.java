package clo;

public class Sweater extends Clothes{

	public Sweater(String m, String t){
        super(m, t);
    }

    @Override
    public void fall(){
      System.out.println("На земле валяются брошенные свитера.");
    }

    @Override
    public void cut(){
      System.out.println("На свитере видны прорези.");
    }

}