package employeemanager;


import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class MainWindow extends javax.swing.JFrame {
   private static EmployeeList employeeList;
     private static String objPath = new File("object.dat").getAbsolutePath();
    
     public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEmployee = new javax.swing.JList<>();
        txtSearch = new javax.swing.JTextField();
        btnAddNewEmployee = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lblDepartment = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblHiredDate = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtHiredDate = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstEmployee);

        btnAddNewEmployee.setText("Add New Employee");
        btnAddNewEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNewEmployeeMouseClicked(evt);
            }
        });
        btnAddNewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewEmployeeActionPerformed(evt);
            }
        });

        lblID.setText("ID:");

        lblDepartment.setText("Department");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        lblHiredDate.setText("Hired Date:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtHiredDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHiredDateActionPerformed(evt);
            }
        });

        txtDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentActionPerformed(evt);
            }
        });

        lblPhoneNumber.setText("Phone number:");

        lblPosition.setText("Position:");

        lblEmail.setText("E-Mail:");

        lblFirstName.setText("First Name:");

        lblSalary.setText("Salary:");

        lblLastName.setText("Last Name:");

        lblDateOfBirth.setText("Date of birth:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnAddNewEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblLastName)
                                    .addComponent(lblID)
                                    .addComponent(lblDepartment))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPosition)
                                    .addComponent(lblEmail)
                                    .addComponent(lblSalary)
                                    .addComponent(lblDateOfBirth)
                                    .addComponent(lblPhoneNumber)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHiredDate)
                                .addGap(18, 18, 18)
                                .addComponent(txtHiredDate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosition)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalary)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartment)
                            .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDateOfBirth)
                            .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHiredDate)
                            .addComponent(txtHiredDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoneNumber)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addComponent(btnAddNewEmployee)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewEmployeeMouseClicked
       
    }//GEN-LAST:event_btnAddNewEmployeeMouseClicked

    private void btnAddNewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewEmployeeActionPerformed
     
      
     
       System.out.println(objPath);
        
        employeeList  = EmployeeList.LoadFromFile(objPath);
        
        if (employeeList == null)
            employeeList = new EmployeeList(objPath);

        
        addEmployee AddEmployee = new addEmployee();
        AddEmployee.setVisible(true);
        
        AddEmployee.setEmployeeList(employeeList);
        AddEmployee.setParentWindow(this);
        
        
    }//GEN-LAST:event_btnAddNewEmployeeActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtHiredDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHiredDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHiredDateActionPerformed

    private void txtDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentActionPerformed

    private void lstEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstEmployeeMouseClicked
          
        if(lstEmployee.getSelectedValues().length > 0) {
            
            Employee selectedEmployee = (Employee)lstEmployee.getSelectedValues()[0];
            loadEmployeeInformation(selectedEmployee);
        }
          
          
    }//GEN-LAST:event_lstEmployeeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewEmployee;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHiredDate;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JList<String> lstEmployee;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHiredDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    
  
    
    
    private Employee selectedEmployee = null;

    public void setEmployeeList(EmployeeList employeeList) {
        this.employeeList = employeeList;
        loadEmployeeToList();
    }

    
    public void loadEmployeeToList() {
        DefaultListModel defaultListModel = new DefaultListModel();

        for (Employee currentEmployee : employeeList.getList()) {
            defaultListModel.addElement(currentEmployee);
        }
        lstEmployee.setModel(defaultListModel);
    }

    private void loadEmployeeInformation(Employee employee) {
    
        selectedEmployee = employee;
        
        txtID.setText(employee.getID());
        txtFirstName.setText(employee.getFirstName());
        txtLastName.setText(employee.getLastName());
        txtSalary.setText(employee.getSalary());
        txtDepartment.setText(employee.getDepartment());
        txtPosition.setText(employee.getPosition());
        txtEmail.setText(employee.getEmail());
        txtPhoneNumber.setText(employee.getPhoneNumber());
        txtDateOfBirth.setText(employee.getBirthDate());
        txtHiredDate.setText(employee.getHiredDate());
  
    }
    
     private void loadEmployeeInformation() {
    
        if(selectedEmployee != null) {
        
            selectedEmployee.setID(txtID.getText());
            selectedEmployee.setFirstName(txtFirstName.getText());
            selectedEmployee.setLastName(txtLastName.getText());
            selectedEmployee.setSalary(txtSalary.getText());
            selectedEmployee.setDepartment(txtDepartment.getText());
            selectedEmployee.setPosition(txtPosition.getText());
            selectedEmployee.setEmail(txtEmail.getText());
            selectedEmployee.setPhoneNumber(txtPhoneNumber.getText());
            selectedEmployee.setBirthDate(txtDateOfBirth.getText());
            selectedEmployee.setHiredDate(txtHiredDate.getText());
            
            employeeList.saveObject();
        }
     }
     
   private void search(String query) {
    
        DefaultListModel defaultListModel = new DefaultListModel();
        
        ArrayList<Employee> searchResult = employeeList.search(query);
        
        for(Employee currentEmployee : searchResult) {
        
            defaultListModel.addElement(currentEmployee);
        }
        
        lstEmployee.setModel(defaultListModel);
    }  
   
     private void clearFields() {
    
        txtID.setText("");
         txtFirstName.setText("");
        txtLastName.setText("");
        txtSalary.setText("");
        txtDepartment.setText("");
        txtPosition.setText("");
       txtEmail.setText("");
        txtPhoneNumber.setText("");
        txtDateOfBirth.setText("");
        txtHiredDate.setText("");
        
    }
     
 
    
      

}
