package Project;
public class SignUp{
    private String Mobile,password;
    void signup(String a){
        if(a.equals("1")){
            Register();
        }
        else if(a.equals("2")){
            System.out.println(" Enter your registered Mobile Number");
            Login(Main.sc.next());
        }
        else{
            System.out.println("Please enter valid input");
            signup(Main.sc.next());
        }
    }
    void SetMobile(String a){
        Mobile = a;
    }
    void SetPassword(String a){
        password=a;
    }
    void Register(){
            System.out.println("Enter your Mobile Number");
            SetMobile(MobileCheck(Main.sc.next()));
            System.out.println("Create new password");
            SetPassword(Main.sc.next());
            System.out.println("\n  User Registration Successful. Please Login!!\n \nEnter your registered Mobile Number");
            Login(Main.sc.next());


    }
    String MobileCheck(String a){
        if(a.length()!=10){
            System.out.println("Please Enter Valid 10 Digit Mobile Number");
            return MobileCheck(Main.sc.next());
        }
        else {
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i)<'0'||a.charAt(i)>'9'){
                    System.out.println("Please Enter Valid 10 Digit Mobile Number");
                    return MobileCheck(Main.sc.next());
                }
            }
        }
        return a;
    }
    String GetMobile(){
        return Mobile;
    }
    String GetPassword(){
        return password;
    }
    void Login(String Mobile2){
        if(!Mobile2.equals(GetMobile())){
            System.out.println("\n  The mobile number you entered doesn't match any registered accounts.\n"+"\nPlease re-type valid registered mobile number OR enter 1 for Register");
            String a = Main.sc.next();
            if(a.equals(GetMobile())){
                Login(a);
            }
            else if (a.equals("1")) {
                Register();
            }
            else{
                Login(a);
            }
        }
        else{
            System.out.println("Enter your password");
            password();
        }
    }

    void password(){
        String password2 = Main.sc.next();
        if(!password2.equals(GetPassword())){
            System.out.println("  Incorrect password... Try again!!");
            password();
        }
        else {
            System.out.println("\n  Login Successful.\n");
        }
    }

}