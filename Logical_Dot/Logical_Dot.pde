void setup() {
 size(800, 800);
 
  
}

void draw() {
  ellipse(400, 400, 100, 100);
  if (mousePressed == true) {
    background(#F50C10);
    fill(#23FF08);
  }else {
    background(#23FF08);
    fill(#F50C10);
  }
  
}