package jogo;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ContainerDeJanelas extends JFrame{
	public ContainerDeJanelas(){

//		add(new JButton("teste"));

		add(new Fase());

		//métodos básico
		setTitle("Meu Primeiro Jogo"); //titulo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //o que o X vai fazer
		setSize(500,400); //altura e largura
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContainerDeJanelas();
		
	}

}
