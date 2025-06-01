package Proje;
/* 
ErvaERGÜL 230601060 
BüşraİNAN 230601058 
SadıkTEKBAŞ 230601054 
HilalCALP 230601056
*/
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu();  // Ana menü ekranı başlatılır
            }
        });
	}
}
