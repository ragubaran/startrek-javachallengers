package codeone.challengers;
//Planet JDK 10 – Var Turnabout intruder
public class TurnaboutIntruder {
    public static void main(String... awayTeam){
        System.out.println(new TurnaboutIntruder().whoIsKirk());
    }
    private boolean whoIsKirk() {
        Var var = new Var();
        var cmdSpock = new Var(){};
        var cptKirk = new Var(){boolean isVar(){return true;}};
        var drLester = (Var) null;
        drLester = cptKirk;

        return cptKirk.isVar();
    }
    private static class Var {}
}
