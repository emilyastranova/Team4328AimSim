import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.Timer;
import javax.swing.UIManager;

public class ButtonPanel extends JPanel implements ActionListener {
	public JTextField speedField;
	public JTextField angleField;
	GroupLayout gl_buttonPanel;
	JPanel ImagePanel;
	JButton btnRunTest;
	private JTextField xPosField;
	private JTextField yPosField;

	/**
	 * Create the panel.
	 */
	
	Timer loop = new Timer(10, this);
	
	public ButtonPanel() {
		setBounds(0, 596, 1264, 101);
		loop.start();
		btnRunTest = new JButton("Run test");

		speedField = new JTextField();
		speedField.setText("Speed: ");
		speedField.setEditable(false);
		speedField.setColumns(10);

		angleField = new JTextField();
		angleField.setText("Angle: ");
		angleField.setEditable(false);
		angleField.setColumns(10);

		ImagePanel = new ImagePanel();
		ImagePanel.setBackground(UIManager.getColor("Button.light"));
		
		xPosField = new JTextField();
		xPosField.setText("X Pos: ");
		xPosField.setEditable(false);
		xPosField.setColumns(10);
		
		yPosField = new JTextField();
		yPosField.setText("Y Pos: ");
		yPosField.setEditable(false);
		yPosField.setColumns(10);
		gl_buttonPanel = new GroupLayout(this);
		gl_buttonPanel.setHorizontalGroup(
			gl_buttonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttonPanel.createSequentialGroup()
					.addGroup(gl_buttonPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_buttonPanel.createSequentialGroup()
							.addGap(96)
							.addComponent(btnRunTest))
						.addGroup(gl_buttonPanel.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_buttonPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(angleField, Alignment.LEADING)
								.addComponent(speedField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_buttonPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(yPosField, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(xPosField, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))))
					.addGap(154)
					.addComponent(ImagePanel, GroupLayout.PREFERRED_SIZE, 563, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(299, Short.MAX_VALUE))
		);
		gl_buttonPanel.setVerticalGroup(
			gl_buttonPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_buttonPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_buttonPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(ImagePanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
						.addGroup(gl_buttonPanel.createSequentialGroup()
							.addGroup(gl_buttonPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(speedField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(xPosField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_buttonPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(angleField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(yPosField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addComponent(btnRunTest)))
					.addContainerGap())
		);
		ImagePanel.setLayout(null);
		setLayout(gl_buttonPanel);
		setBackground(UIManager.getColor("Button.light"));

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == loop) {
			xPosField.setText("Pos X: " + Main.vals.getRobotPosX());
			yPosField.setText("Y Pos: " + Main.vals.getRobotPosY());
		}
	}

}
