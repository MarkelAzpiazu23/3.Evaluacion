import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingLista extends JFrame implements ActionListener {
	
	
	JTextField textoCiudad;
	JButton btnanadirCiudad;
	
	DefaultListModel<String> modelo = new DefaultListModel<>();
	JList <String> listaCiudades = new JList <> (modelo);
	
	SwingLista(){
		

		listaCiudades = new JList();
		textoCiudad = new JTextField("Introduzca aquí una ciudad");
		btnanadirCiudad = new JButton("Introducir Ciudad");
		btnanadirCiudad.addActionListener(this);
		
		
		
		setLayout(null);
	
		String nuevaCiudad = new String(textoCiudad.getText());
		modelo = new DefaultListModel<>();
		listaCiudades = new JList<>(modelo);
		
		add(listaCiudades);
		add(textoCiudad);
		add(btnanadirCiudad);
		
		listaCiudades.setSize(200, 90);
		listaCiudades.setLocation(20, 20);
		
		textoCiudad.setSize(200, 100);
		textoCiudad.setLocation(300, 20);
		
		btnanadirCiudad.setSize(200, 100);
		btnanadirCiudad.setLocation(600, 20);
		
		setTitle("Lista de Paises");
		setSize(900,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==btnanadirCiudad) {
			String nuevaCiudad = new String(textoCiudad.getText());
	
			
			if(nuevaCiudad.equals("")) {
				JOptionPane.showMessageDialog(this, "Caja de texto Vacía,no se ha podido introducir tu ciudad"); //sale el mensaje de no se ha podido introducir
			}
		
			else {
			boolean esRepetido = false;
			for(int i = 0; i<modelo.size();i++) {
				if(modelo.getElementAt(i).equals(nuevaCiudad)) {
					esRepetido = true;
				}

			}
			if(esRepetido == false) 
				modelo.addElement(nuevaCiudad);
			if(esRepetido == true) 
				JOptionPane.showMessageDialog(this, "Esta Ciudad ya está en la lista,no se ha podido introducir tu ciudad"); //sale el mensaje de no se ha podido introducir
			}
		}
		
	}

	public static void main(String[] args) {
		
		new SwingLista();

	}

}
