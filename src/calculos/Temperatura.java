package calculos;

public class Temperatura {
            
    public double celciusKelvin(double cel){
 
     return cel+273.15;
       
    }
        
    public double celciusFahrenheit(double cel){
      
     return  (9*cel/5)+32;
       
    }
    
    public double fahrenheitKelvin(double fah){

     return (5*(fah-32))/9+273.15;
      
    }
    
    public double fahrenheitCelcius(double fah){

     return (5*(fah-32))/9;
       
    }
    
    public double kelvinCelcius(double kel){

     return kel-273.15;
       
    }
    
    public double kelvinFahrenheit(double kel){

     return (9*(kel-273.15))/5+32;
       
    }
    
}
