import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines() {
    stroke(0);
    noFill();

    // Draw bottom row boxes
    rect(0, 300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // Draw top row boxes
    rect(0, 0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }

  
  // Quadrant 1: create white squares covering the entire box
  public void draw_section1() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + intRow * 10;  
        intY = 300 + 3 + intColumn * 10;  
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Quadrant 2: create repeated black and white pattern vertically 
  public void draw_section2() {
    
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + 300 + intRow * 10;    
        intY = 300 + 3 + intColumn * 10;

        if(intRow % 2 == 1){
          fill(0);
        }
          else {
          fill(255);

        }

        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  } 

  // Quadrant 3: create repeated black and  white pattern horizontally
  public void draw_section3() {
    int intX = 0;
    int intY = 0;
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
      intX = 3 + 600 + intRow * 10;
      intY = 300 + 3 + intColumn * 10; 

      if(intColumn % 2 == 0){
        fill(0);
      }
      
        else{
        fill(255);
      }

      noStroke();
      rect(intX, intY, 5, 5);
   
      } 
    } 
  } 
      


  // Quadrant 4: create small black repeated borders around the white squares 
  public void draw_section4() {
    
    int intX = 0;
    int intY = 0;
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
       intX = 3 + 900 + intRow * 10;
       intY = 300 + 3 + intColumn * 10;
       fill(255);
       if(intColumn % 2 == 0 || intRow % 2 == 1){
        fill(0);
       } 

       noStroke();
       rect(intX, intY, 5, 5);
      }   
    } 
  }
      

  // Quadrant 5: create a slanted triangle on the right side of the box
  public void draw_section5() {
    int intX = 0;
    int intY = 0;
    int intGreater = 0; 

    for (int intRow = 29; intRow >= 1; intRow--){
      intGreater ++;
      for (int intColumn = 29; intColumn >= intGreater; intColumn--) {
        intX = intRow * 10 + 3;
        intY = intColumn * 10 + 3;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
      

  // Quadrant 6: create a slanted triangle facing the opposite side to the left 
  public void draw_section6() {
    int intX = 0;
    int intY = 0;
    int intGreater = -1;

    for (int intRow = 0; intRow <= 29; intRow ++){
      intGreater ++;
      for (int intColumn = 29; intColumn >= intGreater; intColumn--){
        intX = 303 + intRow * 10;
        intY = 3 + intColumn * 10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      } 
    } 
  }

      
  
// Quadrant 7: create a slanted triangle facing the top left corner
  public void draw_section7() {
    int intX = 0;
    int intY = 0;
    int intGreater = 30;

    for (int intRow = 0; intRow <= 30; intRow ++){
      intGreater --;
      for (int intColumn = 0; intColumn <=intGreater; intColumn++){
        intX = 600 + 3 + intRow * 10; 
        intY = 3 + intColumn * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5); 

      } 
    } 
  }
      
  
  
// Quadrant 8: create a slanted triangle facing the top right corner
  public void draw_section8() {
    int intX = 0;
    int intY = 0;
    int intGreater = 31;

    for (int intRow = 30; intRow >= 0; intRow --){
      intGreater --;
      for (int intColumn =0; intColumn<=intGreater; intColumn++){
        intX = 900 + 3 + intRow * 10;
        intY = 3 + intColumn * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5,5);
    
      } 
    } 
  } 
      




  

}