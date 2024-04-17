package Project;

public class  Ticket extends Theatre {
    void BookingSummary(){
        float BaseAmount = (float)(15*(150*Seating.GoldCount+110*Seating.SilverCount))/100;
        float IGST = BaseAmount*18/100;
        float GTPrice = 150*Seating.GoldCount;
        float STPrice = 110*Seating.SilverCount;
        float total = (GTPrice+STPrice+BaseAmount+IGST+(float)Munchies_Price );
        System.out.println("~BOOKING SUMMARY~");
        System.out.printf(Seating.GoldCount>0?"Gold -"+Seating.GoldTickets+" ("+Seating.GoldCount+" Tickets X 150) = Rs."+(GTPrice+"\n"):"");
        System.out.printf(Seating.SilverCount>0?"Silver -"+Seating.SilverTickets+" ("+Seating.SilverCount+" Tickets X 110) = Rs."+(STPrice)+"\n":"");
        System.out.printf("Convenience Fee: Base Amount = Rs.%.2f",BaseAmount);
        System.out.print("\n                 Integrated GST @18% = Rs.");
        System.out.printf("%.2f",IGST);
        System.out.print("\nFood & Beverage - "+Munchies+" = Rs."+Munchies_Price);
        System.out.printf("\n\n*Total Amount Payable is Rs.%.2f\n", total);
        System.out.println();
    }
    void m1(){
        System.out.println("\nBooking Successful...Here is Your Ticket(s) Details! ");
        System.out.println("Movie Name              :"+Movie);
        System.out.println("Movie Language          :"+Movie_Language);
        System.out.println("Date and Show Time      :"+Date+","+Time);
        System.out.println("Total Number of Tickets :"+(Seating.SilverCount+Seating.GoldCount));
        System.out.print("Seats                   :");
        System.out.print(Seating.GoldCount>0?"Gold -"+Seating.GoldTickets+" ":"");
        System.out.println(Seating.SilverCount>0?"Silver -"+Seating.SilverTickets:"");
        System.out.println("Theatre Name            :"+Theatre_Name+","+City_Name);
        System.out.println("\nThank You For Choosing BookMyShow...Visit Again To Book Another Blockbuster Movie Tickets..!! \nHAPPY WATCHING...:)");

    }
}
