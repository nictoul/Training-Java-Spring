package training.java.REST;

public class RevenueDto {
    private String month;

    private String Revenue;

    public RevenueDto(String month, String revenue) {
        this.month = month;
        Revenue = revenue;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getRevenue() {
        return Revenue;
    }

    public void setRevenue(String revenue) {
        Revenue = revenue;
    }
}
