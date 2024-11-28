/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_proyecto;

import javax.swing.*;

/**
 *
 * @author Alumno
 */


public class Calculadora extends JFrame {
    
        private JTextField Cajadetexto = new JTextField("");

        private JButton boton1 = new JButton("1");
        private JButton boton2 = new JButton("2");
        private JButton boton3 = new JButton("3");
        private JButton boton4 = new JButton("4");
        private JButton boton5 = new JButton("5");
        private JButton boton6 = new JButton("6");
        private JButton boton7 = new JButton("7");
        private JButton boton8 = new JButton("8");
        private JButton boton9 = new JButton("9");
        private JButton boton0 = new JButton("0");
        private JButton botonsumar = new JButton("+");
        private JButton botonRestar = new JButton("-");
        private JButton botonMultiplicar = new JButton("*");
        private JButton botonDivision = new JButton("/");
        private JButton botonBorrar = new JButton("Ce");
        private JButton botonResultado = new JButton("=");
        
        public Calculadora(){
            setTitle("Calculadora"); //titulo de la ventana
             // alto ancho
            setSize(450, 450); //tamaño de ventana
            setLocationRelativeTo(null); //centrar la ventana
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        public void Componentes(JPanel panel){
           Cajadetexto.setBounds(20,20,400,50);
           panel.add(Cajadetexto);
           boton7.setBounds(20,70,75,75);
           panel.add(boton7);
           boton4.setBounds(20,145,75,75);
           panel.add(boton4);
           boton1.setBounds(20,220,75,75);
           panel.add(boton1);
           boton8.setBounds(95,70,75,75);
           panel.add(boton8);
           boton5.setBounds(95,145,75,75);
           panel.add(boton5);
           boton2.setBounds(95,220,75,75);
           panel.add(boton2);
           boton9.setBounds(170,70,75,75);
           panel.add(boton9);
           boton6.setBounds(170,145,75,75);
           panel.add(boton6);
           boton3.setBounds(170,220,75,75);
           panel.add(boton3);
            boton0.setBounds(95,294,75,75);
           panel.add(boton0);
           botonsumar.setBounds(245,220,75,75);
           panel.add(botonsumar);
           botonBorrar.setBounds(170,294,75,75);
           panel.add(botonBorrar);
           botonResultado.setBounds(245,294,75,75);
           panel.add(botonResultado);
           botonRestar.setBounds(245,145,75,75);
           panel.add(botonRestar);
           botonDivision.setBounds(245,70,75,75);
           panel.add(botonDivision);
           botonMultiplicar.setBounds(20,294,75,75);
           panel.add(botonMultiplicar);
}
        
        
        public static void main(String[] args){
             Calculadora ventana = new Calculadora();
            JPanel panel = new JPanel();
            panel.setLayout(null);
            ventana.getContentPane().add(panel);
            ventana.Componentes(panel);
            ventana.setVisible(true);
            
        }
        
}



