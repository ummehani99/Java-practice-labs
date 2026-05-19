import javax.swing.*; 
public class FirstWindow { 
public static void main(String[] args) { 
// Create frame (main window): 
JFrame frame = new JFrame("Hani's First GUI"); 
frame.setSize(400, 300);                    
// width x height in pixels 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit app on close 
frame.setLocationRelativeTo(null);          
// center on screen 
frame.setLayout(null);                      
// manual positioning 

 
        // Add a label: 
        JLabel label = new JLabel("Hello, World!"); 
        label.setBounds(150, 80, 200, 30);   // x, y, width, height 
        frame.add(label); 
 
        // Add a button: 
        JButton btn = new JButton("Click Me!"); 
        btn.setBounds(140, 150, 120, 35); 
        frame.add(btn); 
 
        frame.setVisible(true);   // IMPORTANT: makes window appear 
    } 
} 