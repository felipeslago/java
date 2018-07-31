package z.z29_DesignPatterns_TemplateMethod;

public class Sales {

    public int items;
    public double total;

    public Sales() {
        super();
    }

    public Sales(int items, double total) {
        super();
        this.items = items;
        this.total = total;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public void sumItems(int items) {
        this.items += items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void sumTotal(double total) {
        this.total += total;
    }

}
