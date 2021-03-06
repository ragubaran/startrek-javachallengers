package codeone.challengers;
//Planet JDK 11 – Var the Sequel
public class WrathOfLambdaVar {
    public static void main(String... cetiAlphaSystem){
        System.out.println(new WrathOfLambdaVar().localPlanets());
    }

    private String localPlanets(){
        ISpaceSeed whereIsKhan = (String cetiAlphaV, String cetiAlphaVI) -> cetiAlphaV + cetiAlphaVI;
        ISpaceSeed whenWorldsCollide  = (s1, s2) -> s1 + s2;
        ISpaceSeed reliantsMistake = (var s1, final var s2) -> s1 + s2;
        return reliantsMistake.collide("Ceti Alpha 6", null);
    }
    @FunctionalInterface
    interface ISpaceSeed {
        String collide(String s1, String s2);
    }
}
