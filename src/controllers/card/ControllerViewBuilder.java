package controllers.card;

import card.Card;
import card.Energy;
import card.Pokemon;
import card.Trainer;
import javafx.util.Pair;
import views.card.CardView;

public final class ControllerViewBuilder {

    private ControllerViewBuilder(){}

    public static Pair<CardController, CardView> buildControllerView(Card card){

        CardController controller = null;
//        if (card.getClass()== Pokemon.class) {
        if (card.getClass().getSimpleName().equals("Pokemon") ) {
            controller = new PokemonController((Pokemon) card);
        }else if (card.getClass().getSimpleName().equals("Energy")){
            controller = new EnergyController((Energy)card);
        }else if (card.getClass().getSimpleName().equals("Trainer")){
            controller = new TrainerController((Trainer)card);
        }
        assert controller != null;
        return new Pair<>(controller, controller.getView());

    }

}
