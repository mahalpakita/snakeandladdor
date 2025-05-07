import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;


public class unnnn extends JFrame {   
	Icon icon[][]= new Icon[10][10];
	JButton[][] BoardTiles = new JButton[10][10];
	Icon p1,p2;
	int i,j;
	int path;
	String str;
	int gameover;
	int player1total,player2total;
	int tt=0;
	int startagain=0;
	int game[][]={
        {100,99,98,97,96,95,94,93,92,91},
		{81,82,83,84,85,86,87,88,89,90},
 		{80,79,78,77,76,75,74,73,72,71},
 		{61,62,63,64,65,66,67,68,69,70},
 		{60,59,58,57,56,55,54,53,52,51},
 		{41,42,43,44,45,46,47,48,49,50},
 		{40,39,38,37,36,35,34,33,32,31},
 		{21,22,23,24,25,26,27,28,29,30},
 		{20,19,18,17,16,15,14,13,12,11},
 		{ 1, 2, 3, 4, 5, 6, 7, 8, 9,10},
    };
	

	public unnnn() {
		initComponents();
	}

	private int dieval(){
		int die = (int)(Math.random()*6) + 1;
		if (die==1){
			lbldice.setIcon(new ImageIcon("Dice/dice-1-md.png"));
		}else if(die==2){
			lbldice.setIcon(new ImageIcon("Dice/dice-2-md.png"));	
		}
		else if(die==3){
			lbldice.setIcon(new ImageIcon("Dice/dice-3-md.png"));	
		}
		else if(die==4){
			lbldice.setIcon(new ImageIcon("Dice/dice-4-md.png"));
		}	
		else if(die==5){
			lbldice.setIcon(new ImageIcon("Dice/dice-5-md.png"));
		}
		else if(die==6){
			lbldice.setIcon(new ImageIcon("Dice/dice-6-md.png"));
		}
		return die;
	}

	tunog t=new tunog();
	
	private void btnplayer1ActionPerformed(ActionEvent e) {
		t.pikaAudio();
		int d=dieval();
		player1total+=d;
		playerimagetravel1(player1total); 
		setBothImage();
		btnplayer1.setEnabled(false);
		btnplayer2.setEnabled(true);
	}

	private void btnplayer2ActionPerformed(ActionEvent e) {
		t.eeveAudio();
		int k=dieval();
		player2total+=k;
		playerimagetravel2(player2total);
		setBothImage();
		btnplayer1.setEnabled(true);
		btnplayer2.setEnabled(false);
	}

	private void btnstartActionPerformed(ActionEvent e) {
		tt+=1;
		gameover=0;
		player1total=0;
 		player2total=0;
		rePrint();
		btnstart.setEnabled(false);
  		btnrestart.setEnabled(true);
		btnplayer1.setEnabled(true);
		btnplayer2.setEnabled(true);
		t.sgameAudio(tt);
		ggameAudio();
		if(startagain>=1){
			btnplayer1.setVisible(true);
			btnplayer2.setVisible(true);
			tt+=1;
		}
	}
	
	private void btnrestartActionPerformed(ActionEvent e) {
		player1total=0;
 		player2total=0;
		gameover=0;
		rePrint();
		lbldice.setIcon(new ImageIcon("null"));
		btnplayer1.setEnabled(true);
		btnplayer2.setEnabled(true);
	}

	void rePrint(){ //reinstalling the original tiles
		for( i=0;i<10;i++){
 			for(j=0;j<10;j++) {
	 			BoardTiles[i][j].setIcon(icon[i][j]);
  			 }
 		}
	}

	void setBothImage(){ //putting p1 and p2 icon at the same time
		int noFlag=0;
		
		if(gameover==0){
			for(i=0;i<10;i++){
		  		for(j=0;j<10;j++){
		 			 if(player1total==game[i][j]){
						noFlag=1;
						break;
					}
		 		}if(noFlag==1)
	    			break;
			}
		
		if(noFlag==1){
			BoardTiles[i][j].setIcon(p1);  
		}

		noFlag=0;	
		
		for(i=0;i<10;i++){
		  for(j=0;j<10;j++){
		  	if(player2total==game[i][j]){
				noFlag=1;
			    break;
		  	}
		 }if(noFlag==1)
			break;
		}
		
		if(noFlag==1){
			BoardTiles[i][j].setIcon(p2);
		}
		}
	}

	void winerdraw(){
		btnstart.setEnabled(true);
		btnrestart.setEnabled(false);
		btnstart.setText("Play Again?!");
		gameover=1;
		btnplayer1.setVisible(false);
		btnplayer2.setVisible(false);
		player1total=0;
		player2total=0;
		startagain++;
		lbldice.setIcon(new ImageIcon("null"));				           
	}

	Clip audioClip;
    AudioInputStream audioStream;
	public void ggameAudio(){
		try{
			 File audioFile = new File(
				  "Soundings/Battle!.wav");
			 audioStream = AudioSystem.getAudioInputStream(audioFile);
			 AudioFormat format = audioStream.getFormat();
   
			 DataLine.Info info = new DataLine.Info(Clip.class, format);
			 audioClip = (Clip) AudioSystem.getLine(info);
			 audioClip.open(audioStream);
			 audioClip.start(); 
			 audioClip.loop(5);  
		}catch(Exception ee){
			
		}
   }

	void playerimagetravel1(int n){
		if(gameover==0){
		rePrint(); 
 			if(n==1){
				t.ladderAudio();
 				n=38;
 				playerimagetravel1(n);
 				player1total=n;
 			}else if(n==4){
				t.ladderAudio();
 				n=14;
 				playerimagetravel1(n);
 				player1total=n;
 			}else if(n==9){
				t.ladderAudio();
 				n=31;
 				playerimagetravel1(n);
 				player1total=n;
 			}else if(n==28){
				t.ladderAudio();
 				n=84;
 				playerimagetravel1(n);
 				player1total=n;
 			}else if(n==21){
				t.ladderAudio();
 				n=42;
 				playerimagetravel1(n);
 				player1total=n;
 			}else if(n==51){
				t.ladderAudio();
				n=67;
				playerimagetravel1(n);
				player1total=n;
			}else if(n==72){
				t.ladderAudio();
				n=91;
				playerimagetravel1(n);
				player1total=n;
			}else if(n==80){
				t.ladderAudio();
				n=99;
				playerimagetravel1(n);
				player1total=n;
			}

 			if(n==17){
				t.snakeAudio();
  				n=7;
  				playerimagetravel1(n);
				player1total=n;	
 			}else if(n==54){
				t.snakeAudio();
 				n=34;
 				playerimagetravel1(n);
				player1total=n;
 			}else if(n==62){
				t.snakeAudio();
 				n=19;
  				playerimagetravel1(n);
  				player1total=n;
 			}else if(n==64){
				t.snakeAudio();
 				n=60;
 				playerimagetravel1(n);
 				player1total=n;
 			}else if(n==87){
				t.snakeAudio();
  				n=36;
 				playerimagetravel1(n);
				player1total=n;
 			}else if(n==93){
				t.snakeAudio();
				n=73;
				playerimagetravel1(n);
				player1total=n;
			}else if(n==95){
				t.snakeAudio();
				n=75;
				playerimagetravel1(n);
				player1total=n;
   			}else if(n==98){
				t.snakeAudio();
				n=79;
				playerimagetravel1(n);
				player1total=n;
 			}

 			if(n>=100){   
				audioClip.close(); 
				t.vicAudio();
				JOptionPane.showMessageDialog(null, "Pikachu won");
 				winerdraw();	
				 
 			}
		}
	}

void playerimagetravel2(int n){
	if(gameover==0){
		rePrint(); 	
			if(n==1){
				t.ladderAudio();
				n=38;
				playerimagetravel2(n);
				player2total=n;
			}else if(n==4){
				t.ladderAudio();
				n=14;
				playerimagetravel2(n);
				player2total=n;	
			}else if(n==9){
				t.ladderAudio();
				n=31;
				playerimagetravel2(n);
				player2total=n;
			}else if(n==28){
				t.ladderAudio();
				n=84;
				playerimagetravel2(n);
				player2total=n;
			}else if(n==21){
				t.ladderAudio();
				n=42;
				playerimagetravel2(n);
				player2total=n;
			}else if(n==51){
				t.ladderAudio();
				n=67;
				playerimagetravel2(n);
				player2total=n;
			}else if(n==72){
				t.ladderAudio();
				n=91;
				playerimagetravel2(n);
				player2total=n;
			}else if(n==80){
				t.ladderAudio();
				n=99;
				playerimagetravel2(n);
				player2total=n;
			}

			if(n==17){
				t.snakeAudio();
				n=7;
				playerimagetravel2(n);
				player2total=n;	
			}else if(n==54){
				t.snakeAudio();
				n=34;
				playerimagetravel2(n);
				player2total=n;	
			}else if(n==62){
				t.snakeAudio();
				n=19;
				playerimagetravel2(n);
				player2total=n;
			}else if(n==87){
				t.snakeAudio();
				n=36;
				playerimagetravel2(n);
				player2total=n;
			}else if(n==93){
				t.snakeAudio();
 				n=73;
				playerimagetravel2(n);
				player2total=n;
			}else if(n==95){
				t.snakeAudio();
				n=75;
   				playerimagetravel2(n);
				player2total=n;
  		    }else if(n==98){
				t.snakeAudio();
				n=79;
   				playerimagetravel2(n);
				player2total=n;
   			}
	
			if(n>=100){ 
				audioClip.close(); 	
				t.vicAudio();
				JOptionPane.showMessageDialog(null, "Eevee Won!");
				winerdraw();
				
			}
	}
}


	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		panel1 = new JPanel();
		btnplayer1 = new JButton();
		btnplayer2 = new JButton();
		btnstart = new JButton();
		btnrestart = new JButton();
		lbldice = new JLabel();
		lblbg = new JLabel();
		p1= new ImageIcon("Skin/pic.gif");        
		p2= new ImageIcon("Skin/ebee.gif");  
		t.sgameAudio(tt); 
		
		//======== this ========
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Snake & Ladder: Pok\u00e9mon Edition");
		Container contentPane = getContentPane();
		setIconImage(new ImageIcon("Skin/ikonic.png").getImage());
		
		contentPane.setLayout(null);

		//---- btnplayer1 ----
		btnplayer1.setText("Pikachu Roll");
		btnplayer1.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 15));
		btnplayer1.addActionListener(e -> btnplayer1ActionPerformed(e));
		contentPane.add(btnplayer1);
		btnplayer1.setBounds(850, 130, 150, 105);
		btnplayer1.setEnabled(false);
		btnplayer1.setForeground(Color.BLACK);
		btnplayer1.setBackground(new Color(246, 207, 87));
		
		//---- btnplayer2 ----
		btnplayer2.setText("Eevee Roll");
		btnplayer2.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 15));
		btnplayer2.addActionListener(e -> btnplayer2ActionPerformed(e));
		contentPane.add(btnplayer2);
		btnplayer2.setBounds(850, 580, 150, 105);
		btnplayer2.setEnabled(false);
		btnplayer2.setForeground(Color.BLACK);
		btnplayer2.setBackground(new Color(197,160,104));

		//---- btnstart ----
		btnstart.setText("Start Game");
		btnstart.setFont(new Font("HelveticaNeueLT Std", Font.PLAIN, 10));
		btnstart.addActionListener(e -> btnstartActionPerformed(e));
		contentPane.add(btnstart);
		btnstart.setBounds(500, 750, 100, 35);
		btnstart.setEnabled(true);
		btnstart.setBackground(new Color(255,0,0));
		btnstart.setForeground(Color.WHITE);

		//---- btnrestart ----
		btnrestart.setText("Restart");
		btnrestart.addActionListener(e -> btnrestartActionPerformed(e));
		contentPane.add(btnrestart);
		btnrestart.setBounds(180, 750, 100, 35);
		btnrestart.setEnabled(false);
		btnrestart.setBackground(new Color(51, 153, 255));
		btnrestart.setForeground(Color.WHITE);
		
		contentPane.add(lbldice);
		lbldice.setBounds(830, 315, 200, 200);

		//======== panel1 ========
		{
		panel1.setLayout(new GridLayout(10, 10));
			
        for (i = 0; i < BoardTiles.length; i++) 
            for (j = 0; j < BoardTiles.length; j++) {
               
				BoardTiles[i][j]= new JButton();//boardtiles[6][9]
				
				path=game[i][j];	//game[6][9] path = 31
				str=Integer.toString(path); //type casting str="31"
				
				icon[i][j]=new ImageIcon("Tiles/"+str+".png"); //icon[6][9] = 31.png
				BoardTiles[i][j].setIcon(icon[i][j]);  //jbutton boardtiles[6][9] seticon 31.png
				panel1.add(BoardTiles[i][j]);     //add to panel1 w/gridlayout 10x10
				
        }
		//System.out.println(BoardTiles.length);
		}
		contentPane.add(panel1);
		panel1.setBounds(30, 45, 750, 680);

		lblbg.setBounds(0, 0, 1165, 825);
		lblbg.setIcon(new ImageIcon("Skin/wwemerald.gif"));
		contentPane.add(lblbg);
		
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
		setSize(1165, 855);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel panel1;
	private JButton btnplayer1;
	private JButton btnplayer2;
	private JLabel lbldice;
	private JLabel lblbg;
	private JButton btnstart;
	private JButton btnrestart;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}