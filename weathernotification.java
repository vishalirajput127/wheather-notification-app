import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class weathernotification {
    private static  Jframe frame;
    private static JTextField locationfield;
    private static JTextArea weatherDisplay;
    private static JButton fetchButton;
   private static String fetchWeatherData(String city){
        Jframe frame;
        return city;


    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Weather Notification App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new FlowLayout());
        JTextField locationField = new JTextField(15);
        JButton fetchButton = new JButton("Fetch Weather");
        JTextArea weatherDisplay = new JTextArea(10,30);
        weatherDisplay.setEditable(false);
        frame.add(new JLabel("Enter city Name"));
        frame.add(locationField);
        frame.add(fetchButton);
        frame.add(weatherDisplay);
        fetchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

                String city = locationField.getText();

            
        });

        

        frame.setVisible(true);
    
}}