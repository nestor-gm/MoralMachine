package gui;

import game.Matrix;

import javax.swing.*;
import java.awt.*;


public class Information extends JPanel
{
	private Matrix info;
	private JButton button_start;
	private JButton button_exit;
	
	public Information()
	{ 
		this.info = null;
		this.add_characteristics(); 
		this.setVisible(true);

	}

	public void add_characteristics()
	{ 
		this.setLayout(null); 
		this.setSize(new Dimension(200,800)); 
		this.setLocation(600,0);
		this.setBackground(new Color(196,196,196));
		this.button_start = new JButton("Comenzar");
		this.button_exit = new JButton("Salir");
		this.add(button_start);
		this.add(button_exit);
		button_start.setBounds(45,330,100,20);
		button_exit.setBounds(45,360,100,20);
	}
	
	public JButton getButtonExit()
	{
		return this.button_exit;
	}
	
	public JButton getButtonStart()
	{
		return this.button_start;
	}
	
	public void setButtonStart(JButton button_start)
	{
		this.button_start = button_start;
	}
	
	public void setButtonExit(JButton button_exit)
	{
		this.button_exit = button_exit;
	}
	
	public void setMatrixInfo(Matrix info)
	{
		this.info = new Matrix(info.getM(),info.getN(),info.getnObs());
		this.info = info;
		for(int i = 0; i < this.info.getM(); i++)
		{
			for(int j = 0; j < this.info.getN(); j++)
			{
				System.out.println(this.info.getValue(i, j));

			}
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g1 = (Graphics2D) g;
		
		Font titulo1 = new Font("Verdana", Font.BOLD, 15);
		Font titulo2 = new Font("Verdana", Font.ITALIC, 15);
		Font texto = new Font("Verdana", Font.PLAIN, 10);
		g1.setFont(titulo1);
		g1.drawString("PANEL DE DATOS", 30, 20);
			g1.setFont(titulo2);
			g1.drawString("Tamaño de la matriz", 10, 50);
				g1.setFont(texto);
				g1.drawString("Filas (M): " + info.getM(), 10, 70);
				g1.drawString("Columnas (N): " + info.getN(), 10, 85);
				g1.drawString("Total de casillas (MxN): " + (info.getM() * info.getN()), 10, 100);
			g1.setFont(titulo2);
			g1.drawString("Obstaculos y personas", 10, 130);
				g1.setFont(texto);
				g1.drawString("% de obstaculos:" + info.getDificultad(), 10, 150);
				g1.drawString("Número de Conos:" + info.getConos(), 10, 165);
				g1.drawString("Número de Chicas:" + info.getChicas(), 10, 180);
				g1.drawString("Número de Chicos:" + info.getChicos(), 10, 195);
			g1.setFont(titulo2);
			g1.drawString("Malla: "+ info.getMalla(), 10, 225);
			g1.setFont(titulo2);
			g1.drawString("Estado actual", 10, 255);
				g1.setFont(texto);
				g1.drawString("Posición coche (x,y):", 10, 275);
				g1.drawString("Pasajeros recogidos:", 10, 290);
	}
	

}