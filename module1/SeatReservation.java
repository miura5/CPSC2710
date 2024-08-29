public class SeatReservation {
    private String flightDesignator;
    private java.time.LocalDate flightTime;
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
        if (fd.length() < 4 || fd.length() > 6) {
            throw new IllegalArgumentException("Flight designator length must be between 4 and 6 characters");
        } else {
            this.flightDesignator = fd;
        }
    }

    public java.time.LocalDate getFlightDate() {
        return flightTime;
    }

    public void setFlightDate(java.time.LocalDate date) {
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
        return String.format("SeatReservation{flightDesignator=%s,flightDate=%s,firstName=%s,lastName=%s}",
                flightDesignator,
                flightTime,
                firstName,
                lastName
        );
    }
}
