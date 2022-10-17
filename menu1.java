package menu;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;import org.w3c.dom.events.Event;

public class menu1 extends JFrame {
	private static final Object FlowLayout = null;
	
	public menu1() {
		super("Pizza Restaurant");
		ArrayList<String> ing= new ArrayList<>();
		JFrame frame = this;
		setTitle("Pizza Restaurant");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300, 300));
		
		JMenu users = new JMenu("Users");
		users.setMnemonic(KeyEvent.VK_U);
		
		
		JMenuItem logout = new JMenuItem("Logout");
		logout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,Event.AT_TARGET));
		

		JMenuItem login = new JMenuItem("Logout");
		login.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,Event.AT_TARGET));
		
		users.add(login);
		users.add(logout);
		
		
		JMenu ingredients = new JMenu("Ingredients");
		ingredients.setMnemonic(KeyEvent.VK_U);
		
		JCheckBox tomatoSauce = new JCheckBox("Tomato Sauce");
		JCheckBox cheese = new JCheckBox("Cheese");
		JCheckBox pineapple = new JCheckBox("Pineapple");
		JCheckBox olives = new JCheckBox("Olives");
		JCheckBox mushrooms = new JCheckBox("Mushrooms");
		JCheckBox onions = new JCheckBox("Onions");
		JCheckBox porkMeatballs = new JCheckBox("Pork Meatballs");
		JCheckBox pepperoni = new JCheckBox("Pepperoni");
		JCheckBox ham = new JCheckBox("Ham");
		JCheckBox bacon = new JCheckBox("Bacon");
		ingredients.add(tomatoSauce);
		ingredients.add(cheese);
		ingredients.add(pineapple);
		ingredients.add(olives);
		ingredients.add(mushrooms);
		ingredients.add(onions);
		ingredients.addSeparator();
		ingredients.add(porkMeatballs);
		ingredients.add(pepperoni);
		ingredients.add(ham);
		ingredients.add(bacon);

		JMenu Chilli = new JMenu("Chilli Level");
		ingredients.setMnemonic(KeyEvent.VK_U);
		
		ButtonGroup group = new ButtonGroup();
		JRadioButtonMenuItem level0 = new JRadioButtonMenuItem("Level0: No Chilli");
		level0.setSelected(true);
		JRadioButtonMenuItem level1 = new JRadioButtonMenuItem("Level1: Mild Chilli");
		JRadioButtonMenuItem level2 = new JRadioButtonMenuItem("Level2: Hot Chilli");
		JRadioButtonMenuItem level3 = new JRadioButtonMenuItem("Level3: Extra-Hot Chilli");
		JRadioButtonMenuItem level4 = new JRadioButtonMenuItem("Level4: Habanero-Hot Chilli");
		group.add(level0);
		Chilli.add(level0);
		group.add(level1);
		Chilli.add(level1);
		group.add(level2);
		Chilli.add(level2);
		group.add(level3);
		Chilli.add(level3);
		group.add(level4);
		Chilli.add(level4);
		
		JMenu Orders = new JMenu("Orders");
		Orders.setMnemonic(KeyEvent.VK_U);
		
		JMenuItem regular = new JMenuItem("Prepare Regular Pizza");
		JMenuItem veggie = new JMenuItem("Prepare Veggie Pizza");
		Orders.add(regular);
		Orders.add(veggie);
		
		JMenuBar menuBar= new JMenuBar();
		menuBar.add(users);
		menuBar.add(ingredients);
		menuBar.add(Chilli);
		menuBar.add(Orders);
		frame.setJMenuBar(menuBar);
		
		JTextArea p = new JTextArea();
		p.setEditable(false);
		p.setVisible(true);
		frame.add(p);
		
		login.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		e.getSource();
		int show; 
		JTextField user = new JTextField();
		JPasswordField pass = new JPasswordField();
		
	    String message ="Please enter your username and password";
	    show = JOptionPane.showOptionDialog(frame, new Object[]{
		message,user, pass},"Login", JOptionPane.OK_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE,null,null,null);
	    
		String username= user.getText();
		String passWord= pass.getText();
		
		if(!username.equals("")){
		   p.append("Welcome. " + "\n" +"Your username is: " + username + "\n");}
		else{
		   p.append("invalid input. \n");
		}
		if(!passWord.equals("")){
		   p.append("Your password is " + passWord.length()+" characters long"+"\n");
		}
		else{
		   p.append("invalid input. \n");
		}
			}
		});
		
		
		logout.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e){
		e.getSource();
		int show1 = JOptionPane.showConfirmDialog(null, "Do you want to Logout? ");
		
		switch (show1){
		case JOptionPane.YES_OPTION:
		System.out.print("Yes");break;
		case JOptionPane.NO_OPTION:
		System.out.print("No");break;
		}
		
		if(show1==JOptionPane.YES_OPTION){
		frame.dispose();
		}
		else{
		p.append("logout cancelled " + "\n");
		}
		}
	    
		});
		
		tomatoSauce.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(tomatoSauce.isSelected())
					p.append("With Tomato Sauce " + "\n");
				ing.add("Tomato sauce");
				if(!tomatoSauce.isSelected())
					p.append("Tomato Sauce unadded" + "\n");
				ing.remove("Tomato sauce");
			}
		});
		
		cheese.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(cheese.isSelected())
					p.append("With Cheese has been added" + "\n");
				ing.add("Cheese");
				if(!cheese.isSelected())
					p.append("Cheese unadded" + "\n");
				ing.remove("Cheese");
			}
		});
		
		pineapple.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(pineapple.isSelected())
					p.append("With Pineapple " + "\n");
				ing.add("Pineapple");
				if(!pineapple.isSelected())
					p.append("Pineapple unadded" + "\n");
				ing.remove("Pineapple");
			}
		});
		
		olives.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(olives.isSelected())
					p.append("With Olives " + "\n");
				ing.add("Olives");
				if(!olives.isSelected())
					p.append("Olives unadded" + "\n");
				ing.remove("Olives");
			}
		});
		mushrooms.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(mushrooms.isSelected())
					p.append("With Mushrooms" + "\n");
				ing.add("Mushrooms");
				if(!mushrooms.isSelected())
					p.append("Mushrooms unadded" + "\n");
				ing.remove("Mushrooms");
			}
		});
		onions.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(onions.isSelected())
					p.append("With Onions" + "\n");
				ing.add("Onions");
				if(!onions.isSelected())
					p.append("Onions unadded" + "\n");
				ing.remove("Onions");
			}
		});
		porkMeatballs.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(porkMeatballs.isSelected())
					p.append("With Pork " + "\n");
				ing.add("Pork Meatballs");
				if(!porkMeatballs.isSelected())
					p.append("Pork Meatballs have been unadded" + "\n");
				ing.remove("Pork Meatballs");
			}
		});
		pepperoni.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(pepperoni.isSelected())
					p.append("With Pepperoni " + "\n");
				ing.add("Pepperoni");
				if(!pepperoni.isSelected())
					p.append("Pepperoni unadded" + "\n");
				ing.remove("Pepperoni");
			}
		});
		ham.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(ham.isSelected())
					p.append("With Ham " + "\n");
				ing.add("Ham");
				if(!ham.isSelected())
					p.append("Ham unadded" + "\n");
				ing.remove("Ham");
			}
		});
		bacon.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(bacon.isSelected())
					p.append("Bacon has been added" + "\n");
				ing.add("Bacon");
				if(!bacon.isSelected())
					p.append("Bacon has been unadded" + "\n");
				ing.remove("Bacon");
			}
		});
		
		level0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				e.getSource();
					p.append("Level 0: No chilli" + "\n");
				
			}
		});
		level1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				e.getSource();
					p.append("Level 1: Mild chilli" + "\n");
				
			}
		});
		level2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				e.getSource();
					p.append("Level 2: Hot chilli" + "\n");
				
			}
		});
		level3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				e.getSource();
					p.append("Level 3: Extra-Hot chilli" + "\n");
				
			}
		});
		level4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
					p.append("Level 4: Habanero-Hot chilli" + "\n");
				
			}
		});
		
		regular.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				if(!porkMeatballs.isSelected()&&!pepperoni.isSelected()&&!ham.isSelected()&&
						!bacon.isSelected()) {
					JOptionPane.showMessageDialog(frame,"no meat selected.");
				}
				
				p.append("\n" + "Preparing a regular pizza with :" + "\n" );
				if(tomatoSauce.isSelected())
					p.append("Tomato Sauce, ");
				if(cheese.isSelected())
					p.append("Cheese, ");
				if(pineapple.isSelected())
					p.append("Pineapple, ");
				if(olives.isSelected())
					p.append("Olives, ");
				if(mushrooms.isSelected())
					p.append("Mushrooms, ");
				if(onions.isSelected())
					p.append("Onions, ");
				if(porkMeatballs.isSelected())
					p.append("Pork Meatballs, ");
				if(pepperoni.isSelected())
					p.append("Pepperoni, ");
				if(ham.isSelected())
					p.append("Ham, ");
				if(bacon.isSelected())
					p.append("Bacon");
				p.append("\n" + " + The level of chilli is: " + " \n");
				if(level0.isSelected())
					p.append("Level 0: Habanero-Hot chilli \n" );
				if(level1.isSelected())
					p.append("Level 1: Mild chilli \n");
				if(level2.isSelected())
					p.append("Level 2: Hot chilli \n");
				if(level3.isSelected())
					p.append("Level 3: Extra-Hot chilli \n");
				if(level4.isSelected())
					p.append("Level 4: Habanero-Hot chilli");
			}
		});
		
		veggie.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent e) {
				if(porkMeatballs.isSelected()||pepperoni.isSelected()||ham.isSelected()||
						bacon.isSelected()) {
					
					JOptionPane.showMessageDialog(frame,"error.");
					p.append("no meat allowed on veggie pizza. \n");
				}
				
				else {
				p.append("\n" + "Preparing a veggie pizza with: " +  "\n" );
				if(tomatoSauce.isSelected())
					p.append("Tomato Sauce, ");
				if(cheese.isSelected())
					p.append("Cheese, ");
				if(pineapple.isSelected())
					p.append("Pineapple, ");
				if(olives.isSelected())
					p.append("Olives, ");
				if(mushrooms.isSelected())
					p.append("Mushrooms, ");
				p.append("\n" + " The level of chilli is: " + "\n");
				if(level0.isSelected())
					p.append("With Level 0: Habanero-Hot chilli \n" );
				if(level1.isSelected())
					p.append("With Level 1: Mild chilli \n");
				if(level2.isSelected())
					p.append("With Level 2: Hot chilli \n");
				if(level3.isSelected())
					p.append("With Level 3: Extra-Hot chilli \n");
				if(level4.isSelected())
					p.append("With Level 4: Habanero-Hot chilli");
				}
			}
				
			});
	}

    public static void main(String[] args){
    	
	menu1 act= new menu1();
	act.pack();
	act.setVisible(true);

		}
}
		
	
		    


