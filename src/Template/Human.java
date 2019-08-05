package Template;

import Brigde.Abstract.HumanFields;

import javax.swing.*;


public class Human extends Player {


    public Human(String playerID) {
        super(playerID);
        this.playerSpace = new HumanFields("Your cards");
    }


    @Override
    protected boolean decision() {

        Object[] options = {"Yes", "No"};
        int n = JOptionPane.showOptionDialog(null,
                "Do you want to pick a card?",
                null,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        return n == 0;

    }

    @Override
    void drawCard() {
        playerSpace.drawCard(playerCards.get(playerCards.size()-1).toString());
    }


}
