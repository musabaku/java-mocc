public class pc {
    private String firstName;
    private String lastName;
    public pc(String fn, String ln){
       this.firstName = fn;
       this.lastName = ln;
    }
    @Override
    public String toString(){
    return this.firstName + "\n" + this.lastName;
    }
}
