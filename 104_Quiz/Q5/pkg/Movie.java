package pkg;

public class Movie{
    String Name;
    Double Rating;
    int NumOfRatings;
    int revenue;
    
 
    
    public Movie(){
    Name = "Avengers";
    Rating = 8.0;
    NumOfRatings = 33;
    revenue = 623357910;
    }
    
    public Movie(String Name, Double Rating, int NumOfRatings, int revenue){
        this.Name = Name;
        this.Rating = Rating;
        this.NumOfRatings = NumOfRatings;
        this.revenue = revenue;
    }
    
    
    public void movieToString(){
        System.out.println("Movie: " + Name);
        System.out.println("Rating: " + Rating);
        System.out.println("Number Of Ratings: " + NumOfRatings);
        System.out.println("Revenue: " + revenue);
    }

    
    public void setMovieName(String Movie){
        this.Movie = Movie;
    }
    
    public void setMovieRevenue(int revenue){
        this.revenue = revenue;
    }
    
    public String getMovieName(){
        return Movie;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
  
    
    public double addRating(double add){
        Rating = Rating * NumOfRatings;
        Rating = add + Rating;
        NumOfRatings = NumOfRatings + 1;
        Rating = Rating/(NumOfRatings);
        return Rating;
    }

}
