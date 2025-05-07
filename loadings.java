import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class loadings extends JFrame {
	Clip audioClip;
    AudioInputStream audioStream;
	
	public loadings() {
		initComponents();
	}

	private void lbltxtMouseClicked(MouseEvent e) {
		new infoscreen().setVisible(true);
					setVisible(false);
					audioClip.close();
	}

	private void lblbgMouseClicked(MouseEvent e) {
		new infoscreen().setVisible(true);
					setVisible(false);
					audioClip.close();
	}

	public void gameAudio(){
		try{
			 File audioFile = new File(
				  "Soundings/Littleroot.wav");
			 audioStream = AudioSystem.getAudioInputStream(audioFile);
			 AudioFormat format = audioStream.getFormat();
   
			 DataLine.Info info = new DataLine.Info(Clip.class, format);
			 audioClip = (Clip) AudioSystem.getLine(info);
			 audioClip.open(audioStream);
			 audioClip.start(); 
			 audioClip.loop(5); 

		}catch(Exception ee){
		}}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		lbltxt = new JLabel();
		lblbg = new JLabel();
		gameAudio();

		//======== this ========
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Snake & Ladder: Pok\u00e9mon Edition");
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		setIconImage(new ImageIcon("Skin/ikonic.png").getImage());
		
		//---- lbltxt ----
		lbltxt.setText("CLICK ANYWHERE TO BEGIN");
		lbltxt.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 30));
		lbltxt.setForeground(Color.LIGHT_GRAY);
		lbltxt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbltxtMouseClicked(e);
			}
		});
		contentPane.add(lbltxt);
		lbltxt.setBounds(400, 250, 450, 65);

		//---- lblbg ----
		lblbg.setIcon(new ImageIcon("Skin/pe.gif"));
		lblbg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblbgMouseClicked(e);
			}
		});
		contentPane.add(lblbg);
		lblbg.setBounds(0, 0, 1175, 465);

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
		setSize(1175, 500);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel lbltxt;
	private JLabel lblbg;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}