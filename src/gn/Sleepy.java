package gn;

public class Sleepy implements Gnomes{
	private int age;
	private String[] ty;

    public Sleepy(int age, String ty){
        this.age = age;
        this.ty = ty;
    }
    

    @Override
    public void say(){
       System.out.println("- Дай поспать... - сказал ", getTy());
    }

	@Override	
	public void move(){
       System.out.println("И продолжил храпеть.");
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
    public String getTy(){
		return ty;
	}
	public void setTy(String[] ty){
		this.ty = ty;
	}

	@Override
	public String toString(){
		System.out.println("Сведения о гномах: ");
		return  getTy() + " " + getAge();
	}
}