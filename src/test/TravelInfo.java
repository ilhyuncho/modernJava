package test;


public class TravelInfo {

    public static final String COUNTRY_VIETNAM = "vietnam";
    public static final String COUNTRY_PHILLIPHINE = "philliphine";
    public static final String COUNTRY_TAILAND = "tailand";
    private String name;
    private String country;
    private String city;
    private int days;
    private int nights;

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(":").append("country").append(",").append(city)
                .append(", ").append(nights).append("박").append(days).append("일");
        return builder.toString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }



}
