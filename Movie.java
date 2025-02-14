public class Movie
{
    private String movieTitle, releaseDate, movieDirector, leadActor;
    private String dateOfLastScreening;
    private int movieDuration;
    private boolean blockbuster; //true = movie is a blockbuster, false means indie film
    private boolean threeD;

    public Movie(String mTitle, String releaseDate, String movieDirector, String leadActor, String dateOfLastScreening,
                 int movieDuration, boolean isBlockbuster, boolean is3D)
    {
        movieTitle = mTitle;
        this.releaseDate = releaseDate;
        this.movieDirector = movieDirector;
        this.leadActor = leadActor;
        this.dateOfLastScreening = dateOfLastScreening;
        this.movieDuration = movieDuration;
        this.blockbuster = isBlockbuster;
        this.threeD = is3D;
    }

    public String getMovieTitle()
    {
        return movieTitle;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public String getDateOfLastScreening() {
        return dateOfLastScreening;
    }

    public void setDateOfLastScreening(String newEndDate)
    {
        dateOfLastScreening = newEndDate;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public boolean isBlockbuster() {
        return blockbuster;
    }

    public boolean isThreeD() {
        return threeD;
    }

    public String formatDuration()
    {

        int numHours = movieDuration / 60;
        int numMinutes = movieDuration % 60;
        String formattedDuration = numHours + " hours and ";
        formattedDuration += numMinutes + " minutes";

        return formattedDuration;
    }

    public String getMovieInformation()
    {
        String movieInformation = movieTitle + "; ";
        movieInformation += movieDirector + "; ";
        movieInformation += leadActor  + "; ";
        movieInformation += releaseDate  + "; ";
        movieInformation += dateOfLastScreening  + "; ";
        movieInformation += formatDuration();

        return movieInformation;
    }
}
