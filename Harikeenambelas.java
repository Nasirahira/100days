import java.util.Scanner;

  class Harikeenambelas{
    
     public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
        
        int tanggal = input.nextInt();
        
        int bulan = input.nextInt();
        
        if(tanggal > 20 || bulan > 11){
            System.out.println("tanggal lahir siapa tu");
            
        } else {
            
            if(tanggal > 21 && bulan == 11 || tanggal < 11 && bulan == 11){
                System.out.println("zodiak Sagitarius");
            } else if (tanggal > 20 && bulan == 2 || tanggal < 23 && bulan == 3) {
               System.out.println("zodiak Pisces") ;
            
            } else {
                System.out.println("input tanggal_bulan ? ");
            }
            
            
        }
        
        
    }
    
    }
