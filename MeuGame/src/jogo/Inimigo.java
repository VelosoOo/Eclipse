package jogo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Inimigo {
	
	private Image imagem;
	private int x, y;
	private int largura, altura;
	private boolean isVisivel;
	
	private static int contador = 0;
	
	//constante
	private static final int LARGURA_TELA = 500;
	private static final int VELOCIDADE = 1;
	
	//construtor
	public Inimigo(int x, int y){
		this.x = x;
		this.y = y;
		

		ImageIcon referencia;
		System.out.println(contador);
		if(contador++ % 3 == 0){
			referencia = new ImageIcon("res\\inimigo.png");
			
		} else{
			
			referencia = new ImageIcon("res\\inimigo_2.png");
		}
		imagem = referencia.getImage();
		
		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);
		
		isVisivel = true;
		
		
	}
	
	public void mecher(){

		if(this.x < 0){
			this.x = LARGURA_TELA;
		}else{
			this.x -= VELOCIDADE;
		}
	}

	//get and set
	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public Image getImagem() {
		return imagem;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	//tratamento de colisão de jogo
	public Rectangle getBounds(){
		return new Rectangle(x, y, largura, altura);
	}

}
