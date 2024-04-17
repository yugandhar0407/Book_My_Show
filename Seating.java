package Project;

import java.util.*;
public class Seating {
    String T1,T2,T3,T4,T5;
    static String GoldTickets="",SilverTickets="";
    static int GoldCount=0,SilverCount=0;
    int NoOfTickets;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String YELLOW= "\033[1;93m";
    public static final String ANSI_GREEN = "\033[0;92m",CYAN = "\033[0;96m";
    public static final String SILVER = "\033[0;97m";

    Scanner sc = new Scanner(System.in);
    Seating(){
        System.out.println("How many Tickets do you want to book");
        tickets(sc.nextInt());


    }
    void tickets(int a){
        NoOfTickets=a;
            if(a>0&&a<6){
                Seats();
                System.out.println("\n\nSelect Your Seats-Enter the input as Row(Capital Alphabet) followed by Seat Number\nEx: A01 B12 C22 etc.. ");
                if(a==1){
                    T1=validinput(sc.next(),a);
                }
                else if(a==2){
                    T1 = validinput(sc.next(),a);
                    T2 = validinput(sc.next(),a);
                }
                else if(a==3){
                    T1 = validinput(sc.next(),a);
                    T2 = validinput(sc.next(),a);
                    T3 = validinput(sc.next(),a);
                }
                else if(a==4){
                    T1 = validinput(sc.next(),a);
                    T2 = validinput(sc.next(),a);
                    T3 = validinput(sc.next(),a);
                    T4 = validinput(sc.next(),a);
                }
                else if(a==5) {
                    T1 = validinput(sc.next(),a);
                    T2 = validinput(sc.next(),a);
                    T3 = validinput(sc.next(),a);
                    T4 = validinput(sc.next(),a);
                    T5 = validinput(sc.next(),a);
                }
            }

        else{
            System.out.println("Sorry you can only book maximum of 5 Tickets, Please provide valid number");
            tickets(sc.nextInt());
        }
    }

    void Seats(){
        for(char i='A';i<='S';i++){
            if(i=='N'||i=='A'){
                System.out.println((i=='N')? "\n\nSilver-Rs.110.00":"Gold-Rs.150.00");
                for(int k=1;k<78;k++){
                    System.out.print(i=='A'?"-":"-");
                }
            }
            System.out.print(i=='K'?"\n\n"+i+"     ":i=='R'?"\n\n     ":i=='S'?"\n":"\n"+ i+"     ");


            for (int j = 1; j <=22; j++) {

                if (i == 'A') {
                    System.out.print(j<10? "0"+j+" ":j==22?j+" "+(j+1)+" "+(j+2):j+" ");
                }
                else if (i=='R'||i=='S') {
                    System.out.print(i=='R'&&j>7&&j<23?"===":i=='S'&&j==14?"<--ALL EYES THIS WAY PLEASE-->":"  ");
                }
                else{
                    System.out.print(j ==11? j +"       ":j<10?"0"+j+" ": j +" ");

                }
            }
        }


    }
    String validinput(String a,int b){
        if(a.length()==3&&a.charAt(0)>='A'&&a.charAt(0)<='Q'&&a.charAt(1)>='0'&&a.charAt(1)<='2'&&a.charAt(2)>='0'&&a.charAt(2)<='9'){
                if(b==2&&a.equals(T1)||b==3&&(a.equals(T1)||a.equals(T2))||b==4&&(a.equals(T1)||a.equals(T2)||a.equals(T3))||b==5&&(a.equals(T1)||a.equals(T2)||a.equals(T3)||a.equals(T4))) {
                    System.out.println(a + " is already selected Seat Number, Please choose another one");
                    return validinput(sc.next(), b);
                }
                else {
                    if(a.charAt(0)<='M'){
                        GoldTickets=GoldTickets+" "+a;
                        GoldCount++;
                    }
                    else {
                        SilverTickets = SilverTickets+" "+a;
                        SilverCount++;
                    }
                    return a;
                }

        }
        else{
            System.out.println(a+" is Invalid input Please Enter valid Seat Number");
            return validinput(sc.next(),b);

        }
    }
     String PrintTickets(int a){
        return a==1?T1:a==2?T1+" "+T2:a==3?T1+" "+T2+" "+T3:a==4?T1+" "+T2+" "+T3+" "+T4:T1+" "+T2+" "+T3+" "+T4+" "+T5;
    }

}
