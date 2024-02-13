import java.security.PublicKey;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ids = new int[50];
        String [] names = new String[50];
        String [] sexs = new String[50];
        String [] phones = new String[50];
        int [] rooms = new int[50];
        String [] starttimes = new String[50];
        String [] endtimes = new String[50];
        float [] prices = new float[50];
        String [] dates = new String[50];
        int choice = 0;
        int number = 0;
        System.out.println("=========W E L C O M E - T O - C O N F E R E N C E R O O M==========");
        System.out.println("||                    1. BOOKING ROOM                             ||");
        System.out.println("||                    2. VIEW ROOM BOOKING                        ||");
        System.out.println("||                    3. SEARCH ROOM BOOKING                      ||");
        System.out.println("||                    4. CHANGE ROOM BOOKING                      ||");
        System.out.println("||                    5. DELETE ROOM BOOKING                      ||");
        System.out.println("||                    6. ADD NEW ROOM BOOKING                     ||");
        System.out.println("||                    7. SORTING ROOM BOOKING                     ||");
        System.out.println("||                    8. Clear                                    ||");
        System.out.println("||                    9. Exit                                     ||");
        System.out.println("====================================================================");
        while(true){
            System.out.print("Please Choose Option :");
            choice = input.nextInt();
            switch(choice){
                case 1:{
                    boolean added = false;
                    System.out.print("Enter number booking :");
                    number = input.nextInt();
                    for(int i=0;i<number;i++){
                        if(number<=50){
                            System.out.println("========================================");
                            while (true) {
                                System.out.print("||            Customer ID       :");
                                int CustomerID = input.nextInt();
                                boolean idInUse = false;
                                for (int j = 0; j < ids.length; j++) {
                                    if (CustomerID == ids[j]) {
                                        System.out.println("This ID is already in use. Please try again.");
                                        idInUse = true;
                                        break;
                                    }
                                }
                                if (!idInUse) {
                                    ids[i] = CustomerID;
                                    break;
                                }
                            }
                            input.useDelimiter("\n");
                            System.out.print("||            Customer Name     :");
                            String CustomerName = input.next();
                            System.out.print("||            Customer Gender   :");
                            String CustomerGender = input.next();
                            System.out.print("||            Customer PhoneNum :");
                            String CustomerNum = input.next();
                            names[i] = CustomerName;
                            sexs[i] = CustomerGender;
                            phones[i] = CustomerNum;
                            System.out.println("Which Your Booking Room ?");
                            System.out.println("================================");
                            System.out.println("   1. VIP R O O M (70$)     ");
                            System.out.println("   2. SIMPLE R O O M (30$)  ");
                            System.out.println("================================");
                            int op=0;
                            System.out.println("\n============CHOOSE A ROOM============");
                                do{
                                    System.out.print("Please choose a room type: ");
                                    op = input.nextInt();
                                    if(op < 1 || op > 2) {
                                        System.out.println("Invalid choice. Please try again.");
                                    }
                                }while(op < 1 || op > 2);
                                switch (op) {
                                    case 1: {
                                        System.out.println("\t\t\tBOOKING VIP ROOM");
                                        System.out.println("\t\t\t [ROOM NUMBER]");
                                        for (int j = 1; j <= 30; j++) {
                                            boolean roomBooked = false;
                                            for (int k = 0; k < rooms.length; k++) {
                                                if (j == rooms[k]) {
                                                    roomBooked = true;
                                                    break;
                                                }
                                            }
                                            if (!roomBooked) {
                                                if (j == 0)
                                                    System.out.println("\t" + j);
                                                else
                                                    System.out.print("\t" + j);
                                                if (j % 10 == 0)
                                                    System.out.println("\n");
                                            }
                                        }
                                    }break;
                                    case 2: {
                                        System.out.println("\t\t\tBOOKING SIMPLE ROOM");
                                        System.out.println("\t\t\t [ROOM NUMBER]");
                                        for (int j = 1; j <= 50; j++) {
                                            boolean roomBooked = false;
                                            for (int k = 0; k < rooms.length; k++) {
                                                if (j == rooms[k]) {
                                                    roomBooked = true;
                                                    break;
                                                }
                                            }
                                            if (!roomBooked) {
                                                if (j == 0)
                                                    System.out.println("\t" + j);
                                                else
                                                    System.out.print("\t" + j);
                                                if (j % 10 == 0)
                                                    System.out.println("\n");
                                            }
                                        }
                                    }break;
                                    default: System.out.println("Room Not Found...!");
                                }
                            int newRoom;
                            while (true) {
                                System.out.print("||      INPUT ROOM       :");
                                newRoom = input.nextInt();
                                boolean roomBooked = false;
                                for (int j = 0; j < rooms.length; j++) {
                                    if (newRoom == rooms[j]) {
                                        System.out.println("This room is already booked. Please try again.");
                                        roomBooked = true;
                                        break;
                                    }
                                }
                                if (!roomBooked) {
                                    break;
                                }
                            }

                            System.out.print("||      INPUT START TIME :");
                            String newTime = input.next();
                            System.out.print("||      INPUT END TIME   :");
                            String newTimes = input.next();
                            System.out.print("||      INPUT PRICE      :");
                            float newPrice = input.nextFloat();
                            System.out.print("||      INPUT DATE       :");
                            String newDate = input.next();
                            System.out.println("========================================");

                            rooms[i] = newRoom;
                            starttimes[i] = newTime;
                            endtimes[i] = newTimes;
                            prices[i] = newPrice;
                            dates[i] = newDate;
                            added = true;
                        }
                    }
                    if (!added) {
                        System.out.println("Booking room full please try again");
                    }
                }break;
                case 2:{
                    System.out.println("=======================================================ROOM BOOKING=========================================================");
                    System.out.println("CustomerID  CustomerName     CustomerGender     CustomerPhoneNum     ROOM NUM     START TIME     END TIME     PRICE     DATE");
                    for(int i=0;i< number;i++){
                        if(names[i]!=null){
                            System.out.printf("%-11d %-16s %-18s %-20s %-12s %-14s %-12s %-9s %-13s%n", ids[i], names[i], sexs[i], phones[i], rooms[i], starttimes[i], endtimes[i], prices[i], dates[i]);
                        }
                    }
                    System.out.println("============================================================================================================================");
                }break;
                case 3:{
                    boolean check=false;
                    System.out.print("Enter CustomerID You Want To Search :");
                    int search_booking = input.nextInt();
                    for(int i=0;i< number;i++){
                        if (search_booking == ids[i]){
                            System.out.println("CustomerID  CustomerName     CustomerGender     CustomerPhoneNum     ROOM NUM     START TIME     END TIME     PRICE     DATE");
                            System.out.printf("%-11d %-16s %-18s %-20s %-12s %-14s %-12s %-9s %-13s%n", ids[i], names[i], sexs[i], phones[i], rooms[i], starttimes[i], endtimes[i], prices[i], dates[i]);
                            check = true;
                            System.out.println("Search CustomerID "+search_booking+" Successfully..!");
                        }
                    }
                    if(check==false){
                        System.out.println("Search roomNum Not Found Please Try Again..!");
                    }
                }break;
                case 4:{
                    boolean check = false;
                    System.out.println("========================");
                    System.out.println("||   1.CHANGE ROOM    ||");
                    System.out.println("||   2.UPDATE PRICE   ||");
                    System.out.println("========================");
                    System.out.print("Plse Choose option...");
                    int option = input.nextInt();
                    switch(option){
                        case 1:{
                            System.out.print("Enter CustomerID You want To Change Rooom :");
                            int change_room = input.nextInt();
                            for(int i=0;i< number;i++){
                                if(change_room == ids[i]){
                                    System.out.print("Enter new roomNumber :");
                                    int change_num = input.nextInt();
                                    rooms[i] = change_num;
                                    check = true;
                                    System.out.println("Change room successfully...!");
                                    System.out.println("Please Choose case 2 for show...");
                                }
                            }if(check==false){
                                System.out.println("Search CustomerId for Change Not found..!");
                            }
                        }break;
                        case 2:{
                            System.out.print("Enter CustomerID You want To update Price :");
                            int update_price = input.nextInt();
                            for(int i=0;i<number;i++){
                                if(update_price == ids[i]){
                                    System.out.print("Enter newPrice :");
                                    int new_price = input.nextInt();
                                    prices[i]=new_price;
                                    check=true;
                                    System.out.println("Update Price Successfully....!");
                                    System.out.println("Please Choose case 2 for show...");
                                }
                            }if(check==false){
                                System.out.println("Search CustomerId for update Not found..!");
                            }
                        }break;
                    }
                }break;
                case 5:{
                    boolean check = false;
                    System.out.print("Enter CustomerID you want to delete :");
                    int delete_booking = input.nextInt();
                    for(int i=0;i<number;i++){
                        if(delete_booking==ids[i]){
                            for(int j=i;j<number;j++){
                                ids[j]=ids[j+1];
                                names[j]=names[j+1];
                                sexs[j]=sexs[j+1];
                                phones[j]=phones[j+1];
                                rooms[j]= rooms[j+1];
                                starttimes[j]=starttimes[j+1];
                                endtimes[j]=endtimes[j+1];
                                prices[j]= prices[j+1];
                                dates[j]=dates[j+1];
                            }
                            number--;
                            System.out.println("Delete successfully...!");
                            check=true;
                        }
                    }if(check==false){
                        System.out.println("Search CustomerId for update Not found..!");
                    }
                }break;
                case 6:{
                    boolean added = false;
                    System.out.print("Do you want to add room booking ?");
                    int addd = input.nextInt();
                    for(int i=number;i<number+addd;i++){
                        System.out.println("========================================");
                        while (true) {
                            System.out.print("||            Customer ID       :");
                            int CustomerID = input.nextInt();
                            boolean idInUse = false;
                            for (int j = 0; j < ids.length; j++) {
                                if (CustomerID == ids[j]) {
                                    System.out.println("This ID is already in use. Please try again.");
                                    idInUse = true;
                                    break;
                                }
                            }
                            if (!idInUse) {
                                ids[i] = CustomerID;
                                break;
                            }
                        }
                        System.out.print("||            Customer Name     :");
                        String CustomerName = input.next();
                        System.out.print("||            Customer Gender   :");
                        String CustomerGender = input.next();
                        System.out.print("||            Customer PhoneNum :");
                        String CustomerNum = input.next();
                        names[i] = CustomerName;
                        sexs[i] = CustomerGender;
                        phones[i] = CustomerNum;
                        added = true;
                        System.out.println("Which Your Booking Room ?");
                        System.out.println("================================");
                        System.out.println("   1. VIP R O O M (70$)     ");
                        System.out.println("   2. SIMPLE R O O M (30$)  ");
                        System.out.println("================================");
                        int op=0;
                        System.out.println("\n============CHOOSE A ROOM============");
                        do {
                            System.out.print("Please choose a room type: ");
                            op = input.nextInt(); // get the user input as an integer
                            if (op < 1 || op > 2) { // check if the input is valid
                                System.out.println("Invalid choice. Please try again.");
                            }
                        } while (op < 1 || op > 2);
                        switch(op){
                            case 1:{
                                System.out.println("\t\t\tBOOKING VIP ROOM");
                                System.out.println("\t\t\t [ROOM NUMBER]");
                                for(int j=1;j<=30;j++){
                                    boolean roomBooked = false;
                                    for (int k = 0; k < rooms.length; k++) {
                                        if (j == rooms[k]) {
                                            roomBooked = true;
                                            break;
                                        }
                                    }
                                    if (!roomBooked) {
                                        if(j==0)
                                            System.out.println("\t"+j);
                                        else
                                            System.out.print("\t"+j);
                                        if(j%10==0)
                                            System.out.println("\n");
                                    }
                                }
                            }break;
                            case 2:{
                                System.out.println("\t\t\tBOOKING SIMPLE ROOM");
                                System.out.println("\t\t\t [ROOM NUMBER]");
                                for(int j=1;j<=50;j++){
                                    boolean roomBooked = false;
                                    for (int k = 0; k < rooms.length; k++) {
                                        if (j == rooms[k]) {
                                            roomBooked = true;
                                            break;
                                        }
                                    }
                                    if (!roomBooked) {
                                        if(j==0)
                                            System.out.println("\t"+j);
                                        else
                                            System.out.print("\t"+j);
                                        if(j%10==0)
                                            System.out.println("\n");
                                    }
                                }
                            }break;
                        }
                        int newRoom;
                        while (true) {
                            System.out.print("||      INPUT ROOM       :");
                            newRoom = input.nextInt();
                            boolean roomBooked = false;
                            for (int j = 0; j < rooms.length; j++) {
                                if (newRoom == rooms[j]) {
                                    System.out.println("This room is already booked. Please try again.");
                                    roomBooked = true;
                                    break;
                                }
                            }
                            if (!roomBooked) {
                                break;
                            }
                        }

                        System.out.print("||      INPUT START TIME :");
                        String newTime = input.next();
                        System.out.print("||      INPUT END TIME   :");
                        String newTimes = input.next();
                        System.out.print("||      INPUT PRICE      :");
                        float newPrice = input.nextFloat();
                        System.out.print("||      INPUT DATE       :");
                        String newDate = input.next();
                        System.out.println("========================================");

                        rooms[i] = newRoom;
                        starttimes[i] = newTime;
                        endtimes[i] = newTimes;
                        prices[i] = newPrice;
                        dates[i] = newDate;
                        added = true;
                    }
                    number+=addd;
                    System.out.println("Add Successfully.....");
                }break;
                case 7:{
                    boolean check=false;
                    int tid;
                    String tname,tsex,tphone,tstart,tend,tdate;
                    int troom;
                    float tprice;
                    for(int i=0;i<number;i++){
                        for(int j=i+1;j<number;j++){
                            if(ids[i]>ids[j]){
                                tid=ids[i];
                                ids[i]=ids[j];
                                ids[j]=tid ;

                                tname=names[i];
                                names[i]=names[j];
                                names[j]=tname ;

                                tsex=sexs[i];
                                sexs[i]=sexs[j];
                                sexs[j]=tsex ;

                                tphone=phones[i];
                                phones[i]=phones[j];
                                phones[j]=tphone ;

                                troom=rooms[i];
                                rooms[i]=rooms[j];
                                rooms[j]=troom ;

                                tstart=starttimes[i];
                                starttimes[i]=starttimes[j];
                                starttimes[j]=tstart ;

                                tend=endtimes[i];
                                endtimes[i]=endtimes[j];
                                endtimes[j]=tend ;

                                tprice=prices[i];
                                prices[i]=prices[j];
                                prices[j]=tprice ;

                                tdate=dates[i];
                                dates[i]=dates[j];
                                dates[j]=tdate ;
                                check=true;
                            }
                        }
                    }
                    System.out.println("Sort Successfully....");
                }break;
                case 8:{
                    number=0;
                    System.out.println("Clear All roomBooking successfully....!");
                }break;
                case 9:{
                    System.out.println("Thank you very much for booking room...!");
                    exit(1);
                }break;
            }
        }
    }
}
