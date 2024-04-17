package Project;

public class Payment {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    Payment(){
        System.out.println("Select the Mode of Payment\n1.UPI\n2.Card Payment");
        SelectPayment(sc.next());
    }

    void SelectPayment(String a){
        int b = CheckInput(a);
        if(b==1){
            UpiPayment();
        }
        else{
            CardPayment();
        }


    }
    void UpiPayment(){
        System.out.println("Choose your UPI App  \n1.Google Pay \n2.PhonePe\n3.Paytm");
        int x = CheckInput(sc.next());
        System.out.println("Choose your transaction Method \n1.UPI ID \n2.Phone Number");
        int a = CheckInput(sc.next());
        if(a==1){
            System.out.println("Enter your upi id");
            String b = sc.next();
        }
        else{
            System.out.println("Enter Your PhoneNumber");
            SignUp obj = new SignUp();
            obj.MobileCheck(sc.next());
        }
        System.out.println("Enter your UPI PIN");
        CheckUpiPin(sc.next());
        System.out.println("Transaction Successful");

    }
    void CardPayment(){
        System.out.println("Choose your Card transaction Method \n1.Debit Card \n2.Credit Card");
        int a = CheckInput(sc.next());
        if(a==1||a==2){
            System.out.println("Enter your "+((a==1)?"Debit":"Credit")+" Card Number");
            CheckCard(sc.next());
            System.out.println("Enter Expiry Date of Card");
            CheckExpiry(sc.next());
            System.out.println("Enter CVV of Card");
            CheckCVV(sc.next());
            System.out.println("Enter Card Holder Name");
            String b = sc.next();
            System.out.println("Enter OTP");
            String otp = sc.next();
            System.out.println("Transaction Successful");

        }
    }
    int CheckInput(String a){
        if(a.equals("1")){
            return 1;
        }
        else if(a.equals("2")){
            return 2;
        }

        else{
            System.out.println("Please enter valid input");
            return CheckInput(sc.next());
        }

    }
    boolean CheckCard(String a){
        if(a.length()==16&&NumInStringCheck(a)){
            return true;
        }



        else{
            System.out.println("Please enter valid 16 digit Card Number");
            CheckCard(sc.next());

        }
        return true;
    }

    int CheckExpiry(String a){
        if(a.length()==5&&a.charAt(2)=='/'&&Integer.parseInt(a.substring(0,2))>0&&Integer.parseInt(a.substring(0,2))<=12&&Integer.parseInt(a.substring(3,5))>23)
        {
            return 1;
        }
        else
        {
            System.out.println("Please enter valid Expiry Date");
            return CheckExpiry(sc.next());

        }
    }
    boolean CheckCVV(String a){
        if(a.length()==3&&NumInStringCheck(a)){
            return true;
        }
        else{
            System.out.println("Please enter valid CVV Number");
            CheckCVV(sc.next());
            return true;

        }
    }
    boolean NumInStringCheck(String a){
        for(int i=0;i<a.length();i++){
            if(!(a.charAt(i)>='0')||!(a.charAt(i)<='9')){
                return false;
            }
        }
        return true;

    }
    boolean CheckUpiPin(String a){
        if((a.length()==4||a.length()==6)&&NumInStringCheck(a)){
            return true;
        }
        else {
            System.out.println("Please Enter Valid UPI PIN (4 OR 6) Digits");
            return CheckUpiPin(sc.next());
        }
    }

}
