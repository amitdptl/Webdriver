//import java.util.Scanner;
//
///**
// * Created by amit on 16/03/2017.
// */
//public class HomeWork130317 {
//    public static void main(String[] args) {
//
//
//        String station = ("Algate,Angle,Baker Street, Bank, Bond Street, Cannon Street, Charing Cross, covent garden," +
//                "earl's court,Edgware road,embankment,euston, euston square,Farringdon,gloucester,green park".split(","));
//
//        String[][] lines = new String[10][10];
//        lines[0][0] = "Bakloo line";
//        lines[0][1] = "Baker Street";
//        lines[0][2] = "Charing Cross";
//        lines[0][3] = "Edgware Road";
//        lines[0][4] = "Embarkment";
//
//        lines[1][0] = "Circle line";
//        lines[1][1] = "Aldgate";
//        lines[1][2] = "Baker Street";
//        lines[1][3] = "Cannon Street";
//        lines[1][4] = "Edgware Road";
//        lines[1][5] = "Embankment";
//        lines[1][6] = "Euston square";
//
//        lines[2][0] = "District line";
//        lines[2][1] = "Cannon Street";
//        lines[2][3] = "Edgware Road";
//
//        lines[3][0] = "Jubilee line";
//        lines[3][1] = "Baker Street";
//        lines[3][2] = "Bond Street";
//        lines[3][3] = "Green Park";
//
//        lines[4][0] = "Metropolitan Line";
//        lines[4][1] = "Aldgate";
//        lines[4][2] = "Baker Street";
//        lines[4][3] = "Euston Square";
//
//        lines[5][0] = "Northern Line";
//        lines[5][1] = "Angle";
//        lines[5][2] = "Bank";
//        lines[5][3] = "Emarkment";
//        Scanner x = new Scanner(System.in);
//        String b;
//        String c;
//
//        do {
//            System.out.println("Enter station name : ");
//            String str = x.nextLine();
//            String c = " ";
//            for (int i = 0; i < station.length(); i++) {
//               // if (str.equalsIgnoreCase(station[i])) {
//                   // c = station[i];
//                }
//
//            }
////            if (str.equalsIgnoreCase(c)) {
////                System.out.println(str + " station is in zone 1 ");
////                System.out.println("\n The lines passing through at " + str + " station are :");
////                for (int k = 0; k < lines.length; k++) {
////                    for (int j = 1; j < lines.length; j++) {
////                        String a = lines[k][j];
////                        if (str.equalsIgnoreCase(a)) {
////                            //System.out.println([k][0]);
////                        }
////
////                    }
//
//                }
//
//            } else {
//                System.out.println(str + " station is not in zone 1 ");
//            }
//
//            System.out.println("\n Do you want to try again then please press Y ");
//            b = x.nextLine().toLowerCase();
//
//        } while (b.equals("y"));
//
//
//    }
//}
