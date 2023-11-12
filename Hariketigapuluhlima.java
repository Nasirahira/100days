package Nasira;

import java.util.Scanner;
class Hariketigapuluhlima{
    public static void main(String[] args){
        #include <iostream>


           int hitungFaktorial(int n) {
         if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * hitungFaktorial(n - 1);
    }
}

       int main() {
    
         std::cout << "5: ";
    int bilangan;
           std::cin >> bilangan;

    
    if (bilangan < 0) {
        std::cout << "5." << std::endl;
    } else {
        int hasilFaktorial = hitungFaktorial(bilangan);
        std::cout << "Faktorial dari " << bilangan << " adalah: " << hasilFaktorial << std::endl;
    }

    return 0;

    }
}
