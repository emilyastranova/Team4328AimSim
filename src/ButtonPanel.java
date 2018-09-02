import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

public class ButtonPanel extends JPanel {
	public JTextField speedField;
	public JTextField angleField;
	GroupLayout gl_buttonPanel;
	JPanel ImagePanel;
	JButton btnRunTest;

	/**
	 * Create the panel.
	 */
	public ButtonPanel() {
		setBounds(0, 596, 1264, 101);

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
		gl_buttonPanel = new GroupLayout(this);
		initGroupLayout();
		ImagePanel.setLayout(null);
		setLayout(gl_buttonPanel);
		setBackground(UIManager.getColor("Button.light"));

	}

	public void initGroupLayout() {
		gl_buttonPanel.setHorizontalGroup(gl_buttonPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_buttonPanel
				.createSequentialGroup()
				.addGroup(gl_buttonPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_buttonPanel.createSequentialGroup().addGap(22)
								.addGroup(gl_buttonPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(angleField, GroupLayout.PREFERRED_SIZE, 218,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(speedField, GroupLayout.PREFERRED_SIZE, 218,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_buttonPanel.createSequentialGroup().addGap(96).addComponent(btnRunTest)))
				.addGap(162).addComponent(ImagePanel, GroupLayout.PREFERRED_SIZE, 563, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(299, Short.MAX_VALUE)));
		gl_buttonPanel
				.setVerticalGroup(gl_buttonPanel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
						gl_buttonPanel.createSequentialGroup().addContainerGap()
								.addGroup(gl_buttonPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(ImagePanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 79,
												Short.MAX_VALUE)
										.addGroup(gl_buttonPanel.createSequentialGroup()
												.addComponent(speedField, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(angleField, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
												.addComponent(btnRunTest)))
								.addContainerGap()));
	}
}
