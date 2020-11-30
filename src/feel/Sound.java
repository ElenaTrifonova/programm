package feel;

public class Sound implements Feelings {

    private String [] s;
 
    public Sound(String [] s){
        this.s=s;
    }

    @Override
    public void depict(String [] s) {
        Sound ss = new Sound();
        if (ss.equals(s) == true) {
        System.out.println("Звук был очень громкий.");
    }
        else if (ss.equals(s) == false){
            System.out.println("Звук был тихий.");
        }
    }
     
    public void one(){
        System.out.println("Слышен скрежет.");
    }

    public void two(){
        System.out.println("Слышен удар о землю.");
    }
    

    @Override
    public boolean equals(String obj) {
        if ((obj == "громко")||(obj == null)) {
            return true;
        }
        else if (obj == "тихо"){
            return false;
        }
    }
}   