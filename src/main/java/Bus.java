import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity ) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }


    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addPassenger(Person person) {

        if (getPassengers() < getCapacity() ) {
            this.passengers.add(person);
        }
    }

    public int getPassengers() {
        return this.passengers.size();
    }


    public void removePassenger() {
        this.passengers.remove(0);
    }
}
