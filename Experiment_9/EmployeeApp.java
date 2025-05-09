import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EmployeeApp extends JFrame {

    JTextField tfId, tfName, tfDept, tfSalary;
    JButton btnInsert, btnRetrieve;
    JTable table;
    DefaultTableModel model;

    Connection conn;

    public EmployeeApp() {
        setTitle("Employee Management");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("ID:"));
        tfId = new JTextField();
        inputPanel.add(tfId);

        inputPanel.add(new JLabel("Name:"));
        tfName = new JTextField();
        inputPanel.add(tfName);

        inputPanel.add(new JLabel("Department:"));
        tfDept = new JTextField();
        inputPanel.add(tfDept);

        inputPanel.add(new JLabel("Salary:"));
        tfSalary = new JTextField();
        inputPanel.add(tfSalary);

        btnInsert = new JButton("Insert");
        btnRetrieve = new JButton("Retrieve");
        inputPanel.add(btnInsert);
        inputPanel.add(btnRetrieve);

        add(inputPanel, BorderLayout.NORTH);

        // Table
        model = new DefaultTableModel(new String[]{"ID", "Name", "Department", "Salary"}, 0);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Database Connection
        connectDB();

        // Button Actions
        btnInsert.addActionListener(e -> insertData());
        btnRetrieve.addActionListener(e -> retrieveData());

        setVisible(true);
    }

    private void connectDB() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/company?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
        "root",
        "#Bs5846masand"
);

        System.out.println("✅ Connected to DB successfully!");
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Database connection error: " + ex.getMessage());
    }
}


    private void insertData() {
        try {
            String sql = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(tfId.getText()));
            ps.setString(2, tfName.getText());
            ps.setString(3, tfDept.getText());
            ps.setDouble(4, Double.parseDouble(tfSalary.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee inserted successfully!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Insert error: " + ex.getMessage());
        }
    }

    private void retrieveData() {
        try {
            model.setRowCount(0); // clear table
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary")
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Retrieve error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new EmployeeApp();
    }
}
