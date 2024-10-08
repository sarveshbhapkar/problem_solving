public class sqrt {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        sqrt s =new sqrt();
        s.name ="sarvesh";

        System.err.println("my name is : "+s.name);
    }
    
}
