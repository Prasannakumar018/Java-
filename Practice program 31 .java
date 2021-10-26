import javax.swing.*;  
public class FirstSwingExample {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
          
JButton b01=new JButton("click");//creating instance of JButton  
b01.setBounds(130,100,100, 40);//x axis, y axis, width, height  
          
f.add(b01);//adding button in JFrame  
          
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}
