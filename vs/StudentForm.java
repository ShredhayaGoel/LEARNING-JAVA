package vs;
import javax.swing.*;
import java.awt.event.*;

public class StudentForm extends JFrame implements ActionListener {
    JTextField nameField, rollField, classField;
    JRadioButton maleBtn, femaleBtn;
    JCheckBox reading, sports, music;
    JButton submitBtn;

    public StudentForm() {
        setTitle("Student Information Form");
        setSize(450, 350);
        setLayout(null);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 100, 25);
        add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(140, 30, 200, 25);
        add(nameField);

        // Roll No
        JLabel rollLabel = new JLabel("Roll No:");
        rollLabel.setBounds(30, 70, 100, 25);
        add(rollLabel);
        rollField = new JTextField();
        rollField.setBounds(140, 70, 200, 25);
        add(rollField);

        // Class
        JLabel classLabel = new JLabel("Class:");
        classLabel.setBounds(30, 110, 100, 25);
        add(classLabel);
        classField = new JTextField();
        classField.setBounds(140, 110, 200, 25);
        add(classField);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(30, 150, 100, 25);
        add(genderLabel);
        maleBtn = new JRadioButton("Male");
        maleBtn.setBounds(140, 150, 80, 25);
        femaleBtn = new JRadioButton("Female");
        femaleBtn.setBounds(230, 150, 100, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);
        add(maleBtn);
        add(femaleBtn);

        // Hobbies
        JLabel hobbiesLabel = new JLabel("Hobbies:");
        hobbiesLabel.setBounds(30, 190, 100, 25);
        add(hobbiesLabel);
        reading = new JCheckBox("Reading");
        reading.setBounds(140, 190, 100, 25);
        sports = new JCheckBox("Sports");
        sports.setBounds(240, 190, 100, 25);
        music = new JCheckBox("Music");
        music.setBounds(340, 190, 100, 25);
        add(reading);
        add(sports);
        add(music);

        // Submit Button
        submitBtn = new JButton("Submit");
        submitBtn.setBounds(180, 240, 100, 30);
        submitBtn.addActionListener(this);
        add(submitBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        String roll = rollField.getText().trim();
        String cls = classField.getText().trim();
        String gender = maleBtn.isSelected() ? "Male" : femaleBtn.isSelected() ? "Female" : "";
        String hobbies = "";
        if (reading.isSelected()) hobbies += "Reading ";
        if (sports.isSelected()) hobbies += "Sports ";
        if (music.isSelected()) hobbies += "Music ";

        if (name.isEmpty() || roll.isEmpty() || cls.isEmpty() || gender.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all mandatory fields.");
        } else {
            JOptionPane.showMessageDialog(this,
                "Student Details:\n" +
                "Name: " + name + "\n" +
                "Roll No: " + roll + "\n" +
                "Class: " + cls + "\n" +
                "Gender: " + gender + "\n" +
                "Hobbies: " + hobbies);
        }
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
