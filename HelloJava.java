
/*public class HelloJava {
	public static void main( String[] args ) {
	System.out.println("Hello, Java!");
	}
}*/

import java.awt.Color;

import javax.swing.*;
public class HelloJava 
{
  public static void main( String[] args ) {
    JFrame frame = new JFrame( "SecondApp" );
    frame.add( new HelloComponent() );
    frame.setSize( 400, 300 );
    
    frame.setVisible( true );
  }
}
class HelloComponent extends JComponent {
  public void paintComponent( java.awt.Graphics g ) {
    g.drawString( "Hello, oh my World!", 10, 11 );
  }
}



