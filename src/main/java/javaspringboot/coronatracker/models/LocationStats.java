package javaspringboot.coronatracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int numOfCases;
    private int deltaYday;

    public int getDeltaYday() {
        return deltaYday;
    }

    public void setDeltaYday(int deltaYday) {
        this.deltaYday = deltaYday;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getNumOfCases() {
        return numOfCases;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setNumOfCases(int number) {
        this.numOfCases = number;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", numOfCases=" + numOfCases +
                '}';
    }

}
