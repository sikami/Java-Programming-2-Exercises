/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author listya
 */
public class Flight {
    private Airplane airplane;
    private Place departurePort;
    private Place arrivalPort;

    public Flight(Airplane airplane, Place departurePort, Place arrivalPort) {
        this.airplane = airplane;
        this.departurePort = departurePort;
        this.arrivalPort = arrivalPort;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Place getDeparturePort() {
        return departurePort;
    }

    public Place getArrivalPort() {
        return arrivalPort;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departurePort + "-" + this.arrivalPort + ")";
              
    }
    
    
}
