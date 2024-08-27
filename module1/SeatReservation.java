public class SeatReservation {
    private String flightDesignator;
    private java.time.LocalDateTime flightTime;
    private String firstName;
    private String lastName;

    public String getFlightDesignator() {
        return flightDesignator;
    }

    public void setFlightDesignator(String fd) {
        // this.flightDesignator = fd;
        if (fd == null){
            throw new IllegalArgumentException("flight designator cannot be null");
         }
         this.flightDesignator = fd;
    }

    public java.time.LocalDateTime getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(java.time.LocalDateTime date) {
        this.flightTime = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }

    @Override
    public String toString() {
        return String.format("SeatReservation{flightDesignator=%s,flightDate=%s, firstName=%s, lastName=%s}",
                flightDesignator,
                flightTime,
                firstName,
                lastName
        );
    }
}
