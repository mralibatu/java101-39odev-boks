public class Boks {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Biz",40,120,130,30);
        Fighter f2 = new Fighter("Sorunlar", 10,90,80,15);

        Match match = new Match(f1,f2,50,1000);
        match.run();
    }
}
