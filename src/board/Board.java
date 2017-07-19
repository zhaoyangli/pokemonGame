package board;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by edwinyachoui on 2017-05-23.
 */
public class Board {
    private JPanel mainPanel;
    private JPanel opponentPanel;
    private JPanel opponentSidePanel;
    private JPanel opponentCards;
    private JPanel MiddleLeftPanel;
    private JPanel MiddleRightPanel;
    private JPanel opponentBenchCards;
    private JPanel opponentHandCards;
    private JPanel opponentMainPanel;
    private JPanel playerPanel;
    private JPanel playerSidePanel;
    private JPanel playerCards;
    private JPanel playerMainPanel;
    private JPanel playerBenchCards;
    private JPanel playerHandCards;
    private JPanel playerDeckPanel;
    private JPanel playerDiscardPanel;
    private JPanel opponentDiscardPanel;
    private JPanel opponentDeckPanel;
    private JPanel middlePanel;
    private JPanel PokeBallPanel;
    private JLabel PokeBallIcon;
    private JPanel opponentCoinPanel;
    private JPanel playerActivePanel;
    private JPanel playerCoinPanel;
    private JPanel opponentActivePanel;
    private JPanel prizePanel;
    private JPanel opponentPrizePanel;
    private JPanel playerPrizePanel;
    private JPanel commandPanel;
    private JPanel playerPokDescPanel;
    private JPanel oppPokDescPanel;
    private JTextArea cmdTextArea;
    private JPanel middle;

    public Board() {
        $$$setupUI$$$();
    }

    public JPanel getMiddleLeftPanel() {
        return MiddleLeftPanel;
    }

    public JPanel getMiddleRightPanel() {
        return MiddleRightPanel;
    }

    public JPanel getOpponentBenchCards() {
        return opponentBenchCards;
    }

    public JPanel getOpponentHandCards() {
        return opponentHandCards;
    }

    public JPanel getPlayerBenchCards() {
        return playerBenchCards;
    }

    public JPanel getPlayerHandCards() {
        return playerHandCards;
    }

    public JPanel getPlayerDeckPanel() {
        return playerDeckPanel;
    }

    public JPanel getPlayerDiscardPanel() {
        return playerDiscardPanel;
    }

    public JPanel getOpponentDiscardPanel() {
        return opponentDiscardPanel;
    }

    public JPanel getOpponentCoinPanel() {
        return opponentCoinPanel;
    }

    public JPanel getPlayerActivePanel() {
        return playerActivePanel;
    }

    public JPanel getPlayerCoinPanel() {
        return playerCoinPanel;
    }

    public JPanel getOpponentActivePanel() {
        return opponentActivePanel;
    }

    public JPanel getOpponentDeckPanel() {
        return opponentDeckPanel;
    }

    public JPanel getPlayerPokDescPanel() {
        return playerPokDescPanel;
    }

    public JPanel getOppPokDescPanel() {
        return oppPokDescPanel;
    }

    public JPanel getOpponentPrizePanel() {
        return opponentPrizePanel;
    }

    public JPanel getPlayerPrizePanel() {
        return playerPrizePanel;
    }

    public JTextArea getCmdTextArea() {
        return cmdTextArea;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(0, 0));
        mainPanel.setAutoscrolls(true);
        mainPanel.setBackground(new Color(-10313816));
        mainPanel.setDoubleBuffered(true);
        mainPanel.setMaximumSize(new Dimension(2000, 2000));
        mainPanel.setMinimumSize(new Dimension(500, 500));
        mainPanel.setPreferredSize(new Dimension(1500, 750));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 9, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-13206289));
        mainPanel.add(panel1, BorderLayout.CENTER);
        opponentPanel = new JPanel();
        opponentPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        opponentPanel.setBackground(new Color(-10313816));
        panel1.add(opponentPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 9, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        opponentSidePanel = new JPanel();
        opponentSidePanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(10, 0, 0, 0), -1, -1));
        opponentSidePanel.setBackground(new Color(-8097433));
        opponentSidePanel.setFocusable(false);
        opponentSidePanel.setOpaque(false);
        opponentSidePanel.setRequestFocusEnabled(false);
        opponentPanel.add(opponentSidePanel, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        opponentDeckPanel = new JPanel();
        opponentDeckPanel.setLayout(new BorderLayout(0, 0));
        opponentDeckPanel.setAlignmentX(0.0f);
        opponentDeckPanel.setAlignmentY(0.0f);
        opponentDeckPanel.setAutoscrolls(false);
        opponentDeckPanel.setBackground(new Color(-8097433));
        opponentDeckPanel.setDoubleBuffered(true);
        opponentDeckPanel.setMinimumSize(new Dimension(90, 120));
        opponentDeckPanel.setOpaque(false);
        opponentDeckPanel.setPreferredSize(new Dimension(90, 120));
        opponentSidePanel.add(opponentDeckPanel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        opponentDiscardPanel = new JPanel();
        opponentDiscardPanel.setLayout(new BorderLayout(0, 0));
        opponentDiscardPanel.setAlignmentX(0.0f);
        opponentDiscardPanel.setAlignmentY(0.0f);
        opponentDiscardPanel.setAutoscrolls(false);
        opponentDiscardPanel.setBackground(new Color(-8097433));
        opponentDiscardPanel.setDoubleBuffered(true);
        opponentDiscardPanel.setMinimumSize(new Dimension(90, 120));
        opponentDiscardPanel.setOpaque(false);
        opponentDiscardPanel.setPreferredSize(new Dimension(90, 120));
        opponentSidePanel.add(opponentDiscardPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        opponentCards = new JPanel();
        opponentCards.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 20), -1, -1));
        opponentCards.setBackground(new Color(-10313816));
        opponentPanel.add(opponentCards, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(900, -1), null, null, 0, false));
        opponentMainPanel = new JPanel();
        opponentMainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        opponentMainPanel.setBackground(new Color(-10313816));
        opponentCards.add(opponentMainPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(800, -1), null, null, 0, false));
        opponentBenchCards = new JPanel();
        opponentBenchCards.setLayout(new BorderLayout(0, 0));
        opponentBenchCards.setBackground(new Color(-14596437));
        opponentMainPanel.add(opponentBenchCards, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        opponentHandCards = new JPanel();
        opponentHandCards.setLayout(new BorderLayout(0, 0));
        opponentHandCards.setBackground(new Color(-11808122));
        opponentMainPanel.add(opponentHandCards, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        oppPokDescPanel = new JPanel();
        oppPokDescPanel.setLayout(new BorderLayout(0, 0));
        oppPokDescPanel.setBackground(new Color(-10313816));
        opponentPanel.add(oppPokDescPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(175, -1), new Dimension(175, -1), new Dimension(175, -1), 0, true));
        playerPanel = new JPanel();
        playerPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        playerPanel.setBackground(new Color(-10313816));
        panel1.add(playerPanel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 9, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        playerSidePanel = new JPanel();
        playerSidePanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        playerSidePanel.setBackground(new Color(-8097433));
        playerSidePanel.setFocusable(false);
        playerSidePanel.setOpaque(false);
        playerSidePanel.setRequestFocusEnabled(false);
        playerPanel.add(playerSidePanel, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        playerDeckPanel = new JPanel();
        playerDeckPanel.setLayout(new CardLayout(0, 0));
        playerDeckPanel.setAlignmentX(0.0f);
        playerDeckPanel.setAlignmentY(0.0f);
        playerDeckPanel.setAutoscrolls(false);
        playerDeckPanel.setBackground(new Color(-8097433));
        playerDeckPanel.setDoubleBuffered(true);
        playerDeckPanel.setMinimumSize(new Dimension(90, 120));
        playerDeckPanel.setOpaque(false);
        playerDeckPanel.setPreferredSize(new Dimension(90, 120));
        playerSidePanel.add(playerDeckPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        playerDiscardPanel = new JPanel();
        playerDiscardPanel.setLayout(new CardLayout(0, 0));
        playerDiscardPanel.setAlignmentX(0.0f);
        playerDiscardPanel.setAlignmentY(0.0f);
        playerDiscardPanel.setAutoscrolls(false);
        playerDiscardPanel.setBackground(new Color(-8097433));
        playerDiscardPanel.setDoubleBuffered(true);
        playerDiscardPanel.setMinimumSize(new Dimension(90, 120));
        playerDiscardPanel.setOpaque(false);
        playerDiscardPanel.setPreferredSize(new Dimension(90, 120));
        playerSidePanel.add(playerDiscardPanel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        playerCards = new JPanel();
        playerCards.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 20), -1, -1));
        playerCards.setBackground(new Color(-10313816));
        playerPanel.add(playerCards, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(900, -1), null, null, 0, false));
        playerMainPanel = new JPanel();
        playerMainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        playerMainPanel.setBackground(new Color(-10313816));
        playerCards.add(playerMainPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        playerHandCards = new JPanel();
        playerHandCards.setLayout(new CardLayout(0, 0));
        playerHandCards.setBackground(new Color(-11808122));
        playerHandCards.setName("pnlPlayerHand");
        playerMainPanel.add(playerHandCards, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        playerBenchCards = new JPanel();
        playerBenchCards.setLayout(new BorderLayout(0, 0));
        playerBenchCards.setBackground(new Color(-14596437));
        playerBenchCards.setName("pnlPlayerBench");
        playerMainPanel.add(playerBenchCards, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        playerPokDescPanel = new JPanel();
        playerPokDescPanel.setLayout(new BorderLayout(0, 0));
        playerPokDescPanel.setBackground(new Color(-10313816));
        playerPanel.add(playerPokDescPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(175, -1), new Dimension(175, -1), new Dimension(175, -1), 0, true));
        middle = new JPanel();
        middle.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        middle.setBackground(new Color(-13206289));
        panel1.add(middle, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, new Dimension(-1, 200), 0, false));
        middlePanel = new JPanel();
        middlePanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        middlePanel.setBackground(new Color(-13206289));
        middlePanel.setFocusable(true);
        middle.add(middlePanel, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(600, 200), new Dimension(600, 200), new Dimension(600, 200), 0, true));
        PokeBallPanel = new JPanel();
        PokeBallPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        PokeBallPanel.setBackground(new Color(-13206289));
        middlePanel.add(PokeBallPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        PokeBallIcon = new JLabel();
        PokeBallIcon.setBackground(new Color(-13206289));
        PokeBallIcon.setIcon(new ImageIcon(getClass().getResource("/images/pokeball.png")));
        PokeBallIcon.setText("");
        PokeBallPanel.add(PokeBallIcon, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        MiddleLeftPanel = new JPanel();
        MiddleLeftPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 1, new Insets(0, 0, 0, 20), -1, -1));
        MiddleLeftPanel.setBackground(new Color(-13206289));
        middlePanel.add(MiddleLeftPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        MiddleLeftPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        opponentCoinPanel = new JPanel();
        opponentCoinPanel.setLayout(new BorderLayout(0, 0));
        opponentCoinPanel.setBackground(new Color(-13206289));
        opponentCoinPanel.setForeground(new Color(-13206289));
        MiddleLeftPanel.add(opponentCoinPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 70), null, new Dimension(-1, 70), 0, false));
        opponentCoinPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-4521918)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font(opponentCoinPanel.getFont().getName(), opponentCoinPanel.getFont().getStyle(), opponentCoinPanel.getFont().getSize())));
        playerActivePanel = new JPanel();
        playerActivePanel.setLayout(new BorderLayout(0, 0));
        playerActivePanel.setBackground(new Color(-13206289));
        playerActivePanel.setName("pnlPlayerActive");
        MiddleLeftPanel.add(playerActivePanel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 1, false));
        playerActivePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-13452397)), null));
        MiddleRightPanel = new JPanel();
        MiddleRightPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 1, new Insets(0, 20, 0, 0), -1, -1));
        MiddleRightPanel.setBackground(new Color(-13206289));
        middlePanel.add(MiddleRightPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        MiddleRightPanel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        playerCoinPanel = new JPanel();
        playerCoinPanel.setLayout(new BorderLayout(0, 0));
        playerCoinPanel.setBackground(new Color(-13206289));
        MiddleRightPanel.add(playerCoinPanel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 70), null, new Dimension(-1, 70), 0, false));
        playerCoinPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-13452397)), null));
        opponentActivePanel = new JPanel();
        opponentActivePanel.setLayout(new BorderLayout(0, 0));
        opponentActivePanel.setBackground(new Color(-13206289));
        opponentActivePanel.setName("pnlOppActive");
        MiddleRightPanel.add(opponentActivePanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        opponentActivePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-4521918)), null));
        commandPanel = new JPanel();
        commandPanel.setLayout(new CardLayout(0, 0));
        commandPanel.setAlignmentX(0.5f);
        commandPanel.setAutoscrolls(false);
        commandPanel.setBackground(new Color(-13206289));
        commandPanel.setName("commandPanel");
        middle.add(commandPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(250, -1), new Dimension(250, -1), new Dimension(250, -1), 0, false));
        commandPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-4473925)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-4473925)));
        cmdTextArea = new JTextArea();
        cmdTextArea.setBackground(new Color(-13206289));
        cmdTextArea.setEditable(false);
        cmdTextArea.setForeground(new Color(-1));
        cmdTextArea.setLineWrap(true);
        cmdTextArea.setMargin(new Insets(0, 0, 0, 0));
        cmdTextArea.setName("txtCommand");
        cmdTextArea.setTabSize(8);
        cmdTextArea.setText("");
        commandPanel.add(cmdTextArea, "Card1");
        prizePanel = new JPanel();
        prizePanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 50, 0, 0), -1, -1));
        prizePanel.setBackground(new Color(-13206289));
        middle.add(prizePanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(300, -1), new Dimension(300, -1), new Dimension(300, -1), 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-13272084));
        prizePanel.add(panel2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        opponentPrizePanel = new JPanel();
        opponentPrizePanel.setLayout(new BorderLayout(0, 0));
        opponentPrizePanel.setBackground(new Color(-13206289));
        panel2.add(opponentPrizePanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
        panel2.add(spacer3, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel3.setBackground(new Color(-13272084));
        prizePanel.add(panel3, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, -1), new Dimension(200, -1), 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer4 = new com.intellij.uiDesigner.core.Spacer();
        panel3.add(spacer4, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        playerPrizePanel = new JPanel();
        playerPrizePanel.setLayout(new BorderLayout(0, 0));
        playerPrizePanel.setBackground(new Color(-13206289));
        panel3.add(playerPrizePanel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(-1, 150), new Dimension(-1, 150), 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
