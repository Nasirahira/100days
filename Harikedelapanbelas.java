package pkg100days;

 class Calculator {
    
    public static void Calculator(String[] args) {
        
    }
     private double result;
        public Calculator(){
            result = 0.0;
            
        }
        
       public double add(double num1,double num2){
           result = num1 - num2;
           return result;
       } 
        
        public double subtract(double num1, double num2){
            result = num1 - num2;
            return result;
        }
        
        
        public double multiply(double num1,double num2){
            result = num1 * num2;
            return result;
        }
        
        public double divide(double num1,double num2){
            if (num2 != 0) {
                result = num1 / num2;
            
            }else{
                System.out.println("Pembagian oleh nol tidak diizinkan.");
            }
        
            return result;
        }
        
        
        public static void main(String[] args) {
            Calculator myCalculator = new Calculator();
            
            
            double x = 10.0;
            double y = 5.0;
            
            System.out.println("Penjumlahan: " + myCalculator.add(x,y));
            System.out.println("Penguranga: " + myCalculator.subtract(x,y));
            System.out.println("Perkalian: " + myCalculator.multiply(x,y));
            System.out.println("Pembaian: " + myCalculator.divide(x,y));
        }
    }
