/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ar.com.conversor.pantallas;

/**
 *
 * @author Federico Moresi
 */
public class MenuPrincipal extends javax.swing.JFrame {

	/**
	 * Creates new form MenuPrincipal
	 */
	public MenuPrincipal() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		btnSalir = new javax.swing.JButton();
		btnMonedas = new javax.swing.JButton();
		btnTemperatura = new javax.swing.JButton();
		btnMedidas = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Conversor - Menu Principal");

		btnSalir.setText("Salir");
		btnSalir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalirActionPerformed(evt);
			}
		});

		btnMonedas.setText("Monedas");
		btnMonedas.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnMonedasActionPerformed(evt);
			}
		});

		btnTemperatura.setText("Temperatura");
		btnTemperatura.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnTemperaturaActionPerformed(evt);
			}
		});

		btnMedidas.setText("Medidas de Longitud");
		btnMedidas.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnMedidasActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jLabel1.setText("Seleccione el tipo de conversión que desea");
		jLabel1.setToolTipText("");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(32, 32, 32).addComponent(jLabel1))
						.addGroup(layout.createSequentialGroup().addGap(93, 93, 93).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 161,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(btnTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnMonedas, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 161,
												javax.swing.GroupLayout.PREFERRED_SIZE)))))
				.addContainerGap(35, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(17, 17, 17).addComponent(jLabel1)
										.addGap(18, 18, 18)
										.addComponent(btnMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(btnTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(btnMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(38, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void btnMonedasActionPerformed(java.awt.event.ActionEvent evt) {

		ConversorMonedas monedas = new ConversorMonedas();
		monedas.setVisible(true);
	}

	private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void btnTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {

		ConversorTemperatura temperatura = new ConversorTemperatura();
		temperatura.setVisible(true);
	}

	private void btnMedidasActionPerformed(java.awt.event.ActionEvent evt) {
		ConversorLongitud longitud = new ConversorLongitud();
		longitud.setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MenuPrincipal().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnMedidas;
	private javax.swing.JButton btnMonedas;
	private javax.swing.JButton btnSalir;
	private javax.swing.JButton btnTemperatura;
	private javax.swing.JLabel jLabel1;
	// End of variables declaration
}
