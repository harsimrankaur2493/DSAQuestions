public class Copyconstructor {
    public static void main(String []args){
        BankAccount b1= new BankAccount("helloworls","my name is sheila");
        BankAccount b2= new BankAccount(b1);
        //copy constructor implemented 
        b2.getPassword();
        b2.getUsername();
    }
}
class BankAccount{
    private String password;
    public String username;

    BankAccount(String name, String pwd){
        System.out.println("constructor called");
        this.username=name;
        this.password=pwd;
    }
    //copy constructor
    BankAccount(BankAccount b){
        this.password = b.password;
        this.username = b.username;
    }

    void setPassword(String newPass){
        password = newPass;
            }
    void setUsername(String newUsername){
        username= newUsername;
    }
    public void getPassword(){
        System.out.println(this.password);
    }
    public void getUsername(){
        System.out.println(this.username);
    }
}
