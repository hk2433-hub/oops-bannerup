
class TravelComputation {

    public static void main(String[] args) {
        String travelerName = "Eric";
       
        String startCity = "Chennai";
        String stopoverCity = "Vellore";
        String destinationCity = "Bangalore";
        double distanceStartToStopover = 156.6;
        double distanceStopoverToDestination = 211.8;
        int minutesInHour = 60; 
        int timeStartToStopover = (4 * minutesInHour) + 4;
        int timeStopoverToDestination = (4 * minutesInHour) + 25;
        double totalDistance = distanceStartToStopover + distanceStopoverToDestination;
        int totalTravelTimeMinutes = timeStartToStopover + timeStopoverToDestination;

        System.out.println("Travel Summary for " + travelerName + ":");
        System.out.println("Route: " + startCity + " -> " + stopoverCity + " -> " + destinationCity);
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Travel Time: " + totalTravelTimeMinutes + " minutes");
    }
}