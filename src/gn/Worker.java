package gn;

public class Worker implements Gnomes{
	private int age;
	private String[] ty;

	public Worker(int age, String ty){
        this.age = age;
        this.ty = ty;
    }
    


	@Override
    public void say(){
      System.out.println("- Работаем!!! - закричал ", getTy());
    }

	@Override
	public void move(){
      System.out.println("Ударил киркой о стену. Посыпались бриллианты.");
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