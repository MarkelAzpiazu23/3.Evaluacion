
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Dado extends JFrame implements ActionListener, Runnable {

    private JLabel lblDado;

    private JButton btnLanzar;

    private boolean lanzamientoActivo;



    public Dado() {

        setTitle("Simulador de Dado");

        setSize(290, 210);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout()); // Establecer el layout manager

        

        lblDado = new JLabel("Dado: ");

        lblDado.setFont(new Font("Arial", Font.BOLD, 20));

        lblDado.setHorizontalAlignment(JLabel.CENTER);

        add(lblDado, BorderLayout.CENTER);



        btnLanzar = new JButton("Lanzar Dado");

        btnLanzar.addActionListener(this);

        add(btnLanzar, BorderLayout.SOUTH);



        lanzamientoActivo = false;

        

        setVisible(true); // Hacer visible después de configurar todos los componentes

    }



    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnLanzar) {

            if (!lanzamientoActivo) {

                lanzamientoActivo = true;

                Thread hiloDado = new Thread(this);

                hiloDado.start();

            } else {

                lanzamientoActivo = false;

            }

        }

    }



    private void stopLanzamiento() {

        lanzamientoActivo = false;

    }



    public void run() {

        int valorDado;

        do {

            try {

                Thread.sleep((long) (1000 * Math.random()));

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

            valorDado = (int) Math.floor(Math.random() * 6 + 1);

            lblDado.setText("Dado: " + valorDado);

        } while (valorDado != 6 && lanzamientoActivo);

        if (valorDado == 6) {

            stopLanzamiento();

            JOptionPane.showMessageDialog(null, "¡Has obtenido un 6!", "Resultado", JOptionPane.INFORMATION_MESSAGE);

        }

    }



    public static void main(String[] args) {

        new Dado();

    }

}