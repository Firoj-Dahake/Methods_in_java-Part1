class Animal{
    int animalno;

    public int getAnimalno() {
        return animalno;
    }

    public void setAnimalno(int animalno) {
        System.out.println("The setting the Animal No here");
        this.animalno = animalno;
    }
    public void Sprek(){
        System.out.println("Yes animal can Speak with different language");
    }
    public void Anotomy(){
        System.out.println("Animals have 4 legs 1 head and Sheput ");
    }
    public void Smell(){
        System.out.println("Some Animal can strongle smell the things");
    }
}
class Dog extends Animal{
    int dogno;

    public int getDogno() {
        return dogno;
    }

    public void setDogno(int dogno) {
        System.out.println("Setting the Dog No. here");
        this.dogno = dogno;
    }
    public void Speak(){
        System.out.println("Dogs can speak via barking");
    }
    public void Anatomy(){
        System.out.println("Dogs have 4 legs 1 head and 1 curled sheput");
    }
}

public class cwh_45_inheritance_ofanimal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setAnimalno(10);
        System.out.println(a1.getAnimalno());

        Dog d1 = new Dog();
        d1.setDogno(5);
        System.out.println(d1.getDogno());
        d1.Speak();
        d1.Anatomy();
    }
}
