package controllers.game.KeyListeners;

import ability.Dam;
import ability.Draw;
import ability.Heal;
import card.Card;
import card.Pokemon;
import card.Trainer;
import controllers.card.CardController;
import controllers.card.PokemonController;
import controllers.game.GameController;
import javafx.util.Pair;
import main.Amount;
import views.activepokemon.ActivePokemonView;
import views.card.CardView;
import views.card.PokemonView;
import views.card.TrainerView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by zc on 2017/7/14.
 */
public class UseTrainerCard implements KeyListener {
    private GameController controller;

    public UseTrainerCard(GameController gameController) {
        this.controller = gameController;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ENTER: {

                TrainerView chosenCard = (TrainerView) SwingUtilities.getAncestorOfClass(TrainerView.class, (Component) e.getSource());

                Card trainCard = controller.findCardInContainer(chosenCard, controller.getHumanController().getHandController()).getCard();
                Pair<CardController, CardView> pair = controller.getHumanController().getHandController().removeCard(trainCard);
                controller.getHumanController().getDiscardPileController().addCard((Trainer) pair.getKey().getCard());

                Trainer tc = (Trainer) trainCard;
                String type = tc.getAbility().getLogic().get(0).getClass().getSimpleName();

                switch (type) {
                    case ("Draw"): {
                        Amount amount = ((Draw) tc.getAbility().getLogic().get(0)).getAmount();
                        int number = amount.getAmount();
                        for (int i = 0; i < number; i++) {
                            controller.getHumanController().dealDeckHand();
                        }
                        controller.getHumanController().getHandController().returnAllCards();
                        break;
                    }
                    case ("Heal"): {
                        Amount amount = ((Heal) tc.getAbility().getLogic().get(0)).getAmount();
                        controller.getView().setCommand("Select Pokemon and press Enter.\n(Press Esc to exit)");

                        KeyListener pokemonListener = new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {
                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                switch (e.getKeyCode()) {
                                    case KeyEvent.VK_ENTER: {

                                        PokemonView chosenCard = (PokemonView) SwingUtilities.getAncestorOfClass(PokemonView.class, (Component) e.getSource());
                                        PokemonController chosenController;

                                        if (SwingUtilities.getAncestorOfClass(ActivePokemonView.class, (Component) e.getSource()) != null) {
                                            chosenController = controller.getHumanController().
                                                    getActivePokemonController().getPokemonController();
                                        } else {
                                            chosenController = (PokemonController) controller.findCardInContainer(
                                                    chosenCard, controller.getHumanController().getBenchController());
                                        }

                                        chosenController.heal(amount.getAmount());
                                        break;
                                    }

                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                            }
                        };

                        KeyListener exitBoard = new KeyListener() {
                            @Override
                            public void keyTyped(KeyEvent e) {

                            }

                            @Override
                            public void keyPressed(KeyEvent e) {
                                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                                    controller.getHumanController().getBenchController().removeAllListeners(pokemonListener);
                                    controller.getHumanController().getActivePokemonController().removeKeyListener(pokemonListener);

                                    controller.getView().addBoardListerner(new MainMenuListener(controller));
                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {

                            }
                        };

                        controller.getView().addBoardListerner(exitBoard);
                        controller.getHumanController().getBenchController().setPokemonListener(pokemonListener);
                        controller.getHumanController().getActivePokemonController().setKeyListener(pokemonListener);

                        break;
                    }//heal


                    default:
                        break;
                }//switch

                // Remove all key listeners of this type and go back to menu
                controller.getHumanController().getActivePokemonController().removeKeyListener(this);
                controller.getHumanController().getBenchController().removeAllListeners(this);
                controller.getHumanController().getHandController().removeAllListeners(this);
                controller.getView().addBoardListerner(new MainMenuListener(controller));

                break;
            }//key


            default: {
                System.out.println("Enter the correct Key.(from UseTrainerCard)");
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
