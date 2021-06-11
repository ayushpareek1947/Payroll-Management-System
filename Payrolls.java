package Payroll_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Payrolls {

	private JFrame frame;
	private JTextField txtEmployerName;
	private JTextField txtEmployeeNo;
	private JTextField txtEmployeeName;
	private JTextField txtEmployeeAddress;
	private JTextField txtPostCode;
	private JTextField txtInnerCity;
	private JTextField txtBasicSalary;
	private JTextField txtOverTime;
	private JTextField txtGrossPay;
	private JTextField txtPensionable;
	private JTextField txtNetPay;
	private JTextField txtPayDate;
	private JTextField txtNINumber;
	private JTextField txtTax;
	private JTextField txtPension;
	private JTextField txtStudentLoan;
	private JTextField txtNIPayment;
	private JTextField txtTaxablePay;
	private JTextField txtDeductions;
	private JTextField rtfPaySlip;
	
	double InnerCity;
	double OverTime;
	double BasicWage;
	double Gross;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payrolls window = new Payrolls();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payrolls() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				//============================================================================
				
				int refs=1325+(int)(Math.random()*4238);
				
				//============================================================================
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
				Tdate.format(timer.getTime());
				txtPayDate.setText(Tdate.format(timer.getTime()));
				
				String sRef = String.format("EMPNO"+ refs);
				txtEmployeeNo.setText(sRef);
				
			}
		});
		frame.setBounds(0, 0, 1550, 840);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payroll Management System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 74));
		lblNewLabel.setBounds(49, 27, 1426, 110);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employer's Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(49, 173, 184, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee Ref. No.:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(49, 218, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Employee Name:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(49, 263, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Employee Address:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(49, 308, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Post Code:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(49, 353, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Inner City Weighting:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_5.setBounds(49, 449, 208, 35);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Basic Salary:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_6.setBounds(49, 494, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Over Time:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_7.setBounds(49, 539, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Gross Pay:");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_8.setBounds(49, 634, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Pensionable Pay:");
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_9.setBounds(49, 679, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("Net Pay:");
		lblNewLabel_1_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_10.setBounds(49, 724, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_10);
		
		txtEmployerName = new JTextField();
		txtEmployerName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmployerName.setBounds(255, 175, 156, 30);
		frame.getContentPane().add(txtEmployerName);
		txtEmployerName.setColumns(10);
		
		txtEmployeeNo = new JTextField();
		txtEmployeeNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmployeeNo.setColumns(10);
		txtEmployeeNo.setBounds(255, 220, 156, 30);
		frame.getContentPane().add(txtEmployeeNo);
		
		txtEmployeeName = new JTextField();
		txtEmployeeName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmployeeName.setColumns(10);
		txtEmployeeName.setBounds(255, 265, 156, 30);
		frame.getContentPane().add(txtEmployeeName);
		
		txtEmployeeAddress = new JTextField();
		txtEmployeeAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmployeeAddress.setColumns(10);
		txtEmployeeAddress.setBounds(255, 310, 156, 30);
		frame.getContentPane().add(txtEmployeeAddress);
		
		txtPostCode = new JTextField();
		txtPostCode.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPostCode.setColumns(10);
		txtPostCode.setBounds(255, 355, 156, 30);
		frame.getContentPane().add(txtPostCode);
		
		txtInnerCity = new JTextField();
		txtInnerCity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtInnerCity.setColumns(10);
		txtInnerCity.setBounds(255, 451, 156, 30);
		frame.getContentPane().add(txtInnerCity);
		
		txtBasicSalary = new JTextField();
		txtBasicSalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtBasicSalary.setColumns(10);
		txtBasicSalary.setBounds(255, 496, 156, 30);
		frame.getContentPane().add(txtBasicSalary);
		
		txtOverTime = new JTextField();
		txtOverTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtOverTime.setColumns(10);
		txtOverTime.setBounds(255, 541, 156, 30);
		frame.getContentPane().add(txtOverTime);
		
		txtGrossPay = new JTextField();
		txtGrossPay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtGrossPay.setColumns(10);
		txtGrossPay.setBounds(255, 636, 156, 30);
		frame.getContentPane().add(txtGrossPay);
		
		txtPensionable = new JTextField();
		txtPensionable.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPensionable.setColumns(10);
		txtPensionable.setBounds(255, 681, 156, 30);
		frame.getContentPane().add(txtPensionable);
		
		txtNetPay = new JTextField();
		txtNetPay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNetPay.setColumns(10);
		txtNetPay.setBounds(255, 726, 156, 30);
		frame.getContentPane().add(txtNetPay);
		
		JLabel lblNewLabel_1_11 = new JLabel("Pay Date:");
		lblNewLabel_1_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_11.setBounds(528, 173, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_11);
		
		JLabel lblNewLabel_1_12 = new JLabel("Tax Period:");
		lblNewLabel_1_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_12.setBounds(528, 263, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_12);
		
		JLabel lblNewLabel_1_13 = new JLabel("Tax Code:");
		lblNewLabel_1_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_13.setBounds(528, 308, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_13);
		
		JLabel lblNewLabel_1_14 = new JLabel("NI Code:");
		lblNewLabel_1_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_14.setBounds(528, 353, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_14);
		
		JLabel lblNewLabel_1_15 = new JLabel("NI Number:");
		lblNewLabel_1_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_15.setBounds(528, 398, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_15);
		
		JLabel lblNewLabel_1_16 = new JLabel("Deductions:");
		lblNewLabel_1_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_16.setBounds(528, 724, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_16);
		
		JLabel lblNewLabel_1_17 = new JLabel("Taxable Pay:");
		lblNewLabel_1_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_17.setBounds(528, 679, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_17);
		
		JLabel lblNewLabel_1_18 = new JLabel("NI Payments:");
		lblNewLabel_1_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_18.setBounds(528, 634, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_18);
		
		JLabel lblNewLabel_1_19 = new JLabel("Student Loan:");
		lblNewLabel_1_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_19.setBounds(528, 589, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_19);
		
		JLabel lblNewLabel_1_20 = new JLabel("Pension:");
		lblNewLabel_1_20.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_20.setBounds(528, 539, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_20);
		
		JLabel lblNewLabel_1_21 = new JLabel("Tax:");
		lblNewLabel_1_21.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_21.setBounds(528, 494, 184, 35);
		frame.getContentPane().add(lblNewLabel_1_21);
		
		JLabel lblNewLabel_1_11_1 = new JLabel("Pay Slip:");
		lblNewLabel_1_11_1.setBounds(1043, 176, 105, 29);
		frame.getContentPane().add(lblNewLabel_1_11_1);
		lblNewLabel_1_11_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(1030, 167, 409, 47);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(505, 167, 404, 49);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4.setBounds(49, 21, 1386, 116);
		frame.getContentPane().add(panel_4);
		
		final JComboBox cmbTaxPeriod = new JComboBox();
		cmbTaxPeriod.setFont(new Font("Tahoma", Font.BOLD, 18));
		cmbTaxPeriod.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cmbTaxPeriod.setBounds(722, 268, 156, 30);
		frame.getContentPane().add(cmbTaxPeriod);
		
		JComboBox cmbTaxCode = new JComboBox();
		cmbTaxCode.setFont(new Font("Tahoma", Font.BOLD, 18));
		cmbTaxCode.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E", "F", "G"}));
		cmbTaxCode.setBounds(722, 313, 156, 30);
		frame.getContentPane().add(cmbTaxCode);
		
		final JComboBox cmbNICode = new JComboBox();
		cmbNICode.setFont(new Font("Tahoma", Font.BOLD, 18));
		cmbNICode.setModel(new DefaultComboBoxModel(new String[] {"A0000", "A3000", "B4000", "C5000", "D6000", "E7000", "F8000", "G9000"}));
		cmbNICode.setBounds(722, 358, 156, 30);
		frame.getContentPane().add(cmbNICode);
		
		txtPayDate = new JTextField();
		txtPayDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPayDate.setColumns(10);
		txtPayDate.setBounds(722, 178, 156, 30);
		frame.getContentPane().add(txtPayDate);
		
		txtNINumber = new JTextField();
		txtNINumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNINumber.setColumns(10);
		txtNINumber.setBounds(722, 398, 156, 30);
		frame.getContentPane().add(txtNINumber);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTax.setColumns(10);
		txtTax.setBounds(722, 494, 156, 30);
		frame.getContentPane().add(txtTax);
		
		txtPension = new JTextField();
		txtPension.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPension.setColumns(10);
		txtPension.setBounds(722, 539, 156, 30);
		frame.getContentPane().add(txtPension);
		
		txtStudentLoan = new JTextField();
		txtStudentLoan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtStudentLoan.setColumns(10);
		txtStudentLoan.setBounds(722, 589, 156, 30);
		frame.getContentPane().add(txtStudentLoan);
		
		txtNIPayment = new JTextField();
		txtNIPayment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNIPayment.setColumns(10);
		txtNIPayment.setBounds(722, 634, 156, 30);
		frame.getContentPane().add(txtNIPayment);
		
		txtTaxablePay = new JTextField();
		txtTaxablePay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTaxablePay.setColumns(10);
		txtTaxablePay.setBounds(722, 679, 156, 30);
		frame.getContentPane().add(txtTaxablePay);
		
		txtDeductions = new JTextField();
		txtDeductions.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDeductions.setColumns(10);
		txtDeductions.setBounds(722, 724, 156, 30);
		frame.getContentPane().add(txtDeductions);
		
		rtfPaySlip = new JTextField();
		rtfPaySlip.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rtfPaySlip.setColumns(10);
		rtfPaySlip.setBounds(1048, 243, 377, 314);
		frame.getContentPane().add(rtfPaySlip);
		
		JButton btnNewWage = new JButton("New Wages");
		btnNewWage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double A00, A30, B40, C50, D60, E70, F80, G90, PensionablePay, TaxablePay;
				double deduction, Pension, StudentLoad, NIPayment, TotalDeduction, NetPay;
				
				InnerCity = Double.parseDouble(txtInnerCity.getText());
				BasicWage = Double.parseDouble(txtBasicSalary.getText());
				OverTime = Double.parseDouble(txtOverTime.getText());
				Gross = InnerCity + BasicWage + OverTime;
				String GrossPay = String.format("Rs.%.2f", Gross);
				txtGrossPay.setText(GrossPay);
				
				//===================================================================================
				
				try {
					
					if (cmbNICode.getSelectedItem().equals("A0000")) {
						A00 = (Gross*9)/100;
						deduction = Gross - A00;
						Pension = (deduction*12)/100;
						
						StudentLoad = Pension + A00;
						StudentLoad = Gross-StudentLoad;
						StudentLoad = (StudentLoad*5.7)/100;
						
						NIPayment = StudentLoad + Pension + A00;
						NIPayment = Gross - NIPayment;
						NIPayment = (NIPayment*4.2)/100;
						
						String TaxPaid = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String PensionPaid = String.format("%.2f", Pension);
						txtPension.setText(PensionPaid);
						txtPension.setText("Rs."+PensionPaid);
						
						String StudentLoanPaid = String.format("%.2f", StudentLoad);
						txtStudentLoan.setText(StudentLoanPaid);
						txtStudentLoan.setText("Rs."+StudentLoanPaid);
						
						String NIPaymentPaid = String.format("%.2f", NIPayment);
						txtNIPayment.setText(NIPaymentPaid);
						txtNIPayment.setText("Rs."+NIPaymentPaid);
						
						TotalDeduction = A00+Pension+StudentLoad+NIPayment;
						NetPay = Gross-TotalDeduction;
						
						String TDeduction = String.format("%.2f", TotalDeduction);
						txtDeductions.setText(TDeduction);
						txtDeductions.setText("Rs."+TDeduction);
						
						String TNetPay = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String TaxPeriod=cmbTaxPeriod.getSelectedItem().toString();
						TaxablePay=Double.parseDouble(TaxPeriod);
						PensionablePay=TaxablePay*Pension;
						TaxablePay=TaxablePay*A00;
						
						String PensionPayment = String.format("%.2f", PensionablePay);
						txtPensionable.setText(PensionPayment);
						txtPensionable.setText("Rs."+PensionPayment);
						
						String TaxablePayPayment = String.format("%.2f", TaxablePay);
						txtTaxablePay.setText(TaxablePayPayment);
						txtTaxablePay.setText("Rs."+TaxablePayPayment);
						 
						
					}
					
					else if (cmbNICode.getSelectedItem().equals("A3000")) {
						A30=3000/12;
						A00 = (Gross*9)/100;
						deduction = Gross - A00;
						Pension = (deduction*12)/100;
						
						StudentLoad = Pension + A00;
						StudentLoad = Gross-StudentLoad;
						StudentLoad = (StudentLoad*5.7)/100;
						
						NIPayment = StudentLoad + Pension + A00;
						NIPayment = Gross - NIPayment;
						NIPayment = (NIPayment*4.2)/100;
						
						String TaxPaid = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String PensionPaid = String.format("%.2f", Pension);
						txtPension.setText(PensionPaid);
						txtPension.setText("Rs."+PensionPaid);
						
						String StudentLoanPaid = String.format("%.2f", StudentLoad);
						txtStudentLoan.setText(StudentLoanPaid);
						txtStudentLoan.setText("Rs."+StudentLoanPaid);
						
						String NIPaymentPaid = String.format("%.2f", NIPayment);
						txtNIPayment.setText(NIPaymentPaid);
						txtNIPayment.setText("Rs."+NIPaymentPaid);
						
						TotalDeduction = A00+Pension+StudentLoad+NIPayment;
						NetPay = Gross-TotalDeduction;
						
						String TDeduction = String.format("%.2f", TotalDeduction);
						txtDeductions.setText(TDeduction);
						txtDeductions.setText("Rs."+TDeduction);
						
						String TNetPay = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String TaxPeriod=cmbTaxPeriod.getSelectedItem().toString();
						TaxablePay=Double.parseDouble(TaxPeriod);
						PensionablePay=TaxablePay*Pension;
						TaxablePay=TaxablePay*A00;
						
						String PensionPayment = String.format("%.2f", PensionablePay);
						txtPensionable.setText(PensionPayment);
						txtPensionable.setText("Rs."+PensionPayment);
						
						String TaxablePayPayment = String.format("%.2f", TaxablePay);
						txtTaxablePay.setText(TaxablePayPayment);
						txtTaxablePay.setText("Rs."+TaxablePayPayment);
						 
					}
					
					else if (cmbNICode.getSelectedItem().equals("B4000")) {
						B40=4000/12;
						A00 = (Gross*9)/100;
						deduction = Gross - A00;
						Pension = (deduction*12)/100;
						
						StudentLoad = Pension + A00;
						StudentLoad = Gross-StudentLoad;
						StudentLoad = (StudentLoad*5.7)/100;
						
						NIPayment = StudentLoad + Pension + A00;
						NIPayment = Gross - NIPayment;
						NIPayment = (NIPayment*4.2)/100;
						
						String TaxPaid = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String PensionPaid = String.format("%.2f", Pension);
						txtPension.setText(PensionPaid);
						txtPension.setText("Rs."+PensionPaid);
						
						String StudentLoanPaid = String.format("%.2f", StudentLoad);
						txtStudentLoan.setText(StudentLoanPaid);
						txtStudentLoan.setText("Rs."+StudentLoanPaid);
						
						String NIPaymentPaid = String.format("%.2f", NIPayment);
						txtNIPayment.setText(NIPaymentPaid);
						txtNIPayment.setText("Rs."+NIPaymentPaid);
						
						TotalDeduction = A00+Pension+StudentLoad+NIPayment;
						NetPay = Gross-TotalDeduction;
						
						String TDeduction = String.format("%.2f", TotalDeduction);
						txtDeductions.setText(TDeduction);
						txtDeductions.setText("Rs."+TDeduction);
						
						String TNetPay = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String TaxPeriod=cmbTaxPeriod.getSelectedItem().toString();
						TaxablePay=Double.parseDouble(TaxPeriod);
						PensionablePay=TaxablePay*Pension;
						TaxablePay=TaxablePay*A00;
						
						String PensionPayment = String.format("%.2f", PensionablePay);
						txtPensionable.setText(PensionPayment);
						txtPensionable.setText("Rs."+PensionPayment);
						
						String TaxablePayPayment = String.format("%.2f", TaxablePay);
						txtTaxablePay.setText(TaxablePayPayment);
						txtTaxablePay.setText("Rs."+TaxablePayPayment);
						 
					}
					
					else if (cmbNICode.getSelectedItem().equals("C5000")) {
						C50=5000/12;
						A00 = (Gross*9)/100;
						deduction = Gross - A00;
						Pension = (deduction*12)/100;
						
						StudentLoad = Pension + A00;
						StudentLoad = Gross-StudentLoad;
						StudentLoad = (StudentLoad*5.7)/100;
						
						NIPayment = StudentLoad + Pension + A00;
						NIPayment = Gross - NIPayment;
						NIPayment = (NIPayment*4.2)/100;
						
						String TaxPaid = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String PensionPaid = String.format("%.2f", Pension);
						txtPension.setText(PensionPaid);
						txtPension.setText("Rs."+PensionPaid);
						
						String StudentLoanPaid = String.format("%.2f", StudentLoad);
						txtStudentLoan.setText(StudentLoanPaid);
						txtStudentLoan.setText("Rs."+StudentLoanPaid);
						
						String NIPaymentPaid = String.format("%.2f", NIPayment);
						txtNIPayment.setText(NIPaymentPaid);
						txtNIPayment.setText("Rs."+NIPaymentPaid);
						
						TotalDeduction = A00+Pension+StudentLoad+NIPayment;
						NetPay = Gross-TotalDeduction;
						
						String TDeduction = String.format("%.2f", TotalDeduction);
						txtDeductions.setText(TDeduction);
						txtDeductions.setText("Rs."+TDeduction);
						
						String TNetPay = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String TaxPeriod=cmbTaxPeriod.getSelectedItem().toString();
						TaxablePay=Double.parseDouble(TaxPeriod);
						PensionablePay=TaxablePay*Pension;
						TaxablePay=TaxablePay*A00;
						
						String PensionPayment = String.format("%.2f", PensionablePay);
						txtPensionable.setText(PensionPayment);
						txtPensionable.setText("Rs."+PensionPayment);
						
						String TaxablePayPayment = String.format("%.2f", TaxablePay);
						txtTaxablePay.setText(TaxablePayPayment);
						txtTaxablePay.setText("Rs."+TaxablePayPayment);
						 
					}
					
					else if (cmbNICode.getSelectedItem().equals("D6000")) {
						D60=6000/12;
						A00 = (Gross*9)/100;
						deduction = Gross - A00;
						Pension = (deduction*12)/100;
						
						StudentLoad = Pension + A00;
						StudentLoad = Gross-StudentLoad;
						StudentLoad = (StudentLoad*5.7)/100;
						
						NIPayment = StudentLoad + Pension + A00;
						NIPayment = Gross - NIPayment;
						NIPayment = (NIPayment*4.2)/100;
						
						String TaxPaid = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String PensionPaid = String.format("%.2f", Pension);
						txtPension.setText(PensionPaid);
						txtPension.setText("Rs."+PensionPaid);
						
						String StudentLoanPaid = String.format("%.2f", StudentLoad);
						txtStudentLoan.setText(StudentLoanPaid);
						txtStudentLoan.setText("Rs."+StudentLoanPaid);
						
						String NIPaymentPaid = String.format("%.2f", NIPayment);
						txtNIPayment.setText(NIPaymentPaid);
						txtNIPayment.setText("Rs."+NIPaymentPaid);
						
						TotalDeduction = A00+Pension+StudentLoad+NIPayment;
						NetPay = Gross-TotalDeduction;
						
						String TDeduction = String.format("%.2f", TotalDeduction);
						txtDeductions.setText(TDeduction);
						txtDeductions.setText("Rs."+TDeduction);
						
						String TNetPay = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String TaxPeriod=cmbTaxPeriod.getSelectedItem().toString();
						TaxablePay=Double.parseDouble(TaxPeriod);
						PensionablePay=TaxablePay*Pension;
						TaxablePay=TaxablePay*A00;
						
						String PensionPayment = String.format("%.2f", PensionablePay);
						txtPensionable.setText(PensionPayment);
						txtPensionable.setText("Rs."+PensionPayment);
						
						String TaxablePayPayment = String.format("%.2f", TaxablePay);
						txtTaxablePay.setText(TaxablePayPayment);
						txtTaxablePay.setText("Rs."+TaxablePayPayment);
						 
					}
					
					else if (cmbNICode.getSelectedItem().equals("E7000")) {
						E70=7000/12;
						A00 = (Gross*9)/100;
						deduction = Gross - A00;
						Pension = (deduction*12)/100;
						
						StudentLoad = Pension + A00;
						StudentLoad = Gross-StudentLoad;
						StudentLoad = (StudentLoad*5.7)/100;
						
						NIPayment = StudentLoad + Pension + A00;
						NIPayment = Gross - NIPayment;
						NIPayment = (NIPayment*4.2)/100;
						
						String TaxPaid = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String PensionPaid = String.format("%.2f", Pension);
						txtPension.setText(PensionPaid);
						txtPension.setText("Rs."+PensionPaid);
						
						String StudentLoanPaid = String.format("%.2f", StudentLoad);
						txtStudentLoan.setText(StudentLoanPaid);
						txtStudentLoan.setText("Rs."+StudentLoanPaid);
						
						String NIPaymentPaid = String.format("%.2f", NIPayment);
						txtNIPayment.setText(NIPaymentPaid);
						txtNIPayment.setText("Rs."+NIPaymentPaid);
						
						TotalDeduction = A00+Pension+StudentLoad+NIPayment;
						NetPay = Gross-TotalDeduction;
						
						String TDeduction = String.format("%.2f", TotalDeduction);
						txtDeductions.setText(TDeduction);
						txtDeductions.setText("Rs."+TDeduction);
						
						String TNetPay = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String TaxPeriod=cmbTaxPeriod.getSelectedItem().toString();
						TaxablePay=Double.parseDouble(TaxPeriod);
						PensionablePay=TaxablePay*Pension;
						TaxablePay=TaxablePay*A00;
						
						String PensionPayment = String.format("%.2f", PensionablePay);
						txtPensionable.setText(PensionPayment);
						txtPensionable.setText("Rs."+PensionPayment);
						
						String TaxablePayPayment = String.format("%.2f", TaxablePay);
						txtTaxablePay.setText(TaxablePayPayment);
						txtTaxablePay.setText("Rs."+TaxablePayPayment);
						 
					}
					
					
					else if (cmbNICode.getSelectedItem().equals("F8000")) {
						F80=8000/12;
						A00 = (Gross*9)/100;
						deduction = Gross - A00;
						Pension = (deduction*12)/100;
						
						StudentLoad = Pension + A00;
						StudentLoad = Gross-StudentLoad;
						StudentLoad = (StudentLoad*5.7)/100;
						
						NIPayment = StudentLoad + Pension + A00;
						NIPayment = Gross - NIPayment;
						NIPayment = (NIPayment*4.2)/100;
						
						String TaxPaid = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String PensionPaid = String.format("%.2f", Pension);
						txtPension.setText(PensionPaid);
						txtPension.setText("Rs."+PensionPaid);
						
						String StudentLoanPaid = String.format("%.2f", StudentLoad);
						txtStudentLoan.setText(StudentLoanPaid);
						txtStudentLoan.setText("Rs."+StudentLoanPaid);
						
						String NIPaymentPaid = String.format("%.2f", NIPayment);
						txtNIPayment.setText(NIPaymentPaid);
						txtNIPayment.setText("Rs."+NIPaymentPaid);
						
						TotalDeduction = A00+Pension+StudentLoad+NIPayment;
						NetPay = Gross-TotalDeduction;
						
						String TDeduction = String.format("%.2f", TotalDeduction);
						txtDeductions.setText(TDeduction);
						txtDeductions.setText("Rs."+TDeduction);
						
						String TNetPay = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String TaxPeriod=cmbTaxPeriod.getSelectedItem().toString();
						TaxablePay=Double.parseDouble(TaxPeriod);
						PensionablePay=TaxablePay*Pension;
						TaxablePay=TaxablePay*A00;
						
						String PensionPayment = String.format("%.2f", PensionablePay);
						txtPensionable.setText(PensionPayment);
						txtPensionable.setText("Rs."+PensionPayment);
						
						String TaxablePayPayment = String.format("%.2f", TaxablePay);
						txtTaxablePay.setText(TaxablePayPayment);
						txtTaxablePay.setText("Rs."+TaxablePayPayment);
						 
					}
					
					else if (cmbNICode.getSelectedItem().equals("G9000")) {
						G90=9000/12;
						A00 = (Gross*9)/100;
						deduction = Gross - A00;
						Pension = (deduction*12)/100;
						
						StudentLoad = Pension + A00;
						StudentLoad = Gross-StudentLoad;
						StudentLoad = (StudentLoad*5.7)/100;
						
						NIPayment = StudentLoad + Pension + A00;
						NIPayment = Gross - NIPayment;
						NIPayment = (NIPayment*4.2)/100;
						
						String TaxPaid = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String PensionPaid = String.format("%.2f", Pension);
						txtPension.setText(PensionPaid);
						txtPension.setText("Rs."+PensionPaid);
						
						String StudentLoanPaid = String.format("%.2f", StudentLoad);
						txtStudentLoan.setText(StudentLoanPaid);
						txtStudentLoan.setText("Rs."+StudentLoanPaid);
						
						String NIPaymentPaid = String.format("%.2f", NIPayment);
						txtNIPayment.setText(NIPaymentPaid);
						txtNIPayment.setText("Rs."+NIPaymentPaid);
						
						TotalDeduction = A00+Pension+StudentLoad+NIPayment;
						NetPay = Gross-TotalDeduction;
						
						String TDeduction = String.format("%.2f", TotalDeduction);
						txtDeductions.setText(TDeduction);
						txtDeductions.setText("Rs."+TDeduction);
						
						String TNetPay = String.format("%.2f", A00);
						txtTax.setText(TaxPaid);
						txtTax.setText("Rs."+TaxPaid);
						
						String TaxPeriod=cmbTaxPeriod.getSelectedItem().toString();
						TaxablePay=Double.parseDouble(TaxPeriod);
						PensionablePay=TaxablePay*Pension;
						TaxablePay=TaxablePay*A00;
						
						String PensionPayment = String.format("%.2f", PensionablePay);
						txtPensionable.setText(PensionPayment);
						txtPensionable.setText("Rs."+PensionPayment);
						
						String TaxablePayPayment = String.format("%.2f", TaxablePay);
						txtTaxablePay.setText(TaxablePayPayment);
						txtTaxablePay.setText("Rs."+TaxablePayPayment);
						 
					}
					
					
					txtGrossPay.setText("Rs." + GrossPay);
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Enter a valid number", "Payroll System", 
							JOptionPane.INFORMATION_MESSAGE);
					
				}
				
				
				
				//====================================================================================
				
				String sInnerCity = String.format("Rs.%.2f", InnerCity);
				txtInnerCity.setText(sInnerCity);
				
				String sBasicWage = String.format("Rs.%.2f", BasicWage);
				txtBasicSalary.setText(sBasicWage);
				
				String sOverTime = String.format("Rs.%.2f", InnerCity);
				txtOverTime.setText(sOverTime);
			}
		});
		btnNewWage.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewWage.setBounds(1033, 599, 184, 65);
		frame.getContentPane().add(btnNewWage);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rtfPaySlip.setText(null);
				txtPayDate.setText(null);
				txtEmployerName.setText(null);
				txtEmployeeName.setText(null);
				txtEmployeeAddress.setText(null);
				txtEmployeeNo.setText(null);
				txtPostCode.setText(null);
				txtInnerCity.setText(null);
				txtBasicSalary.setText(null);
				txtOverTime.setText(null);
				txtGrossPay.setText(null);
				txtDeductions.setText(null);
				txtTax.setText(null);
				txtPension.setText(null);
				txtStudentLoan.setText(null);
				txtNIPayment.setText(null);
				txtNetPay.setText(null);
				txtNINumber.setText(null);
				txtPensionable.setText(null);
				txtTaxablePay.setText(null);
				
				
//============================================================================
				
				int refs=1325+(int)(Math.random()*4238);
				
				//============================================================================
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
				Tdate.format(timer.getTime());
				txtPayDate.setText(Tdate.format(timer.getTime()));
				
				String sRef = String.format("EMPNO"+ refs);
				txtEmployeeNo.setText(sRef);
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(1033, 689, 184, 65);
		frame.getContentPane().add(btnReset);
		
		JButton btnPaySlip = new JButton("Pay Slip");
		btnPaySlip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//==========================================================================================
				
				rtfPaySlip.setText("\tCasso.club\n");
				rtfPaySlip.setText("Emp.Ref: " + txtEmployeeNo.getText()+"Pay Date: "+ txtPayDate.getText()+"\n");
				rtfPaySlip.setText("Emp.Name: "+txtEmployeeName.getText()+"Tax Paid: " + txtTax.getText()+"\n");
				rtfPaySlip.setText("Inner City: "+txtInnerCity.getText()+ "Student Loan: "+txtStudentLoan.getText()+"\n");
				rtfPaySlip.setText("Basic Salary: "+txtBasicSalary.getText()+ "NI Payment: "+ txtNIPayment.getText()+"\n");
				rtfPaySlip.setText("Over Time: "+ txtOverTime.getText()+"Pensionable Pay: "+txtPensionable.getText()+"\n");
				rtfPaySlip.setText("Gross Pay: "+ txtGrossPay.getText()+ "Taxable Pay: "+ txtTaxablePay.getText()+"\n");
				rtfPaySlip.setText("Pension Paid: " + txtPension.getText()+ "Deductions: "+ txtDeductions.getText()+"\n");
				rtfPaySlip.setText("Net Pay: "+ txtNetPay.getText()+ "Tax Paid: "+ cmbNICode.getSelectedItem()+"\n");
				
				//==========================================================================================
			}
		});
		btnPaySlip.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPaySlip.setBounds(1261, 599, 184, 65);
		frame.getContentPane().add(btnPaySlip);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Payroll Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(1261, 689, 184, 65);
		frame.getContentPane().add(btnExit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(507, 243, 402, 218);
		frame.getContentPane().add(panel_3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(1035, 231, 404, 342);
		frame.getContentPane().add(panel);
		
		
		
		
	}
}
