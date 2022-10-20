package movies;

public class Movie {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    private String categories;

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    // constructor

    public Movie(String name,String category ){
        this.name=name;
        this.categories = category;
    }


}// end of class

