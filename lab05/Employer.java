package lab05;

public class Employer {

    private String name;
    private String email;
    private Integer hourRate;
    private Integer capacity;
    private Integer freeDays;
    private Integer calcutateDailyIncome() {
        return hourRate*capacity;
    }
    public void calculateMonthlyIncome() {
        System.out.println((21-freeDays)*calcutateDailyIncome());

    };

   /* public Employer(String name, String email, Integer hourRate, Integer capacity,Integer freeDays){
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getHourRate() {
        return hourRate;
    }

    public void setHourRate(Integer hourRate) {
        this.hourRate = hourRate;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getFreeDays() {
        return freeDays;
    }

    public void setFreeDays(Integer freeDays) {
        this.freeDays = freeDays;
    }
}
