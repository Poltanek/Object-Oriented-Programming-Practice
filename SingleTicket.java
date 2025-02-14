public class SingleTicket extends Ticket {
    private Seat getAllocatedSeat;
    private boolean IsChildTicket;

    public SingleTicket (Screening screening, Seat allocated, boolean cbild) {
        super (screening);
        allocatedSeat = allocated;
        allocatedSeat.setAllocated(true);
        childTicket = cbild;
    }

    public String getAllocatedSeat() {
        return allocatedSeat.getSeatNumber();
    }

    public boolean isChildTicket () {
        return childTicket;
    };


}

