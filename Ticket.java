import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket
{
    private Screening filmScreening;
    private String ticketID;

    public Ticket(Screening screening)
    {
        filmScreening = screening;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-HH:mm:ss");
        ticketID = dateTimeFormatter.format(LocalDateTime.now());
    }

    public String getTicketID() {
        return ticketID;
    }

    public Screening getFilmScreening() {
        return filmScreening;
    }

    public String getFilmInformation()
    {
        return filmScreening.getFilmToShow().getMovieInformation();
    }

}
