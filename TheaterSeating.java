
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TheaterSeating {
    static Integer Bookingcout = 0;
    static final Integer max_booking = 50;
    static Integer[] IDBooking = new Integer[max_booking];
    static Integer[] scheduleBooking = new Integer[max_booking];
    static String[] seatsBooking = new String[max_booking];

    public static void menuhall() {
        System.out.println("=================MENU FOR THIS HALL=================");
        System.out.println("A.Hall");
        System.out.println("B.Booking Hall");
        System.out.println("C.Showtime");
        System.out.println("D.Reboot show");
        System.out.println("E.History");
        System.out.println("F.Exit");
        System.out.println("====================================================");
    }

    public static void presskey() {
        Scanner input = new Scanner(System.in);
        System.out.print("---->Press key Enter for countince");
        input.nextLine();
    }

    public static void checkhall(String[][] moring, String[][] afternoon, String[][] evering) {
        System.out.println("====================================================");
        System.out.println("\t\t\t\tHall Information");
        System.out.println("====================================================");
        System.out.println("\t\t\t\t*Hall-Morning*");
        checksesion(moring);
        System.out.println("====================================================");
        System.out.println("\t\t\t\t*Hall-Afternoon*");
        checksesion(afternoon);
        System.out.println("====================================================");
        System.out.println("\t\t\t\t*Hall-evering*");
        checksesion(evering);
        System.out.println("====================================================");
    }

    public static void checksesion(String[][] sesion) {
        char seat = 'A';
        int number = 1;
        for (int i = 0; i < sesion.length; i++) {
            for (int j = 0; j < sesion[i].length; j++) {
                System.out.print("\t" + "|" + seat + "-" + number + "::" + sesion[i][j] + "|");
                number++;
            }
            seat++;
            System.out.println();
        }
    }

    public static void cheaktime() {
        System.out.println("====================================================");
        System.out.println("\t\t\t\t**Showtime information Hall**");
        System.out.println("1.Moring (10:00AM -12:30PM)");
        System.out.println("2.Afternoon(03:00PM-05:30PM)");
        System.out.println("3.Evering(07:00PM-09:30PM)");
        System.out.println("====================================================");
    }

    public static void booking(String[][] moring, String[][] afternoon, String[][] evering) {
        System.out.println("====================================================");
        System.out.println("\t\t\t\t**Start to BooKing**");
        cheaktime();
        int time = 0;
        boolean isValue;
        do {
            System.out.print("->Please select to show time(1,2,3):");
            String newtime = new Scanner(System.in).nextLine();
            if (newtime.matches("^[1-3]$")) {
                time = Integer.parseInt(newtime);
                isValue = true;
            } else {
                System.out.println("please insert value again");
                isValue = false;
            }
        } while (!isValue);
        String[][] schedule = new String[0][];
        switch (time) {
            case 1 -> schedule = moring;
            case 2 -> schedule = afternoon;
            case 3 -> schedule = evering;
            default -> System.out.println("Invalid schedule choose");
        }
        System.out.println("====================================================");
        System.out.println("#THIS IS HALL " + (time == 1 ? "MORING" : time == 2 ? "AFTERNOON" : "EVERING"));
        checksesion(schedule);
        String seats;
        do {
            System.out.println("====================================================");
            System.out.println("\t\t\t\t**Booking instruction**");
            System.out.println("====================================================");
            System.out.println("#Seat single:A-1");
            System.out.println("#Seat mutiple(separate by comma):A-1,A-2");
            System.out.print("->please input available seats is you want:");
            seats = new Scanner(System.in).nextLine();
            seats.toLowerCase();
            if (seats.matches("^(([a-zA-Z]+-\\d+)(,[a-zA-Z]+-\\d+)*)?$")) {
                isValue = true;
            } else {
                System.out.println("You input is not follow instruction");
                isValue = false;
            }
        } while (!isValue);
        String[] seatNumber = seats.split(",");
        Scanner scanner = new Scanner(System.in);
        int ID;
        do {
            System.out.print("-> Please enter student ID: ");
            String input = scanner.nextLine();
            if (input.matches("\\d+")) {
                ID = Integer.parseInt(input);
                break; // Exit the loop if input is valid
            } else {
                System.out.println("That's not a valid ID! Please enter a valid integer.");
            }
        } while (true); // Continue looping until valid input is provided
        System.out.println("====================================================");
        System.out.print("->Are you sure to booking? (Y/N):");
        String sure = new Scanner(System.in).next();
        if ("y".equalsIgnoreCase(sure)) {
            ArrayList<Integer> newSeats = new ArrayList<>();
            for (String NewsetNumber : seatNumber) {
                int Seats = Integer.parseInt(NewsetNumber.trim().substring(2));
                int row = (Seats - 1) / schedule[0].length;
                int col = (Seats - 1) % schedule[0].length;
                if (row >= 0 && row < schedule.length && col >= 0 && col < schedule[row].length) {
                    if (schedule[row][col].equals("AV")) {
                        schedule[row][col] = "BO";
                        System.out.println("Seata is Booking is sucessfully ID:" + ID + " in the "
                                + (time == 1 ? "moring" : time == 2 ? "afternoon" : "evering"));
                        newSeats.add(Seats);
                    } else {
                        System.out.println("Seats is completed is booking"
                                + (time == 1 ? "moring" : time == 2 ? "afternoon" : "evering"));
                    }
                }
            }
            if (newSeats.size() > 0) {
                IDBooking = Arrays.copyOf(IDBooking, Bookingcout + 1);
                scheduleBooking = Arrays.copyOf(scheduleBooking, Bookingcout + 1);
                seatsBooking = Arrays.copyOf(seatsBooking, Bookingcout + 1);
                IDBooking[Bookingcout] = ID;
                scheduleBooking[Bookingcout] = time;
                seatsBooking[Bookingcout] = seats;
                Bookingcout++;
            }
        } else {
            System.out.println("You don't have Booking");
        }
    }

    public static void bookHistory() {
        if (!Bookingcout.equals(0)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = LocalDate.now().format(formatter);
            System.out.println("====================================================");
            System.out.println("\t\t\t\t**Booking History**");
            System.out.println("====================================================");
            for (int i = 0; i < Bookingcout; i++) {
                String session = scheduleBooking[i] == 1 ? "morning"
                        : scheduleBooking[i] == 2 ? "afternoon" : "evening";
                System.out.println("#NO:" + (i + 1));
                System.out.println("#SEAT:" + seatsBooking[i]);
                System.out.printf("%-10s%-10s%-15s%n", "#HALL", "#STU.ID", "DATE");
                System.out.printf("%-10s%-10s%-15s%n", session, IDBooking[i], formattedDate);
                System.out.println("====================================================");
            }
        } else {
            System.out.println("====================================================");
            System.out.println("+-+-+-+You Can input Information+-+-+-+");
            System.out.println("====================================================");
        }
    }

    public static void rebootHall(String[][] mornings, String[][] afternoons, String[][] evenings) {
        Scanner input = new Scanner(System.in);
        System.out.print("You want to reboot the hall? This will clear all current bookings. (y/n): ");
        String confirmation = input.next();
        if ("y".equalsIgnoreCase(confirmation)) {
            for (int i = 0; i < mornings.length; i++) {
                for (int j = 0; j < mornings[i].length; j++) {
                    mornings[i][j] = "AV";
                }
            }
            for (int i = 0; i < afternoons.length; i++) {
                for (int j = 0; j < afternoons[i].length; j++) {
                    afternoons[i][j] = "AV";
                }
            }
            for (int i = 0; i < evenings.length; i++) {
                for (int j = 0; j < evenings[i].length; j++) {
                    evenings[i][j] = "AV";
                }
            }
            // reset booking history
            IDBooking = new Integer[0];
            scheduleBooking = new Integer[0];
            seatsBooking = new String[0];
            Bookingcout = 0;
            System.out.println("Hall has been rebooted. All current bookings have been cleared.");
        } else {
            System.out.println("Reboot cancelled.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows;
        int cols;
        String[][] moring = new String[0][0];
        String[][] afternoon = new String[0][0];
        String[][] evering = new String[0][0];
        boolean isColvaule = false, isRowvaule = false;
        do {
            System.out.println("================WELCOME TO CSTAD HALL=================");
            System.out.print("---->Please Input total row in hall:");
            String Strow = input.nextLine();
            if (Strow.matches("^[0-9]*$") && Integer.parseInt(Strow) > 0) {
                isRowvaule = true;
                System.out.print("---->Please Input total seats per row in hall:");
                String StCol = new Scanner(System.in).nextLine();
                if (StCol.matches("^[0-9]*$") && Integer.parseInt(StCol) > 0) {
                    isColvaule = true;
                    rows = Integer.parseInt(Strow);
                    cols = Integer.parseInt(StCol);
                    moring = new String[rows][cols];
                    afternoon = new String[rows][cols];
                    evering = new String[rows][cols];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            moring[i][j] = "AV";
                            afternoon[i][j] = "AV";
                            evering[i][j] = "AV";
                        }
                    }
                }
            } else {
                System.out.println("Invalid input number and you can enter again");
            }
        } while (!isRowvaule || !isColvaule);
        boolean ismenuvalue = false;
        String menuoption;
        do {
            menuhall();
            do {
                System.out.print("---->Please choose one menu(A-F):");
                menuoption = new Scanner(System.in).nextLine();
                if (menuoption.equals(menuoption.toUpperCase()) || menuoption.equals(menuoption.toLowerCase())) {
                    menuoption = menuoption.toLowerCase();
                    if (menuoption.matches("^[a-f]$")) {
                        ismenuvalue = true;
                    } else {
                        System.out.println("please input value form [A-F]");
                        presskey();
                        ismenuvalue = false;
                    }
                }
            } while (!ismenuvalue);
            switch (menuoption) {
                case "a" -> checkhall(moring, afternoon, evering);
                case "b" -> booking(moring, afternoon, evering);
                case "c" -> cheaktime();
                case "d" -> rebootHall(moring, afternoon, evering);
                case "e" -> bookHistory();
                case "f" -> System.exit(0);
                default -> System.out.println("Good luck");
            }
        } while (true);
    }
}

