package gn;
public class Grumbler implements Gnomes{
	private int age;
	private String[] ty;
    
    public Grumbler(int age, String ty){
        this.age = age;
        this.ty = ty;
    }

	@Override
	public void say(){
      System.out.println("- А мог бы сейчас на мальдивах отдыхать! - прошептал ", getTy());
	}

	@Override
	public void move(){
      System.out.println("Безнадежно оглядел галерею.")
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
		System.out.println('Сведения о гномах: ');
		return  getTy() + ' ' + getAge();
	}
}