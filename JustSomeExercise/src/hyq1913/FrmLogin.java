package hyq1913;

import javax.swing.*;

public class FrmLogin extends JFrame {

	// 声明组件
	private JPanel p;
	private JLabel name, pwd;
	private JTextField txtName;
	private JPasswordField txtPwd;
	private JButton btnOk, btnCancel;

	public FrmLogin() {
		
		super("登录");
		p = new JPanel();
		p.setLayout(null);
		
		// 实例化文本 按钮 文本框 密码框
		name = new JLabel("用户名");
		pwd = new JLabel("密码");
		txtName = new JTextField(20);
		txtPwd = new JPasswordField(20);
		txtPwd.setEchoChar('*');
		btnOk = new JButton("确定");
		btnCancel = new JButton("取消");
		
		// 设置控件位置
		name.setBounds(30, 30, 60, 25);
		txtName.setBounds(95, 30, 120, 25);
		pwd.setBounds(30, 60, 60, 25);
		txtPwd.setBounds(95, 60, 120, 25);
		btnOk.setBounds(30, 90, 60, 25);
		btnCancel.setBounds(125, 90, 60, 25);
		
		// 添加到容器中
		p.add(name);
		p.add(pwd);
		p.add(txtName);
		p.add(txtPwd);
		p.add(btnOk);
		p.add(btnCancel);
		
		this.add(p);
		this.setBounds(300, 300, 250, 170);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FrmLogin();
	}
}
