package entities;

public class Course extends Base{
    private String category;
    private String instructor;
    private String info;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Course(int id, String name, String category, String instructor) {
        super(id, name);
        this.category = category;
        this.instructor = instructor;
    }

    public Course() {
        this.category = category;
        this.instructor = instructor;
    }
}
