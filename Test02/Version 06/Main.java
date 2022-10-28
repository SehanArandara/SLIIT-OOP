package TEST02;

import java.util.Random;

// interface 
interface Alien{
	int getScore();
}

// class MARSHMALLONALIEN
class MarshmalloAlien implements Alien{
	// 15 marks return
	public int getScore() {
		return 15;
	}
}

// class OgreAlien
class OgreAlien implements Alien{
	//10 mark return
	public int getScore() {
		return 10;
	}
}

//class SnakAlien
class SnakAlien implements Alien{
	//5 mark return
	public int getScore() {
		return 5;
	}

}

//AlienPack
class AlienPack{
	Alien[] arr;
	//constructor
	AlienPack(int i){
		arr=new Alien[i];
	}
	//add alien method
	public void addAlien(Alien AL,int k) {
		arr[k]=AL;
	}
	
	// get Aliens which return alien array
	public Alien[] getAliens() {
		return arr;
	}
	//getter
	public Alien[] getArr() {
		return arr;
	}
	//setter
	public void setArr(Alien[] arr) {
		this.arr = arr;
	}
	
}
// class MeninBlack
class MeninBlack{
	int score;
	AlienPack ALP;
	//constructor
	MeninBlack(AlienPack Pack01){
		this.ALP = Pack01;
		this.score=0;
	}
	
	void kill() {
		Alien arr[]= ALP.getAliens();
		for(int i=0;i<arr.length;i++) {
			this.score+=arr[i].getScore();
		}
	}
}

//MeninBalcLeve2 class
class MenInBlackLevel2 extends MeninBlack{

	MenInBlackLevel2(AlienPack Pack01) {
		super(Pack01);
	}
	// overiide the kill method
	//hehe i can't override this one because i don't have full question
	void kill() {
		Alien arr[]= ALP.getAliens();
		for(int i=0;i<arr.length;i++) {
			this.score+=arr[i].getScore();
			
			Random r= new Random();
			
			if(r.nextInt()%2==1) {
				this.score-=2;
				
			}
		}
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		

	}

}
