import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(500, 550);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.CYAN);

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        frame.add(nameLabel);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 100, 100, 30);
        frame.add(genderLabel);

        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(50, 150, 100, 30);
        frame.add(countryLabel);

        JLabel bioLabel = new JLabel("Bio:");
        bioLabel.setBounds(50, 200, 100, 30);
        frame.add(bioLabel);

        // TextField
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);
        frame.add(nameField);

        // Radio Buttons for Gender
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 100, 80, 30);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(240, 100, 80, 30);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        frame.add(male);
        frame.add(female);

        // ComboBox for Country
        String[] countries = {"Select", "India", "USA", "UK", "Australia"};
        JComboBox<String> countryBox = new JComboBox<>(countries);
        countryBox.setBounds(150, 150, 150, 30);
        frame.add(countryBox);

        // TextArea for Bio
        JTextArea bioArea = new JTextArea();
        bioArea.setBounds(150, 200, 250, 100);
        bioArea.setLineWrap(true);
        bioArea.setWrapStyleWord(true);
        frame.add(bioArea);

        // CheckBox for terms
        JCheckBox terms = new JCheckBox("I agree to the terms and conditions");
        terms.setBounds(50, 320, 300, 30);
        frame.add(terms);

        // Submit Button
        JButton submit = new JButton("Submit");
        submit.setBounds(150, 370, 100, 30);
        frame.add(submit);

        // Action Listener for Submit
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Not Selected");
                String country = (String) countryBox.getSelectedItem();
                String bio = bioArea.getText();
                boolean agreed = terms.isSelected();

                if(name.isEmpty() || gender.equals("Not Selected") || country.equals("Select") || !agreed) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields and accept terms!");
                } else {
                    String info = "Name: " + name + "\nGender: " + gender + "\nCountry: " + country + "\nBio: " + bio;
                    JOptionPane.showMessageDialog(frame, info, "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
