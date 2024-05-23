//Al importarlo varias veces, me han salido más imports de lo común
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingAumentarDecrementar extends JFrame implements ActionListener{

	JButton btnReducir,btnAumentar;
	JLabel lblValor;
	
	SwingAumentarDecrementar(){
		//Para que ponga más de un objeto (sino sale solo 1), de izquierda a dercha y si no hay más sitio a la dercha, se coloca debajo
		setLayout(new FlowLayout());
		btnReducir = new JButton("Reducir");
		lblValor = new JLabel ("0");
		btnAumentar = new JButton("Aumentar");
		
		add(btnReducir);
		add(lblValor);
		add(btnAumentar);

		//Para programar los 2 botones
		btnReducir.addActionListener(this);
		btnAumentar.addActionListener(this);
		
		setTitle("Contador Aumentar o Decrementar");
		setSize(500,200);
		setVisible(true);
		//cerrar ventana?
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) { //ActionEvent e sirve para emplear por ejemplo más de 1 botón
		int valor = Integer.parseInt(lblValor.getText());
		if(e.getSource()==btnReducir)
			valor--;
		else //como hay 2 botones programados, un else es suficiente, pq si no es uno es el otro
			valor++;
		lblValor.setText(String.valueOf(valor));
		
		int limites = Integer.parseInt(lblValor.getText());
		if( limites >= 10 )
			btnAumentar.setVisible(false);
		if( limites <= -10 )
			btnReducir.setVisible(false);

	}

	public static void main(String[] args) {
		SwingAumentarDecrementar aplicacion = new SwingAumentarDecrementar();
	}



		
}


