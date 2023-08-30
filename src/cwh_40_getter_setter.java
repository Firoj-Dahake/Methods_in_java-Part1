import java.beans.PropertyEditorManager;

class MyEmployee{
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}
 class Circle1{
    private int r;
    private int  area;
    private int  perameter;
    public void setArea(int r){
        area= (int) (3.142f*r*r);
    }
    public void  setPreameter(int r){
     perameter= (int) (2*3.142f*r);
    }
     public int getArea(){
        return area;
     }
     public int  getPreameter(){
         return perameter;
     }
 }
public class cwh_40_getter_setter {
    public static void main(String[] args) {
        MyEmployee ramesh =new MyEmployee();
        ramesh.setId(123);
        System.out.println(ramesh.getId());
        ramesh.setName("Ramesh at this side ok !");
        System.out.println(ramesh.getName());

        Circle1 cr1=new Circle1();
        cr1.setArea(5);
        cr1.setPreameter(5);
        System.out.println(cr1.getArea());
        System.out.println(cr1.getPreameter());

    }
}
