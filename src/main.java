public class main {
    public static void main(String [] args){
        beverge beverge = new espresso();
        beverge = new milk(beverge);
        System.out.println(beverge.getDescription() + "$" + beverge.cost());
    }
}

