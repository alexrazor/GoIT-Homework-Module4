/**
 * Created by a.lyahovich on 01.06.2016.
 */
public class CelciusToFahrengeit {

    public double getCelciusToFahrengeit (double celciusTemp){
        return (1.8 *celciusTemp) + 32.0;
    }

    public double getFahrengeitToCelcius (double fahrengeitTemp){
        return (fahrengeitTemp - 32.0)/1.8;
    }
}
