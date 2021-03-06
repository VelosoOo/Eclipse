package jogo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Missel {
	
	private Image imagem;
	private int x, y;
	private int largura, altura;
	private boolean isVisivel;
	
	
	//constante
	private static final int LARGURA_TELA = 500;
	private static final int VELOCIDADE = 2;
	
	//construtor
	public Missel(int x, int y){
		this.x = x;
		this.y = y;
		
	
		ImageIcon referencia = new ImageIcon("res\\missel.png");
		imagem = referencia.getImage();
		
		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);
		
		isVisivel = true;
		
		
	}
	
	public void mecher(){
		this.x += VELOCIDADE;
		if(this.x > LARGURA_TELA){
			isVisivel = false;
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

	public Rectangle getBounds(){
		return new Rectangle(x, y, largura, altura);
	}
}
