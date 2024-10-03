public class Parameterized {
    int id;
    String name;
    Parameterized(int i, String n){
        id = i;
        name = n;
    }
    void displayDetail(){
        System.out.println("id : " + id + "name=" + name);
    }
    public static void main(String[] args) {
        Parameterized obj = new Parameterized(19, "ashi");
        obj.displayDetail();
    }
}
