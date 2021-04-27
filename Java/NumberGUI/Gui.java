import java.util.*;

public class Gui extends JPanel implements ActionListener {
    ArrayList<Number> num = new ArrayList<Number>();
    JLabel welcomeLabel;
    JLabel factorLabel;
    JLabel primeLabel;
    int counter = 0;

    public Gui() {
        setUpNumbers();
        setLayout(new BorderLayout());
        JPanel nPanel = new JPanel();
        welcomeLabel = new JLabel("" + num.get(counter));
        nPanel.add(welcomeLabel);
        add(nPanel, BorderLayout.NORTH);
        JPanel sPanel = new JPanel();
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        sPanel.add(exitButton);
        JButton nextButton = new JButton("Next Number");
        nextButton.addActionListener(this);
        sPanel.add(nextButton);
        JButton prevButton = new JButton("Previous Number");
        prevButton.addActionListener(this);
        sPanel.add(prevButton);
        add(sPanel, BorderLayout.SOUTH);
        JPanel cPanel = new JPanel();
        factorLabel = new JLabel(num.get(counter).getFactors());
        cPanel.add(factorLabel);
        primeLabel = new JLabel(num.get(counter).getLowerPrimes());
        cPanel.add(primeLabel);
        add(cPanel, BorderLayout.CENTER);
    }

  public void setUpNumbers()
  {
    for(int i=0; i<10; i++)
    {
      num.add(new Number((int)Math.random()*1000+2)));
      //System.out.println(num.get(0));
    }
  }

  public void actionPerformed(ActionEvent e)
  {
    String word = e.getActionCommand();
    if(word.equals("Exit"))
    {
      System.exit(0);
    }
    else if(word.equals("Next Number"))
    {
      counter++;
      welcomeLabel.setText("Number: " + num.get(counter));
      factorLabel.setText("Factors: " + num.get(counter.getFactors());
      primeLabel.setText("" + num.get(counter).getLowerPrimes());
    }
    else if(word.equals("Previous Number"))
    {
      counter--;
      welcomeLabel.setText("Number: " + num.get(counter));
      factorLabel.setText("Factors: " + num.get(counter.getFactors());
      primeLabel.setText("" + num.get(counter).getLowerPrimes());
    }
  }
}