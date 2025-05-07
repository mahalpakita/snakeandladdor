import java.awt.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class infoscreen extends JFrame {
	public infoscreen() {
		initComponents();
	}	

	private void progress(){
		Timer t=new Timer();
		t.schedule(new TimerTask(){
			public void run(){
				int c=progressBar1.getValue();
				c=c+1;
				progressBar1.setValue(c);
				lblpic.setLocation(25+(c*8), 390);
				if(c==100){
					new rule().setVisible(true);
					setVisible(false);
					t.cancel();
				}
			}
		},5000,50);
	}


	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		label2 = new JLabel();
		progressBar1 = new JProgressBar();
		label3 = new JLabel();
		label4 = new JLabel();
		lblpic = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		lblbg = new JLabel();
		progress();

		//======== this ========
		setTitle("Snake & Ladder: Pok\u00e9mon Edition");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		setIconImage(new ImageIcon("Skin/ikonic.png").getImage());

		//---- label1 ----
		label1.setText("Snakes & Ladders is a classic fun and easy game");
		label1.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 32));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setVerticalAlignment(SwingConstants.TOP);
		label1.setForeground(Color.white);
		contentPane.add(label1);
		label1.setBounds(70, 90, 795, 45);

		//---- label2 ----
		label2.setText("100 squares full of traps and tricks");
		label2.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 32));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setVerticalAlignment(SwingConstants.TOP);
		label2.setForeground(Color.white);
		contentPane.add(label2);
		label2.setBounds(100, 205, 725, 50);

		//---- progressBar1 ----
		progressBar1.setStringPainted(true);
		progressBar1.setForeground(new Color(246, 207, 87));
		contentPane.add(progressBar1);
		progressBar1.setBounds(50, 455, 825, 55);

		//---- label3 ----
		label3.setText("to play for family and friends of all ages.");
		label3.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 32));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setVerticalAlignment(SwingConstants.TOP);
		label3.setForeground(Color.white);
		contentPane.add(label3);
		label3.setBounds(80, 125, 795, 45);

		//---- label4 ----
		label4.setText(" roll the dice and try your LUCK!");
		label4.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 32));
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setVerticalAlignment(SwingConstants.TOP);
		label4.setForeground(Color.white);
		contentPane.add(label4);
		label4.setBounds(50, 240, 795, 50);

		//---- lblpic ----
		lblpic.setIcon(new ImageIcon("Skin/pic.gif"));
		contentPane.add(lblpic);
		lblpic.setBounds(25, 390, 105, 65);

		//---- label6 ----
		label6.setText("This version has Pok\u00e9mon in it!");
		label6.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 32));
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setVerticalAlignment(SwingConstants.TOP);
		label6.setForeground(Color.white);
		contentPane.add(label6);
		label6.setBounds(155, 365, 575, 40);

		//---- label7 ----
		label7.setText("CAUTION:");
		label7.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 32));
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		label7.setVerticalAlignment(SwingConstants.TOP);
		label7.setForeground(Color.white);
		contentPane.add(label7);
		label7.setBounds(350, 325, 230, 35);

		//---- lblbg ----
		lblbg.setText("text");
		lblbg.setIcon(new ImageIcon("Skin/backgrount.png"));
		contentPane.add(lblbg);
		lblbg.setBounds(0, 0, 930, 565);

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		setSize(930, 595);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JLabel label2;
	private JProgressBar progressBar1;
	private JLabel label3;
	private JLabel label4;
	private JLabel lblpic;
	private JLabel label6;
	private JLabel label7;
	private JLabel lblbg;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
