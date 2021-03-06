class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    public double rentalPrice() {
        double amount = 0;
        switch (getMovie().getPriceCode()) {
            case REGULAR:
                amount = 2 + Math.max(0, (getDaysRented() - 2) * 1.5);
                break;
            case NEW_RELEASE:
                amount = getDaysRented() * 3;
                break;
            case CHILDREN:
                amount = 1.5 + Math.max(0, (getDaysRented() - 3) * 1.5);
                break;
        }
        return amount;
    }
}