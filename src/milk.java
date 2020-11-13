public class milk extends decorator {
    beverge beverge;
    public milk(beverge beverge) {
        this.beverge = beverge;
    }
    public String getDescription() {
        return beverge.getDescription() + ", milk";
    }
    public double cost() {
        return .20 + beverge.cost();
    }
}
