package src;
import javax.swing.*;
import java.awt.*;

public class GUI {

  public void createWindow() {
    JFrame mainWindow = new JFrame("Claim App");
    mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// ── create panels──────────────────────────────────────────────────
    JPanel basePanel = create22CardFactions(); 
    JPanel extraPanel = create10CardFactions();
    JPanel factionsPanel = new JPanel();
    JPanel btnWrapper = new JPanel();
    btnWrapper.setLayout(new FlowLayout(FlowLayout.CENTER));
    JButton startBtn = new JButton("Ready!");
    btnWrapper.add(startBtn);

    factionsPanel.setLayout(new BoxLayout(factionsPanel, BoxLayout.Y_AXIS));

    factionsPanel.add(basePanel);
    factionsPanel.add(new JSeparator(SwingConstants.HORIZONTAL));
    factionsPanel.add(extraPanel);
    factionsPanel.add(btnWrapper);
// ── Add the panels to the mainframe ─────────────────────────────────
    mainWindow.add(factionsPanel);

    mainWindow.pack();
    mainWindow.setVisible(true);
  }  

  public JPanel create22CardFactions() {
    JPanel basePanel = new JPanel();
    JLabel header = new JLabel("Choose the 22-card combo:", SwingConstants.CENTER);
    basePanel.setLayout(new BorderLayout());
    JPanel check = new JPanel();
    
// ── Creation of the Checkbox for base cards ─────────────────────────
    JCheckBox goblinAndKnight = new JCheckBox("Goblin & Knights (C1)", true);
    JCheckBox giantsAndGnomes = new JCheckBox("Giants & Gnomes (C2)", false);
    JCheckBox peasantsAndRoyals = new JCheckBox("Peasants & Royals (CA)", false);
    ButtonGroup bc = new ButtonGroup();

// ── Adds the checkbuttons to the panel ──────────────────────────────
    basePanel.add(header, BorderLayout.PAGE_START);
    bc.add(goblinAndKnight); 
    bc.add(giantsAndGnomes);
    bc.add(peasantsAndRoyals);

    check.add(goblinAndKnight); 
    check.add(giantsAndGnomes);
    check.add(peasantsAndRoyals);

    basePanel.add(check, BorderLayout.CENTER);
    return basePanel;
  }

  public JPanel create10CardFactions() {
    JPanel basePanel = new JPanel();
    JPanel factions = new JPanel();
    JLabel header = new JLabel("Choose 3 of the 10-card factions:", SwingConstants.CENTER);
    basePanel.setLayout(new BorderLayout());
    factions.setLayout(new GridLayout(0,2));

    JCheckBox basilisk = new JCheckBox("Basilisk (CR: Map)", false);
    factions.add(basilisk);
    JCheckBox cyclops = new JCheckBox("Cyclops (CR: Map)", false);
    factions.add(cyclops);
    JCheckBox darkElves = new JCheckBox("Dark Elves (P)", false);
    factions.add(darkElves);
    JCheckBox doppelgangers = new JCheckBox("Doppeltgänger (C1)", false);
    factions.add(doppelgangers);
    JCheckBox dragons = new JCheckBox("Dragons (C2)", false);
    factions.add(dragons);
    JCheckBox druids = new JCheckBox("Druids (CR: Mag)", false);
    factions.add(druids);
    JCheckBox dwarves = new JCheckBox("Dwarves (C1)", false);
    factions.add(dwarves);
    JCheckBox elves = new JCheckBox("Elves (CR: Mer)", false);
    factions.add(elves);
    JCheckBox elvesAndOrcs = new JCheckBox("Elves & Orcs (CR: Mer)", false);
    factions.add(elvesAndOrcs);
    JCheckBox ghosts = new JCheckBox("Ghosts (P)", false);
    factions.add(ghosts);
    JCheckBox orcs = new JCheckBox("Orcs (CR: Mer)", false);
    factions.add(orcs);
    JCheckBox phoenixes = new JCheckBox("Phoenixes (CR: Map)", false);
    factions.add(phoenixes);
    JCheckBox seers = new JCheckBox("Seers (C2)", false);
    factions.add(seers);
    JCheckBox shapeshifters = new JCheckBox("Shapeshifters (CR: Mag)", false);
    factions.add(shapeshifters);
    JCheckBox trolls = new JCheckBox("Trolls (C2)", false);
    factions.add(trolls);
    JCheckBox undead = new JCheckBox("Undead (C1)", false);
    factions.add(undead);
    JCheckBox unicorns = new JCheckBox("Unicorns (CR: Map)", false);
    factions.add(unicorns);
    JCheckBox wizards = new JCheckBox("Wizards (CR: Mag)", false);
    factions.add(wizards);
    JCheckBox bards = new JCheckBox("Bards (CA)", false);
    factions.add(bards);
    JCheckBox griffons = new JCheckBox("Griffons (CA)", false);
    factions.add(griffons);
    JCheckBox racoons = new JCheckBox("Racoons (CA)", false);
    factions.add(racoons);
    JCheckBox vikings = new JCheckBox("Vikings (CA)", false);
    factions.add(vikings);

    basePanel.add(header, BorderLayout.PAGE_START);
    basePanel.add(factions, BorderLayout.CENTER);
    return basePanel;
  }
}
