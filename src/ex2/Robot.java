package ex2;

public class Robot {

	private  int x;
	private  int y;
	private  int orientation;
	
	public Robot(int a, int b,int orientation){
		this.x = a; this.y = b;this.orientation=orientation;
		}
    public void tourneraDroit() {
    if(this.orientation<4) {
    	this.orientation = this.orientation+1;
	    
    	
    }else {
    	this.orientation = 1;
    	
    }
    	
    	
    }
    public void avancer(){
    	switch (this.orientation) {
    	  case 1:
    	    this.y=this.y+1;
    	    break;
    	  case 2:
    		  this.x=this.x+1;
      	    break;
    	  case 3:
    		  this.y=this.y-1;
      	    break;
    	  case 4:
    		  this.x=this.x-1;
      	    break;
    	  default:
    	    System.out.println("No orientation");
    	}

    }
    
    public void afficheRobot() {
	    System.out.printf("la position est(%d,%d)",this.x,this.y);

    }
}
