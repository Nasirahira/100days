import java.util.Scanner;

 class Zodiak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" 11 : ");
        
        int tanggal = input.nextInt();
        input.nextLine();
        System.out.print(" 12 : ");
        
        String bulan = input.nextLine().toLowerCase();
        String[] zodiak ={
            "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"};
        System.out.println("Zodiak Anda adalah " + zodiak[(tanggal - 1) / 3 + (bulan.equals("march") ? 0 : 1) % 12] + ".");
    }

    }
