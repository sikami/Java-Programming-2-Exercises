/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author listya
 */
public class TextUI {
    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }
    
    public void start() {
        //start asset control
        //start flight control
        
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }
    
    public void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            
            System.out.print("> ");
            String command = scanner.nextLine();
            System.out.println();
            if (command.equals("x")) {
                break;
            }
            
            switch(command) {
                case "1":
                    addAirplane();
                    break;
                case "2":
                    addFlight();
                    break;
            }
        }
    }
    
    private void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println();
        System.out.print("Give the airplane capacity: ");
        System.out.println();
        int capacity = Integer.valueOf(scanner.nextLine());
        this.flightControl.addAirplane(id, capacity);
    }
    
    private void addFlight() {
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane();
        System.out.println();
        System.out.print("Give the departure airport id: ");
        String departureId = scanner.nextLine();
        System.out.println();
        System.out.print("Give the target airport id: ");
        String arrivalId = scanner.nextLine();
        
        this.flightControl.addFlight(airplane, departureId, arrivalId);
    }
    
    private void startFlightControl() {
        System.out.println("Flight Control");
         System.out.println("--------------------");
        System.out.println();
        
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String command = scanner.nextLine();
            System.out.println();

            if (command.equals("x")) {
                    break;
                }

            switch(command) {
                case "1":
                    printAirplanes();
                    break;
                case "2":
                    printFlights();
                    break;
                case "3":
                    printAirplanesDetails();
                    break;

            }
        }
    }
    
    private void printAirplanes() {
        for (Airplane planes : this.flightControl.getAirplanes()) {
            System.out.println(planes);
        }
    }
    
    private void printFlights() {
        for (Flight flight : this.flightControl.getFlights()) {
            System.out.println(flight);
        }
    }
    
    private void printAirplanesDetails() {
        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane();
        System.out.println(plane);
        System.out.println();
    }
    
    private Airplane askForAirplane() {
        Airplane airplane = null;
        while(airplane == null) {
            String id = scanner.nextLine();
            airplane = this.flightControl.getAirplane(id);
            
            if (airplane == null) {
                System.out.println("No airplane with the id " + id);
            }
        }
        return airplane;
    }
}
