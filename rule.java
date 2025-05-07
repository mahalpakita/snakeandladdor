import java.awt.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class rule extends JFrame {
	public rule() {
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
					new unnnn().setVisible(true);
					setVisible(false);
					t.cancel();
				}
			}
		},6500,50);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		progressBar1 = new JProgressBar();
		lblpic = new JLabel();
		lblbg = new JLabel();
		progress();

		//======== this ========
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Snake & Ladder: Pok\u00e9mon Edition");
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		setIconImage(new ImageIcon("Skin/ikonic.png").getImage());

		//---- label1 ----
		label1.setText("RULES:");
		label1.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 36));
		label1.setForeground(Color.white);
		contentPane.add(label1);
		label1.setBounds(375, 35, 135, 70);

		//---- label2 ----
		label2.setText("Navigate one's pokemon from the start square 1");
		label2.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 32));
		label2.setForeground(Color.white);
		contentPane.add(label2);
		label2.setBounds(85, 115, 785, 45);

		//---- label3 ----
		label3.setText("to the finish square 100 by rolling the dice turn by turn.");
		label3.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 32));
		label3.setForeground(Color.white);
		contentPane.add(label3);
		label3.setBounds(35, 155, 855, 50);

		//---- label4 ----
		label4.setText("Land on a LADDER and go UP");
		label4.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 32));
		label4.setForeground(Color.white);
		contentPane.add(label4);
		label4.setBounds(235, 225, 505, 45);

		//---- label5 ----
		label5.setText("Land on a SNAKE and go DOWN");
		label5.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 32));
		label5.setForeground(Color.white);
		contentPane.add(label5);
		label5.setBounds(225, 270, 530, 45);

		//---- label6 ----
		label6.setText("1st pokemon to reach square 100 wins the game!");
		label6.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 32));
		label6.setForeground(Color.white);
		contentPane.add(label6);
		label6.setBounds(75, 340, 780, 45);

		//---- progressBar1 ----
		progressBar1.setStringPainted(true);
		progressBar1.setForeground(new Color(197,160,104));
		contentPane.add(progressBar1);
		progressBar1.setBounds(50, 460, 825, 55);

		//---- lblpic ----
		lblpic.setIcon(new ImageIcon("Skin/69.gif"));
		contentPane.add(lblpic);
		lblpic.setBounds(40, 395, 80, 65);

		//---- lblbg ----
		lblbg.setText("text");
		lblbg.setIcon(new ImageIcon("Skin/backgrount.png"));
		lblbg.setForeground(Color.white);
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
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JProgressBar progressBar1;
	private JLabel lblpic;
	private JLabel lblbg;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}