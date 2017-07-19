import ability.Destat;
import ability.Draw;
import ability.Heal;
import card.*;
import main.Amount;
import main.ParserHelper;

public class DeckTest {

    public static void main(String[] args) {

        ParserHelper helper = new ParserHelper();

        // Print all the cards that have been parsed
        helper.parse();
//        helper.printAll();

        // Print Attacks of specific type
//        helper.printAttacksByType("dam");

        // Attack with Multiple Abilities are Hardest ones to implement
//        helper.printAttacksWithMultipleAbilities();

        // Getting a Specific Pokemon
        Pokemon p1 = helper.getPokemonByName("Doduo");
        System.out.println(p1);
        Trainer t1 = helper.getTrainerByName("Pokémon Center Lady");
        Heal a1 = (Heal) t1.getAbility().getLogic().get(0);
        Destat a2 = (Destat) t1.getAbility().getLogic().get(1);
        System.out.println(t1.getAbility().getLogic().get(0).getClass().getSimpleName());
        Amount amount = ((Heal)t1.getAbility().getLogic().get(0) ).getAmount();



        System.out.println(t1.getAbility().getName() + amount.getAmount() + " :" + a1.getTarget() );
        System.out.println(a2.getTarget() );
        helper.printAll();
//        Draw d1 = t1.getAbility().getLogic().get(0);
//        System.out.println(d1.getAmount());
    }

}
