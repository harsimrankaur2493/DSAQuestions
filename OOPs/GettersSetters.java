public class GettersSetters {
    public static void main(String []args){
        BankAccount b1= new BankAccount();
        b1.setPassword("helloworls");
        b1.setUsername("my name is sheila");
       // System.out.println(b1.password);
        System.out.println(b1.username);
        b1.getPassword();
        b1.getUsername();
    }
}
class BankAccount{
    private String password;
    public String username;

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
