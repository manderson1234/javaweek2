public class Movie {

    Integer movieRank;
    String title;
    String director;
    Integer rottenScore;

    public Movie(Integer movieRank, String title, String director, Integer rottenScore) {
        this.movieRank = movieRank;
        this.title = title;
        this.director = director;
        this.rottenScore = rottenScore;
    }

    public Integer getMovieRank() {
        return movieRank;
    }

    public void setMovieRank(Integer movieRank) {
        this.movieRank = movieRank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getRottenScore() {
        return rottenScore;
    }

    public void setRottenScore(Integer rottenScore) {
        this.rottenScore = rottenScore;
    }


    @Override
    public String toString() {
        return "Movie : Director= " + director + ", MovieRank= " + movieRank + ", RottenScore= " + rottenScore + ", Title= "
                + title + "]";
    }

    

    

    
    
}
