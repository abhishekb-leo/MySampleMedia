package mymediasample;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import javax.swing.JApplet;

public class MySampleMedia extends JApplet{
	public static AudioClip TheMusic1;
	public static AudioClip TheMusic2;
	
	public void init(){
		//TheMusic=Applet.newAudioClip(Get_Location("sample4.au"));
		//TheMusic=Applet.newAudioClip(Get_Location("sample3.au"));
		//TheMusic2=Applet.newAudioClip(Get_Location("sample2.au"));
		TheMusic1=Applet.newAudioClip(Get_Location("sample1.au"));
		TheMusic1.play();
		//TheMusic2.play();
		//TheMusic3.play();
		//TheMusic4.play();
	}
	
	public URL Get_Location(String s){
		URL url=null;
		try{
			url=this.getClass().getResource(s);
	}catch(Exception e){}
		return url;
	}
}
