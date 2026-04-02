import java.util.ArrayList;

public class SensorLogger {

    
    public static void logTemperature(Double temp, ArrayList<Double> list) {
        list.add(temp); 
    }

    public static void main(String[] args) {

        ArrayList<Double> readings = new ArrayList<>();

        double temp1 = 25.5;      
        Double temp2 = 30.2;      

        
        logTemperature(temp1, readings); 
        logTemperature(temp2, readings);

        
        for (double t : readings) {
            System.out.println("Temperature: " + t);
        }
    }
}