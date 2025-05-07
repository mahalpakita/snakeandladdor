import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class tunog {
    Clip audioClip;
    AudioInputStream audioStream;

    public void eeveAudio(){
        try{
             File audioFile = new File(
                  "Soundings/eeveenoise.wav");
             audioStream = AudioSystem.getAudioInputStream(audioFile);
             AudioFormat format = audioStream.getFormat();

             DataLine.Info info = new DataLine.Info(Clip.class, format);
             audioClip = (Clip) AudioSystem.getLine(info);
             audioClip.open(audioStream);
             audioClip.start();
        }catch(Exception ee){

        }
   }

   public void pikaAudio(){
     try{
          File audioFile = new File(
               "Soundings/pikachunoise.wav");
          audioStream = AudioSystem.getAudioInputStream(audioFile);
          AudioFormat format = audioStream.getFormat();

          DataLine.Info info = new DataLine.Info(Clip.class, format);
          audioClip = (Clip) AudioSystem.getLine(info);
          audioClip.open(audioStream);
          audioClip.start();      
     }catch(Exception ee){

     }
}

   public void snakeAudio(){
    try{
         File audioFile = new File(
              "Soundings/ahas.wav");
         audioStream = AudioSystem.getAudioInputStream(audioFile);
         AudioFormat format = audioStream.getFormat();

         DataLine.Info info = new DataLine.Info(Clip.class, format);
         audioClip = (Clip) AudioSystem.getLine(info);
         audioClip.open(audioStream);
         audioClip.start();
          
    }catch(Exception ee){

    }
}

public void ladderAudio(){
    try{
         File audioFile = new File(
              "Soundings/ladorsound.wav");
         audioStream = AudioSystem.getAudioInputStream(audioFile);
         AudioFormat format = audioStream.getFormat();

         DataLine.Info info = new DataLine.Info(Clip.class, format);
         audioClip = (Clip) AudioSystem.getLine(info);
         audioClip.open(audioStream);
         audioClip.start();    
    }catch(Exception ee){

    }
}

public void sgameAudio(int pp){
     try{
          if(pp>=1){
               audioClip.close();
          }else{
          File audioFile = new File(
               "Soundings/Route.wav");
          audioStream = AudioSystem.getAudioInputStream(audioFile);
          AudioFormat format = audioStream.getFormat();

          DataLine.Info info = new DataLine.Info(Clip.class, format);
          audioClip = (Clip) AudioSystem.getLine(info);
          audioClip.open(audioStream);
          audioClip.start(); 
          audioClip.loop(5);  
    
     } 
     }catch(Exception ee){

     }
}


public void vicAudio(){
     try{
          File audioFile = new File(
               "Soundings/Victory!.wav");
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

}