public class Main{
	public static void main(String args[]){

		Student st = new Student("Дима", 18, "мужской", "студент");
		Leader le = new Leader("Виктор", 35, "мужской", "командир");
		Professor pr = new Professor("Евгений Васильевич", 27, "мужской", "профессор");
		Scientist sc = new Scientist("Иван", 25, "мужской", "ученый");

		System.out.println(st.toString());
		System.out.println(le.toString());
		System.out.println(pr.toString());
		System.out.println(sc.toString());

        Tunnel tu = new Tunnel(4, 4);
        tu.describe();

        Temperature temp = new Temperature();
        temp.increase();

        le.saySomething();
        pr.saySmell();
        st.comeIntoGallery();

        Gold g = new Gold(5, 5);
        g.describe();
        st.saySomething("gold");
        pr.returnStudent();

        le.chooseWay();
        tu.describe();
        Coat c = new Coat("мех", "куртка");
        c.temp();

        Adult ad1 = new Penguin(1, "взрослый","м", "розовый");
        Adult ad2 = new Penguin(2, "взрослый","м", "зеленый");
        Adult ad3 = new Penguin(3, "взрослый", "м", "желтый");
        ad3.run();

        System.out.println(ad1.toString());
        System.out.println(ad2.toString());
        System.out.println(ad3.toString());
        
        sc.saySomething();
        ad1.bump();
        tu.ruin();

        Sound s1 = new Sound();
        s1.one();
        s1.depict("громко");
        le.chooseWay();
        tu.describe();
        pr.saySmell();
        st.comeIntoGallery();

        Stone s = new Stone(5, 5);
        s.describe();
        st.saySomething("stone");
        pr.returnStudent();

        temp.depict();
        temp.increase();
        le.throww();
        Coat c1 = new Coat("мех", "куртка");
        System.out.println(c1.toString());
        c1.change();
        Sound s2 = new Sound();
        s2.two();
        s2.depict("тихо");

        Brilliant s3 = new Brilliant(5, 5);
        s3.forGn();

        Grumbler gn1 = new Grumbler(36, "ворчун");
        Sleepy gn2 = new Sleepy(35, "соня");
        Worker gn3 = new Worker(34, "трудяга");
        System.out.println(gn1.toString());
        System.out.println(gn2.toString());
        System.out.println(gn3.toString());

        gn3.say();
        gn3.move();

        gn2.say();
        gn2.move();

        gn1.say();
        gn1.move();

        Sweater sw = new Sweater("шерсть", "свитер");
        Coat c3 = new Coat("мех", "куртка")4
        sw.fall();
        c3.fall();
        sw.cut();
        c3.cut();

        Baby b = new Penguin(1, "ребенок", "ж", "розовый");
        b.run();
        System.out.println(b.toString());
        sc.saySomething();
        b.hide();

        le.chooseWay();
        tu.describe();
        st.see();
        pr.saySomething();



	}
}